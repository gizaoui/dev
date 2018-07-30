package fr.ac.sirhen.easi.implement.Ecran;

import com.sun.java.swing.plaf.motif.resources.motif;
import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectionAgentsAbsent {

    private static Logger logger = Logger.getLogger(SelectionAgentsAbsent.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnAgent;
    private String quotite;
    private String btnDteDeb;
    private String btnDteFin;
    private String btnMotif;
    private String validJourAbs;


    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnAgent(String btnAgent) {
        this.btnAgent = btnAgent;
    }

    public void setQuotite(String quotite) {
        this.quotite = quotite;
    }

    public void setBtnDteDeb(String btnDteDeb) {
        this.btnDteDeb = btnDteDeb;
    }

    public void setBtnDteFin(String btnDteFin) {
        this.btnDteFin = btnDteFin;
    }

    public void setBtnMotif(String btnMotif) {
        this.btnMotif = btnMotif;
    }

    public void setValidJourAbs(String validJourAbs) {
        this.validJourAbs = validJourAbs;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  AGENT EN ABSENCE  ----------------------------\n");

        short idAgent = commum.getIdAgent();
        String dateDebutFin = commum.getDateDebutFin();
        commum.setAgentValid(true);

        try {

            // Identification des étapes en base
            commum.incSelectionAgentsAbsent();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            // Sélection d'un agent
            WebElement selAgent = connexion.getDriver().findElement(By.xpath(btnAgent + "[position()=" + (idAgent + 1) + "]"));
            commum.setNumAgent(selAgent.getAttribute("value"));
            commum.setNomAgent(commum.FormatNomAgent(selAgent.getText()));


            logger.debug(" -> Eligibilité de l'agent N°" + idAgent + " : " + selAgent.getAttribute("value") + " - " + selAgent.getText());
            selAgent.click();

            // Attente d'une valeur quotité valide (>3 caractères)
            connexion.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            connexion.getWait().until(
                    new ExpectedCondition<Boolean>() {
                        public Boolean apply(WebDriver d) {
                            return (d.findElement(By.xpath(quotite)).getText().length() > 3);
                        }
                    }
            );
            connexion.getDriver().manage().timeouts().implicitlyWait(connexion.getTimeout(), TimeUnit.SECONDS);

            Thread.sleep(200);


            // Test la 'quotité' de l'agent (valide si 100 %)
            WebElement quot = connexion.getDriver().findElement(By.xpath(quotite));
            logger.debug(" -> Quotité : " + quot.getText());



            // Quotité égale à 100%
            if (quot.getText().indexOf("100") > -1) {

                // Date de début
                WebElement dteDeb = connexion.getDriver().findElement(By.xpath(btnDteDeb));
                dteDeb.clear();
                dteDeb.click();
                dteDeb.sendKeys(dateDebutFin);
                commum.BlockerScreen();

                // Date de fin
                WebElement dteFin = connexion.getDriver().findElement(By.xpath(btnDteFin));
                dteFin.clear();
                dteFin.click();
                dteFin.sendKeys(dateDebutFin);
                commum.BlockerScreen();

                // Motif de la demande
                WebElement motif = connexion.getDriver().findElement(By.xpath("//select[@formcontrolname='motif']"));
                Select select = new Select(motif);
                // select.selectByVisibleText("DDE DE SUPPL. POUR AUTRE MOTIF");
                select.selectByValue("AM");
                commum.BlockerScreen();


                try {
                    // Test le nbre d'heures de remplacement
                    Thread.sleep(connexion.getStepSleep());
                    connexion.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
                    connexion.getDriver().findElement(By.xpath(validJourAbs));
                    connexion.getDriver().manage().timeouts().implicitlyWait(connexion.getTimeout(), TimeUnit.SECONDS);
                    commum.setAgentValid(false);
                    logger.debug("Pas d'heure de remplacement");

                } catch (Exception nse) {
                    commum.setAgentValid(true);
                }

                Thread.sleep(connexion.getStepSleep());

            } else {
                commum.setNomAgent("");
                commum.setNumAgent("0");
                Thread.sleep(connexion.getStepSleep());
                // Quotité inférieur à 100%
                commum.setAgentValid(false);
            }

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getSelectionAgentsAbsent());

        } catch (Exception e) {
            e.printStackTrace();
            commum.DbMessTrace(getClass().getSimpleName()+".Initialize : " + e.getMessage());
            connexion.Finalize();
        }

        try {
            Thread.sleep(connexion.getStepSleep());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
