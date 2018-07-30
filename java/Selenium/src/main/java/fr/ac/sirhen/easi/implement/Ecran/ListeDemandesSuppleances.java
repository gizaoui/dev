package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListeDemandesSuppleances {

    private static Logger logger = Logger.getLogger(ListeDemandesSuppleances.class);
    private IConnexion connexion;
    private ICommum commum;
    private String hrefSuppleance;
    private String waitUserConn;
    private String url;


    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setHrefSuppleance(String hrefSuppleance) {
        this.hrefSuppleance = hrefSuppleance;
    }

    public void setWaitUserConn(String waitUserConn) {
        this.waitUserConn = waitUserConn;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  LISTE DES DEMANDES DE SUPPLEANCES ET SUPPLEANCES  ----------------------------\n");

        try {

            // Identification des étapes en base (Une seule fois)
            commum.incListeDemandesSuppleances();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            connexion.getDriver().get(url);

            commum.PresenceOfElementLocated(waitUserConn);

            commum.BlockerScreen();


            try {
                // Test le nbre d'heures de remplacement
                Thread.sleep(connexion.getStepSleep());
                connexion.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
                connexion.getDriver().findElement(By.xpath("//tbody/tr[@class='rowSelectable']"));
                connexion.getDriver().manage().timeouts().implicitlyWait(connexion.getTimeout(), TimeUnit.SECONDS);

                commum.getAgentEnAbs().clear();


                logger.debug("Liste des agents pouvant être validés");
                List<WebElement> elements = connexion.getDriver().findElements(By.xpath("//tbody/tr[@class='rowSelectable']/td[position()=4]"));
                for (int etab = 0; etab < elements.size(); etab++) {
                    String agentAbs=commum.FormatNomAgent(elements.get(etab).getText());
                    commum.getAgentEnAbs().add(agentAbs);
                    logger.debug("\t- " + String.valueOf(etab + 1) + " - " + agentAbs);
                }

                logger.debug("Nb agent traité : " + commum.getAgentEnAbs().size());


            } catch (Exception nse) {
                logger.debug("Pas d'agent à valider");
            }


            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getListeDemandesSuppleances());

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
