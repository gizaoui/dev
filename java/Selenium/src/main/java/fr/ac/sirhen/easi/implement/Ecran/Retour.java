package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;

public class Retour {

    private static Logger logger = Logger.getLogger(Retour.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnRetour;
    private String waitPopup;
    private String btnPopupNon;

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnRetour(String btnRetour) {
        this.btnRetour = btnRetour;
    }

    public void setWaitPopup(String waitPopup) {
        this.waitPopup = waitPopup;
    }

    public void setBtnPopupNon(String btnPopupNon) {
        this.btnPopupNon = btnPopupNon;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  RETOUR DEMANDE SUPPLEANT  ----------------------------\n");

        try {

            // Identification des étapes en base
            commum.incRetour();
            commum.incListeDemandesSuppleances();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            // Bouton "Ajouter / modifier un suppléant"
            commum.ElementToBeClickable(btnRetour);

            commum.PresenceOfElementLocated(waitPopup);

            // Attente de la disparition de la page 'attente
            commum.BlockerScreen();

            commum.ElementToBeClickable(btnPopupNon);

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getRetour());

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
