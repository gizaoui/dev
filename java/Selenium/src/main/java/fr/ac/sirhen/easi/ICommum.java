package fr.ac.sirhen.easi;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;

public interface ICommum {

    void Directeur(boolean b_trace);
    void setIdAgentDirecteur(String idAgentDirecteur);
    void setDecharge(String decharge);
    String getIdAgentDirecteur();
    String getDecharge();
    short getAgentDirecteur();

    void DateDispo();

    void HarEntry(String s_step, int i_step);
    void PresenceOfElementLocated(String s_xpath);
    void BlockerScreen();
    void ElementToBeClickable(String s_xpath);
    void VisibilityOfElementLocated(String s_xpath);

    String getNomEtablissement();
    void setNomEtablissement(String nomEtablissement);
    void setIdEtablissement(short idEtablissement);
    short getIdEtablissement();
    void IncIdEtablissement();

     short getIdAgent();
     void setIdAgent(short idAgent) ;


    String getDateDebutFin();
    void setDateDebutFin(String dateDebutFin);


    String getNumAgent();
    void setNumAgent(String numAgent);
    String getNomAgent();
    void setNomAgent(String nomAgent) ;
    void setAgentValid(boolean agentValid);
    boolean isAgentValid();
    Date[] getDteByAgent();
    void setDteByAgent(Date[] dteByAgent);

    short getStartEtab();
    void setStartEtab(short startEtab);
    short getNbEtab();
    void setNbEtab(short nbEtab);
    String getDteStart();

    String getUseCase();
    void setUseCase(String useCase);
    void setUV(String UV);

    HashSet<String> getAgentEnAbs();
    void setAgentEnAbs(HashSet<String> agentEnAbs);

    String FormatNomAgent(String s_agent);
    void DbMessTrace(String sg_mess);

    void incAuthentification();
    void incEspaceGestionnaire();
    void incListeDemandesSuppleances();
    void incDeclarerAbsence();
    void incSelectionEtablissement();
    void incSelectionAgentsAbsent();
    void incGestionSuppleants();
    void incChoixSuppleants();
    void incSelectionSuppleant();
    void incSauvegardeGestionSuppleants();
    void incEnvoyerGestionSuppleants();
    void incRetour();

    int getAuthentification();
    int getEspaceGestionnaire();
    int getListeDemandesSuppleances();
    int getDeclarerAbsence();
    int getSelectionEtablissement();
    int getSelectionAgentsAbsent();
    int getGestionSuppleants();
    int getChoixSuppleants();
    int getSelectionSuppleant();
    int getSauvegardeGestionSuppleants();
    int getEnvoyerGestionSuppleants();
    int getRetour();
}
