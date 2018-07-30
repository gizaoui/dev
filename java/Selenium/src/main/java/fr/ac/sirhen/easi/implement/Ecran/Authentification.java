package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Authentification {

    private static Logger logger = Logger.getLogger(Authentification.class);

    private IConnexion connexion;
    private ICommum commum;
    private String url;

    private String userXpath;
    private String passwdXpath;
    private String passwd;


    private boolean directeur;

    private String userDir;
    private String userAdm;




    public IConnexion getConnexion() {
        return connexion;
    }

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public void setUserXpath(String userXpath) {
        this.userXpath = userXpath;
    }

    public void setPasswdXpath(String passwdXpath) {
        this.passwdXpath = passwdXpath;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


    // Sélection : 'Directeur' (true) ou 'Administrateur' (false)

    public boolean isDirecteur() {
        return directeur;
    }

    public void setDirecteur(boolean directeur) {
        this.directeur = directeur;
    }


    // Agent directeur

    public String getUserDir() {
        return userDir;
    }

    public void setUserDir(String userDir) {
        this.userDir = userDir;
    }


    //  Agent administrateur

    public String getUserAdm() {
        return userAdm;
    }

    public void setUserAdm(String userAdm) {
        this.userAdm = userAdm;
    }





    public void Initialize() {

        logger.debug("\n\n\n----------------------------  LOGON  ----------------------------\n");

        try {

            // Identification des étapes en base
            commum.incAuthentification();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            connexion.getDriver().get(url);

            WebElement login = connexion.getDriver().findElement(By.xpath(userXpath));
            login.clear();
            login.click();
            login.sendKeys((directeur?userDir:userAdm));

            WebElement password = connexion.getDriver().findElement(By.xpath(passwdXpath));
            password.clear();
            password.click();
            password.sendKeys(passwd);

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getAuthentification());


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
