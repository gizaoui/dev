package fr.ac.sirhen.easi;


import fr.ac.sirhen.easi.implement.DbUtil;
import fr.ac.sirhen.easi.implement.Ecran.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestCreation {

    private static Logger logger = Logger.getLogger(TestCreation.class);

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private static boolean initDbTrace = true;

    // ==========================================================================
    //    CREATION D'UNE DEMANDE DE SUPPLEANCE AVEC SELECTION D'UN SUPPLEANT
    // ==========================================================================
    public static void Creation(String sg_useCase, String sg_UV, short st_startEtab, short st_nbEtab) {


        ApplicationContext context = new ClassPathXmlApplicationContext(
                sg_useCase + ".xml");

        DbUtil objDbUtil = (DbUtil) context.getBean("dbUtil");
        ICommum objComm = (ICommum) context.getBean("commum");


        Authentification objAuth = (Authentification) context.getBean("authentification");
        EspaceGestionnaire objEspGest = (EspaceGestionnaire) context.getBean("espaceGestionnaire");
        ListeDemandesSuppleances objLstDemSup = (ListeDemandesSuppleances) context.getBean("listeDemandesSuppleances");

        DeclarerAbsence objDeclAbs = (DeclarerAbsence) context.getBean("declarerAbsence");
        SelectionEtablissement objSelEtab = (SelectionEtablissement) context.getBean("selectionEtablissement");
        SelectionAgentsAbsent objSelAgAbs = (SelectionAgentsAbsent) context.getBean("selectionAgentsAbsent");
        Retour objRetour = (Retour) context.getBean("retour");
        GestionSuppleants objGestSup = (GestionSuppleants) context.getBean("gestionSuppleants");
        ChoixSuppleants objChoixSup = (ChoixSuppleants) context.getBean("choixSuppleants");
        SelectionSuppleant objSelSup = (SelectionSuppleant) context.getBean("selectionSuppleant");
        SauvegardeGestionSuppleants objSauvSup = (SauvegardeGestionSuppleants) context.getBean("sauvegardeGestionSuppleants");
        EnvoyerGestionSuppleants objEnvGestSup = (EnvoyerGestionSuppleants) context.getBean("envoyerGestionSuppleants");


        // ============= INITIALISATION DU TEST =============
//        if(initDbTrace) {
//            initDbTrace=false;
//            try {
//                objDbUtil.Truncate();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }

        objComm.setUseCase(sg_useCase);
        objComm.setUV(sg_UV);
        objComm.setStartEtab(st_startEtab);
        objComm.setNbEtab(st_nbEtab);
        // ==================================================


        objAuth.Initialize();
        objEspGest.Initialize();
        objLstDemSup.Initialize();


        ///////////////////////////////////
//        objComm.setIdEtablissement((short)0);
//        objDeclAbs.Initialize();
//        for (int i = 0; i < 10; ++i) {
//            objComm.IncIdEtablissement();
//            objSelEtab.Initialize();
//        }
        ///////////////////////////////////


        objComm.setIdEtablissement((short) (objComm.getStartEtab() - 1));


        Date[] d_etab = objComm.getDteByAgent();

        while (objComm.getIdEtablissement() < (objComm.getStartEtab() + objComm.getNbEtab() - 1) || d_etab[d_etab.length - 1] != null) {

            logger.debug("While : " + objComm.getIdEtablissement() + " < " + (objComm.getStartEtab() + objComm.getNbEtab() - 1));

            objComm.setNomEtablissement("");
            objComm.setNomAgent("");
            objComm.setNumAgent("0");

            // Ecran : "Déclarer absence / demande de suppléance"
            //  > Retourne la liste des établissement
            objDeclAbs.Initialize();

            d_etab = objComm.getDteByAgent();

            if (d_etab[d_etab.length - 1] == null) {
                objComm.IncIdEtablissement();
            }

            // Sélection d'un établissement de la page "Déclarer absence / demande de suppléance"
            //  > Retourne la liste des agents
            objSelEtab.Initialize();


            d_etab = objComm.getDteByAgent();

            if (d_etab[d_etab.length - 1] == null) {

                logger.debug("Liste des agents pour l'établissement : " + objComm.getNomEtablissement());

                // Recupération de l'agent directeur d l'établissement et de son pourcentage de décharge
                try {
                    objComm.Directeur(false);
                    logger.debug("Liste des agents pour l'établissement : " + objComm.getNomEtablissement() +
                            " - Directeur : " + objComm.getIdAgentDirecteur() + " - Décharge : " + objComm.getDecharge());
                } catch (Exception e) {
                    objComm.setIdAgentDirecteur(null);
                    objComm.setDecharge(null);
                }

                // Date disponibles pour l'établissement sélectionné
                objComm.DateDispo();
            }


            // Boucle jusqu'à obtenir une quotité égale à 100%
            boolean b_continue = false;
            d_etab = objComm.getDteByAgent();
            for (short ag = 1; ag < d_etab.length + 1; ag++) {

                b_continue = true;

                // Déclarer un agent en absence
                if (d_etab[ag - 1] == null) {
                    b_continue = false; //  /!\ si dernier
                    continue;
                }

                // Test si agent directeur
                logger.debug("Agent N°: " + ag + " - date : " + sdf.format(d_etab[ag - 1]) + " (directeur:" + (ag == objComm.getAgentDirecteur() ? "Y" : "N") + ")");
                if (ag == objComm.getAgentDirecteur()) {
                    d_etab[ag - 1] = null;
                    b_continue = false; //  /!\ si dernier
                    continue;
                }

                objComm.setIdAgent(ag);
                objComm.setDateDebutFin(sdf.format(d_etab[ag - 1]));
                objSelAgAbs.Initialize();
                d_etab[ag - 1] = null;


                d_etab = objComm.getDteByAgent();
                logger.debug("Dates d'asence affectée aux agents : " + d_etab.length);
                for (int idConge = 0; idConge < d_etab.length; ++idConge) {
                    logger.debug("\t " + (idConge + 1) + " - " + (d_etab[idConge] != null ? sdf.format(d_etab[idConge]) : "NULL") + " - Id agent directeur " + objComm.getAgentDirecteur());
                }


                if (objComm.getAgentEnAbs().contains(objComm.getNomAgent())) {
                    logger.debug("L'agent " + objComm.getNomAgent() + " a été traité");
                    b_continue = false; //  /!\ si dernier
                    continue;
                }


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Sélection d'un agent possédant une quotité égale à 100%
                if (!objComm.isAgentValid()) {
                    b_continue = false; //  /!\ si dernier
                    continue;
                } else {
                    logger.debug("Agent " + objComm.getNomAgent() + " (" + objComm.getNumAgent() + ") valide");
                    break;
                }
            }


            if (!b_continue) {
                objRetour.Initialize();
                objComm.setDteByAgent(new Date[1]);
                objComm.getDteByAgent()[0] = null;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                objComm.setNomAgent("");
                objComm.setNumAgent("0");
                continue;
            }


            // Ecran : "Gestion des Suppléants"
            objGestSup.Initialize();

            // Popup de sélection des "Choix des suppléants"
            objChoixSup.Initialize();

            // Sélection d'un suppléant dans la popup
            objSelSup.Initialize();


            ///////////////////////////////////
            // TEST :
            // - Mise en commentaire de la ligne 'objSelSup.Initialize();' ci-dessous
            // -  Mise en commentaire de la ligne premettant le tri ds la class 'SelectionSuppleant'
//            for (int i = 0; i < 500; ++i) {
//                objSelSup.Initialize();
//                objComm.IncIdEtablissement();
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.exit(0);
            ///////////////////////////////////


            // Sauvegarde du suppléant précédement sélectionné
            objSauvSup.Initialize();

            // Envoi de la damande
            objEnvGestSup.Initialize();

            logger.debug("> " + objComm.getIdEtablissement() + " < " + (objComm.getStartEtab() + objComm.getNbEtab()));

        } // while (objComm.getIdEtablissement() < (objComm.getStartEtab() + objComm.getNbEtab()));


        ((ClassPathXmlApplicationContext) context).close();


        logger.debug("Done");
    }



/*
    @Test
    public void testCreation_1_100() {
        Creation("creation", "1_100", (short) 1, (short) 100);
    }
*/



    @Test
    public void runAllTests() {

        Class<?>[] classes = {
                ParallelTest1.class
               ,ParallelTest2.class
               ,ParallelTest3.class
               ,ParallelTest4.class
               ,ParallelTest5.class
//             ,ParallelTest6.class
//             ,ParallelTest7.class
        };

        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }


    public static class ParallelTest1 {
        @Test
        public void test1a() {
            Creation("creation", "01_10", (short) 1, (short) 10);
        }
    }

    public static class ParallelTest2 {
        @Test
        public void test2a() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "11_20", (short) 11, (short) 20);
        }
    }

    public static class ParallelTest3 {
        @Test
        public void test3a() {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "21_30", (short) 21, (short) 30);
        }
    }

    public static class ParallelTest4 {
        @Test
        public void test4a() {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "31_40", (short) 31, (short) 40);
        }
    }

    public static class ParallelTest5 {
        @Test
        public void test5a() {
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "41_50", (short) 41, (short) 50);
        }
    }



    /*
    public static class ParallelTest6 {
        @Test
        public void test6a() {
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "51_60", (short) 51, (short) 60);
        }
    }

    public static class ParallelTest7 {
        @Test
        public void test7a() {
            try {
                Thread.sleep(35000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "61_70", (short) 61, (short) 70);
        }
    }


    public static class ParallelTest8 {
        @Test
        public void test8a() {
            try {
                Thread.sleep(40000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "71_80", (short) 71, (short) 80);
        }
    }


    public static class ParallelTest9 {
        @Test
        public void test9a() {
            try {
                Thread.sleep(45000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "81_90", (short) 81, (short) 90);
        }
    }

    public static class ParallelTest10 {
        @Test
        public void test10a() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Creation("creation", "81_90", (short) 81, (short) 90);
        }
    }
*/


}
