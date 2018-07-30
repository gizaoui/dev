package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;

public class ChoixSuppleants {

    private static Logger logger = Logger.getLogger(ChoixSuppleants.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnAjoutModifSupp;
    private String waitLstChoixSuppPopup;

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnAjoutModifSupp(String btnAjoutModifSupp) {
        this.btnAjoutModifSupp = btnAjoutModifSupp;
    }

    public void setWaitLstChoixSuppPopup(String waitLstChoixSuppPopup) {
        this.waitLstChoixSuppPopup = waitLstChoixSuppPopup;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  CHOIX DES SUPPLEANT  ----------------------------\n");

        try {

            // Identification des étapes en base
            commum.incChoixSuppleants();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            // Bouton "Ajouter / modifier un suppléant"
            commum.ElementToBeClickable(btnAjoutModifSupp);

            // Attente de la valorisation de la liste des suppléants
            commum.PresenceOfElementLocated(waitLstChoixSuppPopup);

            // Attente de la disparition de la page 'attente
            commum.BlockerScreen();

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getChoixSuppleants() );

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
