package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;

public class SauvegardeGestionSuppleants {

    private static Logger logger = Logger.getLogger(SauvegardeGestionSuppleants.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnSauvegarder;
    private String waitEmail;


    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnSauvegarder(String btnSauvegarder) {
        this.btnSauvegarder = btnSauvegarder;
    }

    public void setWaitEmail(String waitEmail) {
        this.waitEmail = waitEmail;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  SAUVEGARDER SELECTION D'UN SUPPLEANT  ----------------------------\n");

        try {

            // Identification des étapes en base
            commum.incSauvegardeGestionSuppleants();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            // Bouton "Ajouter / modifier un suppléant"
            commum.ElementToBeClickable(btnSauvegarder);

            // Attente de visualisation de l'agent en absence
            commum.PresenceOfElementLocated(waitEmail);

            // Attente de la disparition de la page 'attente
            commum.BlockerScreen();

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getSauvegardeGestionSuppleants());


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
