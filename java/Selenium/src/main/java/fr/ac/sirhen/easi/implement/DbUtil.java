package fr.ac.sirhen.easi.implement;


import org.apache.log4j.Logger;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class DbUtil {

    private static Logger logger = Logger.getLogger(DbUtil.class);
    private DataSource dataSource;
    private List initQueryList;


    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setInitQueryList(List initQueryList) {
        this.initQueryList = initQueryList;
    }

    /*
    CREATE TABLE STAT  (
        ID INT(10) unsigned NOT NULL AUTO_INCREMENT,
        TIMESTP TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE
        CURRENT_TIMESTAMP,
        USECASE VARCHAR(50),
        UV VARCHAR(50),
        ETAB VARCHAR(10),
        NUMAGENT SMALLINT(5) unsigned,
        NOMAGENT VARCHAR(50),
        STEP VARCHAR(50),
        URL VARCHAR(500),
        DATASIZE INT(10) unsigned,
        STATUS SMALLINT(5) unsigned,
        STATUSTEXT VARCHAR(40),
        DURATION INT(10) unsigned,
        MESS VARCHAR(1000),
        PRIMARY KEY (ID)
    )
    ENGINE=InnoDB DEFAULT CHARSET=latin1;

    * */

    public void Truncate() throws SQLException {

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        logger.debug("Initialisation de la table de collect des données statistiques");
        for (Object qry : initQueryList) {
            logger.debug("\t - " + qry);
            statement.executeUpdate((String) qry);
        }

        statement.close();
        connection.close();
    }


    public void Insert(String s_qry) throws SQLException {

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        statement.executeUpdate(s_qry);

        statement.close();
        connection.close();

    }

}
