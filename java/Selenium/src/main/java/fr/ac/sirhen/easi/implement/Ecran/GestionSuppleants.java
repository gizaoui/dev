package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;

public class GestionSuppleants {

    private static Logger logger = Logger.getLogger(GestionSuppleants.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnSuppleant;
    private String waitAgentSelect;

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnSuppleant(String btnSuppleant) {
        this.btnSuppleant = btnSuppleant;
    }

    public void setWaitAgentSelect(String waitAgentSelect) {
        this.waitAgentSelect = waitAgentSelect;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  GESTION DES SUPPLEANT  ----------------------------\n");

        try {

            // Identification des étapes en base
            commum.incGestionSuppleants();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            // Bouton "Suppléant(s)"
            commum.ElementToBeClickable(btnSuppleant);

            // Attente de visualisation de l'agent en absence
            commum.PresenceOfElementLocated(waitAgentSelect);

            // Attente de la disparition de la page 'attente
            commum.BlockerScreen();

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getGestionSuppleants());


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
