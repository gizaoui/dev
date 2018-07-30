package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EnvoyerGestionSuppleants {

    private static Logger logger = Logger.getLogger(EnvoyerGestionSuppleants.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnEnvoyer;
    private String waitUserConn;

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnEnvoyer(String btnEnvoyer) {
        this.btnEnvoyer = btnEnvoyer;
    }

    public void setWaitUserConn(String waitUserConn) {
        this.waitUserConn = waitUserConn;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  ENVOYER SELECTION D'UN SUPPLEANT  ----------------------------\n");

        try {

            // Identification des étapes en base
            commum.incEnvoyerGestionSuppleants();
            commum.incListeDemandesSuppleances();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            commum.ElementToBeClickable(btnEnvoyer);


            commum.PresenceOfElementLocated(waitUserConn);

            // Attente de la disparition de la page 'attente
            commum.BlockerScreen();


            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getEnvoyerGestionSuppleants());


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
