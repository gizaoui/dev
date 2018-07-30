package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;

public class DeclarerAbsence {

    private static Logger logger = Logger.getLogger(DeclarerAbsence.class);
    private IConnexion connexion;
    private ICommum commum;
    private String btnDemanderSuppleance;
    private String waitListEtablissement;
    private String waitUserConn;
    private String waitMenuRechercher;


    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setBtnDemanderSuppleance(String btnDemanderSuppleance) {
        this.btnDemanderSuppleance = btnDemanderSuppleance;
    }

    public void setWaitListEtablissement(String waitListEtablissement) {
        this.waitListEtablissement = waitListEtablissement;
    }

    public void setWaitUserConn(String waitUserConn) {
        this.waitUserConn = waitUserConn;
    }

    public void setWaitMenuRechercher(String waitMenuRechercher) {
        this.waitMenuRechercher = waitMenuRechercher;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  DECLARER ABSENCE  ----------------------------\n");

        try {

            // Identification des étapes en base
            commum.incDeclarerAbsence();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            // Bouton demander une suppléance
            commum.ElementToBeClickable(btnDemanderSuppleance);

            // Attente de valorisation de la liste des établissements
            commum.PresenceOfElementLocated(waitListEtablissement);

            // Attente de l'apparition du chef d'établissement
            commum.PresenceOfElementLocated(waitUserConn);

            // Attente du la flèche du menu des établisssements
            commum.PresenceOfElementLocated(waitMenuRechercher);


            // Attente de la disparition de la page 'attente
            commum.BlockerScreen();

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getDeclarerAbsence());


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
