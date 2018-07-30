package fr.ac.sirhen.easi.implement;


import com.mashape.unirest.http.exceptions.UnirestException;
import fr.ac.sirhen.easi.ICommum;
import fr.ac.sirhen.easi.IConnexion;
import fr.ac.sirhen.easi.implement.Ecran.*;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.core.har.HarEntry;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Commum implements ICommum {

    private int authentification = 0;
    private int espaceGestionnaire = 0;
    private int listeDemandesSuppleances = 0;
    private int declarerAbsence = 0;
    private int selectionEtablissement = 0;
    private int selectionAgentsAbsent = 0;
    private int gestionSuppleants = 0;
    private int choixSuppleants = 0;
    private int selectionSuppleant = 0;
    private int sauvegardeGestionSuppleants = 0;
    private int envoyerGestionSuppleants = 0;
    private int retour = 0;


    private static Logger logger = Logger.getLogger(Commum.class);
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static DateFormat dateFormatJson = new SimpleDateFormat("yyyy-MM-dd");
    private static GregorianCalendar gcal = new GregorianCalendar();


    private HashSet<String> agentEnAbs;
    private IConnexion connexion;
    private String decharge;
    private String idAgentDirecteur;
    private short agentDirecteur;
    private Date[] dteByAgent;
    private String nomEtablissement;
    private short idEtablissement;
    private short idAgent;
    private String dateDebutFin;
    private boolean agentValid;
    private String numAgent;
    private String nomAgent;
    private DbUtil dbUtil;
    private short startEtab;
    private short nbEtab;
    private String dteStart;
    private Date curDate;
    private boolean stat;
    private String urlApi;
    private String lstAgent;
    private String useCase;
    private String UV;


    public String getNumAgent() {
        return numAgent;
    }

    public void setNumAgent(String numAgent) {
        this.numAgent = numAgent;
    }

    public String getNomAgent() {
        return nomAgent;
    }

    public void setNomAgent(String nomAgent) {
        this.nomAgent = nomAgent;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public short getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(short idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public void IncIdEtablissement() {
        this.idEtablissement++;
    }

    public short getAgentDirecteur() {
        return agentDirecteur;
    }

    public void setAgentDirecteur(short agentDirecteur) {
        this.agentDirecteur = agentDirecteur;
    }

    public Date[] getDteByAgent() {
        return dteByAgent;
    }

    public void setDteByAgent(Date[] dteByAgent) {
        this.dteByAgent = dteByAgent;
    }

    public short getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(short idAgent) {
        this.idAgent = idAgent;
    }

    public String getDateDebutFin() {
        return dateDebutFin;
    }

    public void setDateDebutFin(String dateDebutFin) {
        this.dateDebutFin = dateDebutFin;
    }

    public boolean isAgentValid() {
        return agentValid;
    }

    public void setAgentValid(boolean agentValid) {
        this.agentValid = agentValid;
    }

    public void setDbUtil(DbUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    public short getStartEtab() {
        return startEtab;
    }

    public void setStartEtab(short startEtab) {
        this.startEtab = startEtab;
    }

    public short getNbEtab() {
        return nbEtab;
    }

    public void setNbEtab(short nbEtab) {
        this.nbEtab = nbEtab;
    }

    public void setStat(boolean stat) {
        this.stat = stat;
    }


    public String getDteStart() {
        return dteStart;
    }

    public void setDteStart(String dteStart) {

        this.dteStart = dteStart;

        try {
            this.curDate = sdf.parse(dteStart);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }


    public void setUrlApi(String urlApi) {
        this.urlApi = urlApi;
    }

    public void setLstAgent(String lstAgent) {
        this.lstAgent = lstAgent;
    }


    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public void setUV(String UV) {
        this.UV = UV;
    }

    public HashSet<String> getAgentEnAbs() {
        return agentEnAbs;
    }

    public void setAgentEnAbs(HashSet<String> agentEnAbs) {
        this.agentEnAbs = agentEnAbs;
    }

    public String FormatNomAgent(String s_agent) {
        return s_agent
                .replaceAll("Mme", "")
                .replaceAll("M\\.", "")
                .replaceAll("-", " ")
                .replaceAll("\\s+", " ").trim();
    }



    public void incAuthentification() {
        authentification++;
    }

    public void incEspaceGestionnaire() {
        espaceGestionnaire++;
    }

    public void incListeDemandesSuppleances() {
        listeDemandesSuppleances++;
    }

    public void incDeclarerAbsence() {
        declarerAbsence++;
    }

    public void incSelectionEtablissement() {
        selectionEtablissement++;
    }

    public void incSelectionAgentsAbsent() {
        selectionAgentsAbsent++;
    }

    public void incGestionSuppleants() {
        gestionSuppleants++;
    }

    public void incChoixSuppleants() {
        choixSuppleants++;
    }

    public void incSelectionSuppleant() {
        selectionSuppleant++;
    }

    public void incSauvegardeGestionSuppleants() {
        sauvegardeGestionSuppleants++;
    }

    public void incEnvoyerGestionSuppleants() {
        envoyerGestionSuppleants++;
    }

    public void incRetour() {
        retour++;
    }

    public int getAuthentification() {
        return authentification;
    }

    public int getEspaceGestionnaire() {
        return espaceGestionnaire;
    }

    public int getListeDemandesSuppleances() {
        return listeDemandesSuppleances;
    }

    public int getDeclarerAbsence() {
        return declarerAbsence;
    }

    public int getSelectionEtablissement() {
        return selectionEtablissement;
    }

    public int getSelectionAgentsAbsent() {
        return selectionAgentsAbsent;
    }

    public int getGestionSuppleants() {
        return gestionSuppleants;
    }

    public int getChoixSuppleants() {
        return choixSuppleants;
    }

    public int getSelectionSuppleant() {
        return selectionSuppleant;
    }

    public int getSauvegardeGestionSuppleants() {
        return sauvegardeGestionSuppleants;
    }

    public int getEnvoyerGestionSuppleants() {
        return envoyerGestionSuppleants;
    }

    public int getRetour() {
        return retour;
    }

    public void Initialize() {
        idEtablissement = 0;
        dteByAgent = new Date[1];
        dteByAgent[0] = null;
        nomEtablissement = "";
        numAgent = "0";
        nomAgent = "";
        useCase = "";
        agentEnAbs = new HashSet<>();
        ;
    }

    public IConnexion getConnexion() {
        return connexion;
    }

    public void setConnexion(IConnexion connexion) {
        this.connexion = connexion;
    }

    public String getDecharge() {
        return decharge;
    }

    public void setDecharge(String decharge) {
        this.decharge = decharge;
    }

    public String getIdAgentDirecteur() {
        return idAgentDirecteur;
    }

    public void setIdAgentDirecteur(String idAgentDirecteur) {
        this.idAgentDirecteur = idAgentDirecteur;
    }


    public void PresenceOfElementLocated(String s_xpath) {

        try {
            connexion.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            connexion.getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(s_xpath)));
            connexion.getDriver().manage().timeouts().implicitlyWait(connexion.getTimeout(), TimeUnit.SECONDS);

            try {
                Thread.sleep(connexion.getStepSleep());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (TimeoutException e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".PresenceOfElementLocated : " + e.getMessage());
            connexion.Finalize();
        } catch (Exception e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".PresenceOfElementLocated : " + e.getMessage());
            connexion.Finalize();
        }
    }


    public void BlockerScreen() {

        try {
            connexion.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            connexion.getWait().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='swl-blocker-screen']")));
            connexion.getDriver().manage().timeouts().implicitlyWait(connexion.getTimeout(), TimeUnit.SECONDS);

            try {
                Thread.sleep(connexion.getStepSleep());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (TimeoutException e) {
            logger.debug(getClass().getSimpleName() + " : " + e.getMessage());
            DbMessTrace(getClass().getSimpleName() + ".BlockerScreen : " + e.getMessage());
            connexion.Finalize();
        } catch (Exception e) {
            logger.debug(getClass().getSimpleName() + " : " + e.getMessage());
            DbMessTrace(getClass().getSimpleName() + ".BlockerScreen : " + e.getMessage());
            connexion.Finalize();
        }
    }


    public void ElementToBeClickable(String s_xpath) {

        try {
            connexion.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            connexion.getWait().until(ExpectedConditions.elementToBeClickable(By.xpath(s_xpath)));
            connexion.getDriver().manage().timeouts().implicitlyWait(connexion.getTimeout(), TimeUnit.SECONDS);

            try {
                Thread.sleep(connexion.getStepSleep());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            connexion.getDriver().findElement(By.xpath(s_xpath)).click();
        } catch (TimeoutException e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".ElementToBeClickable : " + e.getMessage());
            connexion.Finalize();
        } catch (Exception e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".ElementToBeClickable : " + e.getMessage());
            connexion.Finalize();
        }
    }


    public void VisibilityOfElementLocated(String s_xpath) {

        try {
            connexion.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            connexion.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s_xpath)));
            connexion.getDriver().manage().timeouts().implicitlyWait(connexion.getTimeout(), TimeUnit.SECONDS);

            try {
                Thread.sleep(connexion.getStepSleep());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            connexion.getDriver().findElement(By.xpath(s_xpath)).click();
        } catch (TimeoutException e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".VisibilityOfElementLocated : " + e.getMessage());
            connexion.Finalize();
        } catch (Exception e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".VisibilityOfElementLocated : " + e.getMessage());
            connexion.Finalize();
        }
    }


    public boolean EnConge(Date dte, boolean b_trace) throws Exception {

        // Exclusion des Week-end et des mercredis
        gcal.setTime(dte);
        if (gcal.get(gcal.DAY_OF_WEEK) == GregorianCalendar.SATURDAY ||
                gcal.get(gcal.DAY_OF_WEEK) == GregorianCalendar.SUNDAY ||
                gcal.get(gcal.DAY_OF_WEEK) == GregorianCalendar.WEDNESDAY) return true;

        boolean b_conge = false;

        HttpResponse<JsonNode> response = Unirest.get(urlApi + "/" + nomEtablissement.substring(0, 3) + "PR/vacances/" + nomEtablissement).
                header("Content-Type", "application/json").
                header("codeApplication", "99").
                queryString("dateObservation", sdf.format(curDate.getTime())).
                asJson();

        if (b_trace) logger.debug(response.getBody().getObject().toString(2));

        JSONParser parser = new JSONParser();

        if (b_trace) logger.debug("Date de comparaison (Vérif week-end): " + dateFormatJson.format(dte));

        try {
            Object obj = parser.parse(response.getBody().getObject().toString());
            JSONObject jsonObject = (JSONObject) obj;

            String s_dteRentreeScolaire = (String) jsonObject.get("dateRentreeScolaire");
            Date dteRentreeScolaire = dateFormatJson.parse(s_dteRentreeScolaire);
            b_conge = b_conge || ((dte.before(dteRentreeScolaire) || dte.equals(dteRentreeScolaire)) ? true : false);

            if (b_trace) logger.debug("quDate Rentree Scolaire : " + s_dteRentreeScolaire + " -> " + b_conge);


            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("periodeVacances");
            Iterator<JSONObject> iterator = msg.iterator();

            while (iterator.hasNext()) {
                JSONObject json = iterator.next();

                String s_libelle = (String) json.get("libellee");

                String s_dateDebut = (String) json.get("dateDebut");
                Date dateDebut = new SimpleDateFormat("yyyy-MM-dd").parse(s_dateDebut);

                String s_dateFin = (String) json.get("dateFin");
                Date dateFin = new SimpleDateFormat("yyyy-MM-dd").parse(s_dateFin);

                b_conge = b_conge || (((dte.after(dateDebut) && dte.before(dateFin)) || dte.equals(dateDebut) || dte.equals(dateFin)) ? true : false);

                if (b_trace)
                    logger.debug("\t" + s_libelle + " :  du " + s_dateDebut + " au " + s_dateFin + " -> " + b_conge);

                if (b_conge) return b_conge;
            }

            String s_dateSortieScolaire = (String) jsonObject.get("dateSortieScolaire");
            Date dateSortieScolaire = new SimpleDateFormat("yyyy-MM-dd").parse(s_dateSortieScolaire);

            b_conge = b_conge || ((dte.after(dateSortieScolaire) || dte.equals(dateSortieScolaire)) ? true : false);
            if (b_trace) logger.debug("Date Sortie Scolaire : " + s_dateSortieScolaire + " -> " + b_conge);

            if (dte.after(dateSortieScolaire) || dte.equals(dateSortieScolaire)) {
                logger.debug("DATE DE SORTIE SCOLAIRE : " + s_dateSortieScolaire + " -> IMPOSSIBILITE D'AFFECTER D'AGENT EN ABSENCE");
                connexion.Finalize();
            }

        } catch (ParseException e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".EnConge : " + e.getMessage());
        }

        return b_conge;
    }


    public void Directeur(boolean b_trace) {

        HttpResponse<JsonNode> response = null;

        try {
            response = Unirest.get(urlApi + "/" + nomEtablissement.substring(0, 3) + "PR/etablissement/" + nomEtablissement).
                    header("Content-Type", "application/json").
                    header("codeApplication", "99").
                    queryString("dateObservation", sdf.format(curDate)).
                    asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
            DbMessTrace(getClass().getSimpleName() + ".Directeur : " + e.getMessage());
        }

        if (b_trace) logger.debug(response.getBody().getObject().toString(2));

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(response.getBody().getObject().toString());
            JSONObject jsonObject = (JSONObject) obj;

            decharge = jsonObject.get("decharge").toString();
            logger.debug("Decharge : " + decharge);

            JSONObject directeur = (JSONObject) jsonObject.get("directeur");
            idAgentDirecteur = directeur.get("idAgent").toString();
            logger.debug("Agent : " + decharge);

        } catch (ParseException e) {
            logger.debug(getClass().getSimpleName() + " : " + e.getMessage());
            DbMessTrace(getClass().getSimpleName() + ".Directeur : " + e.getMessage());
        }
    }


    public void DateDispo() {

        List<WebElement> elements = connexion.getDriver().findElements(By.xpath(lstAgent));
        dteByAgent = new Date[elements.size() - 1];
        agentDirecteur = 0;


        logger.debug("Date courante : " + sdf.format(curDate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(curDate);

        for (short idConge = 1; idConge < elements.size(); idConge++) {

            // Recherche d'une date disponible
            if (idAgentDirecteur != null)
                if (idAgentDirecteur.trim().equals(elements.get(idConge).getAttribute("value").trim()))
                    agentDirecteur = idConge;

            try {
                // Recherche d'une date disponible
                while (EnConge(cal.getTime(), false)) {
                    cal.add(Calendar.DATE, 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
                DbMessTrace(getClass().getSimpleName() + ".DateDispo : " + e.getMessage());
            }

            // Date initiale de recherche du prochaine agent
            dteByAgent[idConge - 1] = cal.getTime();
            cal.add(Calendar.DATE, 1);

            logger.debug("\t\t - " + String.valueOf(idConge) + " - " + elements.get(idConge).getAttribute("value") + " - " + elements.get(idConge).getText() +
                    " - date : " + sdf.format(dteByAgent[idConge - 1]) + " - directeur : " + idAgentDirecteur + " (" + agentDirecteur + ")");
        }

    }


    public void HarEntry(String s_step, int i_step) {

        // https://github.com/lightbody/browsermob-proxy/issues/689

        if (stat) {

            String s_json = "";
            Har har = connexion.getBrowserProxy().getHar();
            List<HarEntry> entries = har.getLog().getEntries();
            for (HarEntry entry : entries) {


                String s_url = entry.getRequest().getUrl();

                if (s_url.indexOf("easirest") > -1 && entry.getResponse().getContent().getText() != null) {
                    s_json = entry.getResponse().getContent().getText();
                    if (s_json.length() > 0) {
                        try {
                            s_json.replaceAll("'", " ");
                        } catch (NullPointerException e) {
                            s_json = "";
                            e.printStackTrace();
                            DbMessTrace(getClass().getSimpleName() + ".HarEntry : " + e.getMessage());
                        }
                    }
                } else {
                    s_json = "";
                }


                logger.debug("-----------  " + s_step + "  -----------");
                logger.debug("Etablissement : " + nomEtablissement);
                logger.debug("NumAgent : " + numAgent);
                logger.debug("NomAgent : " + nomAgent);

                logger.debug("Url : " + s_url);
                logger.debug("Status : " + entry.getResponse().getStatus());
                logger.debug("StatusText : " + entry.getResponse().getStatusText());
                // logger.debug("BodyData : " + s_json);
                logger.debug("BodySize : " + entry.getResponse().getBodySize());
                logger.debug("Duration : " + entry.getTime());


                String s_SQL = "INSERT INTO EASI.STAT (TIMESTP,USECASE,UV,ETAB,NUMAGENT,NOMAGENT,INCSTEP,STEP,URL,DATASIZE,STATUS,STATUSTEXT,DURATION) VALUES (CURRENT_TIMESTAMP, '" +
                        useCase + "','" +
                        UV + "','" +
                        nomEtablissement + "'," +
                        numAgent + ",'" +
                        nomAgent + "'," +
                        i_step + ",'" +
                        s_step + "','" +
                        s_url + "'," +
                        (entry.getResponse().getBodySize() < 0 ? null : entry.getResponse().getBodySize()) + "," +
                        entry.getResponse().getStatus() + ",'" +
                        entry.getResponse().getStatusText() + "'," +
                        entry.getTime() + ")";

                try {
                    dbUtil.Insert(s_SQL);
                } catch (SQLException e) {
                    e.printStackTrace();
                    logger.debug(s_SQL);
                    connexion.Finalize();
                }

            }
        }
    }


    public void DbMessTrace(String sg_mess) {

        String s_SQL = "INSERT INTO EASI.STAT (TIMESTP,USECASE,UV,ETAB,NUMAGENT,NOMAGENT,MESS) VALUES (CURRENT_TIMESTAMP, '" +
                useCase + "','" +
                UV + "','" +
                nomEtablissement + "'," +
                numAgent + ",'" +
                nomAgent + "','" +
                (sg_mess.length() > 300 ? sg_mess.substring(0, 300).replaceAll("'", "\\\\'") : sg_mess.replaceAll("'", "\\\\'")) + "')";

        try {
            dbUtil.Insert(s_SQL);
        } catch (SQLException e) {
            logger.debug(s_SQL);
            e.printStackTrace();
        }

    }


}
