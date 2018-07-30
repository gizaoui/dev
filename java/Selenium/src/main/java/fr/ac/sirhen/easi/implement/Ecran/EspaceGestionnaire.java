package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EspaceGestionnaire {

    private static Logger logger = Logger.getLogger(EspaceGestionnaire.class);

    private IConnexion connexion;
    private ICommum commum;
    private String btnValider;
    private String hrefDeploiRemplacement;
    private String hrefRemplacement;


    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnValider(String btnValider) {
        this.btnValider = btnValider;
    }

    public void setHrefDeploiRemplacement(String hrefDeploiRemplacement) {
        this.hrefDeploiRemplacement = hrefDeploiRemplacement;
    }

    public void setHrefRemplacement(String hrefRemplacement) {
        this.hrefRemplacement = hrefRemplacement;
    }

    public void Initialize()  {

        logger.debug("\n\n\n----------------------------  ESPACE GESTIONNAIRE ---------------------------- \n");

        try {

            // Identification des étapes en base
            commum.incEspaceGestionnaire();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            connexion.getDriver().findElement(By.xpath(btnValider)).click();

            commum.PresenceOfElementLocated(hrefDeploiRemplacement);

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getEspaceGestionnaire());

        } catch (Exception e) {
            e.printStackTrace();
            commum.DbMessTrace(getClass().getSimpleName()+".Initialize : " + e.getMessage());
            connexion.Finalize();
        }

//        if(hrefRemplacement!=null)
//            connexion.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.linkText(hrefRemplacement))).click();

        try {
            Thread.sleep(connexion.getStepSleep());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
