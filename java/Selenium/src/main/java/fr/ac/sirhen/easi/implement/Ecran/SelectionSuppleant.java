package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectionSuppleant {

    private static Logger logger = Logger.getLogger(SelectionSuppleant.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnPremier;
    private String fldDemiJour;
    private String btnTriNom;
    private String btnSuivant;
    private String btnLstSuppleant;

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnPremier(String btnPremier) {
        this.btnPremier = btnPremier;
    }

    public void setFldDemiJour(String fldDemiJour) {
        this.fldDemiJour = fldDemiJour;
    }

    public void setBtnTriNom(String btnTriNom) {
        this.btnTriNom = btnTriNom;
    }

    public void setBtnSuivant(String btnSuivant) {
        this.btnSuivant = btnSuivant;
    }

    public void setBtnLstSuppleant(String btnLstSuppleant) {
        this.btnLstSuppleant = btnLstSuppleant;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  SELECTION D'UN SUPPLEANT  ----------------------------\n");

        short idSuppl = commum.getIdEtablissement();
        short start = 0;

        try {

            // Identification des étapes en base
            commum.incSelectionSuppleant();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            // Retour à la première page
            Thread.sleep(connexion.getStepSleep());
            WebElement premier = connexion.getDriver().findElement(By.xpath(btnPremier));
            premier.click();


            // Sélection des '% de demi-journées possibles' à 100%
            Thread.sleep(connexion.getStepSleep());
            WebElement demiJour = connexion.getDriver().findElement(By.xpath(fldDemiJour));
            demiJour.clear();
            demiJour.click();
            demiJour.sendKeys("100");


            // Tri sur le champ 'Nom Usage'
            Thread.sleep(connexion.getStepSleep());
            commum.ElementToBeClickable(btnTriNom);


            // Pagination tous les 10 établissement/Suppléant (basée sur les suppléants)
            Thread.sleep(connexion.getStepSleep());
            for (short pg = 0; pg < ((idSuppl - 1) / 10); ++pg) {
                logger.debug("Suivant page : " + (pg));
                connexion.getDriver().findElement(By.xpath(btnSuivant)).click();
                start += 10;
                Thread.sleep(connexion.getStepSleep());
            }


            // Trace
            Thread.sleep(connexion.getStepSleep());
            logger.debug("Liste des suppléants de la page sélectionnée");
            List<WebElement> elements = connexion.getDriver().findElements(By.xpath(btnLstSuppleant));
            for (int i = 0; i < elements.size(); i++)
                logger.debug("\t" + String.valueOf(i + 1) + " - " + elements.get(i).getText());


            // Sélection d'un suppléant
            WebElement selSuppleant = connexion.getDriver().findElement(By.xpath(btnLstSuppleant+"[position()=" + (idSuppl - start) + "]"));
            logger.debug("Sélection du suppléant N°" + idSuppl + " : " + selSuppleant.getText());

            try {
                selSuppleant.click();
            } catch (ElementNotInteractableException e) {
                ((JavascriptExecutor) connexion.getDriver()).executeScript("arguments[0].click()", selSuppleant);
            }


            // Attente de la disparition de la page 'attente
            commum.BlockerScreen();

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getSelectionSuppleant());


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
