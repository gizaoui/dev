package fr.ac.sirhen.easi.implement.Ecran;

import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectionEtablissement {

    private static Logger logger = Logger.getLogger(SelectionEtablissement.class);
    private IConnexion connexion;
    private ICommum commum;
    private String menuRechercher;
    private String openMenuRechercher;
    private String btnPremiere;
    private String btnSuivant;
    private String lstEtablissement;
    private String btnEtablissement;
    private String waitLstAgent;

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public void setCommum(ICommum commum) {
        this.commum = commum;
    }

    public void setMenuRechercher(String menuRechercher) {
        this.menuRechercher = menuRechercher;
    }

    public void setOpenMenuRechercher(String openMenuRechercher) {
        this.openMenuRechercher = openMenuRechercher;
    }

    public void setBtnPremiere(String btnPremiere) {
        this.btnPremiere = btnPremiere;
    }

    public void setBtnSuivant(String btnSuivant) {
        this.btnSuivant = btnSuivant;
    }

    public void setLstEtablissement(String lstEtablissement) {
        this.lstEtablissement = lstEtablissement;
    }

    public void setBtnEtablissement(String btnEtablissement) {
        this.btnEtablissement = btnEtablissement;
    }

    public void setWaitLstAgent(String waitLstAgent) {
        this.waitLstAgent = waitLstAgent;
    }

    public void Initialize() {

        logger.debug("\n\n\n----------------------------  SELECTION D'UN ETABLISSEMENT  ----------------------------\n");


        short idEtab = commum.getIdEtablissement();
        short start = 0;
        List<WebElement> elements;


        try {

            // Identification des étapes en base
            commum.incSelectionEtablissement();

            connexion.getBrowserProxy().newHar(getClass().getSimpleName());

            logger.debug("SelectionEtablissement " + idEtab);

            // Test si la liste de "Rechercher l'établissement" est déployée
            if (connexion.getDriver().findElement(By.xpath(menuRechercher)).getAttribute("class").indexOf("down") > 0) {
                // Ouverture de la liste "Rechercher l'établissement"
                // connexion.getDriver().findElement(By.xpath(openMenuRechercher)).click();
                connexion.getDriver().findElement(By.xpath(menuRechercher)).click();
                // Positionnement sur la première page
                connexion.getDriver().findElement(By.xpath(btnPremiere)).click();
            }


            for (short pg = 0; pg < ((idEtab - 1) / 10); ++pg) {
                // Thread.sleep(1000);
                logger.debug("  Suivant page : " + (pg));
                connexion.getDriver().findElement(By.xpath(btnSuivant)).click();
                start += 10;
                Thread.sleep(connexion.getStepSleep());
            }

            // Affichage de la liste des établissements
            logger.debug("Liste des établissements page ");
            elements = connexion.getDriver().findElements(By.xpath(lstEtablissement));
            for (int etab = 0; etab < elements.size(); etab++)
                logger.debug("\t- " + String.valueOf(etab + 1) + " - " + elements.get(etab).getText());


            // Sélection d'un établissement
            logger.debug("Sélection de l'établissement N°" + (idEtab - start));
            WebElement selEtablissement = connexion.getDriver().findElement(By.xpath(btnEtablissement + "[position()=" + (idEtab - start) + "]"));
            logger.debug("\t\t> " + selEtablissement.getText());
            String[] s_tblEtab = selEtablissement.getText().split(" ");
            commum.setNomEtablissement(s_tblEtab[0].trim());

            try {
                selEtablissement.click();
            } catch (ElementNotInteractableException e) {
                ((JavascriptExecutor) connexion.getDriver()).executeScript("arguments[0].click()", selEtablissement);
            }


            // Attente de la valorisation de la liste des agents faisant suite à la sélection d'un établissement
            commum.PresenceOfElementLocated(waitLstAgent);

            // Données d'exploitation des requête http
            commum.HarEntry(getClass().getSimpleName(), commum.getSelectionEtablissement());

        } catch (Exception e) {
            e.printStackTrace();
            commum.DbMessTrace(getClass().getSimpleName() + ".Initialize : " + e.getMessage());
            connexion.Finalize();
        }

        try {
            Thread.sleep(connexion.getStepSleep());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
