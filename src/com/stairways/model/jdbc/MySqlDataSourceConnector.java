package com.stairways.model.jdbc;

import javax.naming.NamingException;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * Created by matvey on 21.10.14.
 */

public class MySqlDataSourceConnector {

        private DataSource datasource;
        private static MySqlDataSourceConnector conMgr = null;

        private MySqlDataSourceConnector() {

            try {
                InitialContext cxt = new InitialContext();
                if (cxt == null) {
                    throw new Exception("There is no context setup in project!");
                }

                datasource = (DataSource) cxt.lookup("java:/comp/env/jdbc/MySqlDB");
                if (datasource == null) {
                    throw new Exception("Data source not found!");
                }
            } catch (NamingException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public static MySqlDataSourceConnector getInstance() {
            if (conMgr == null) {
                conMgr = new MySqlDataSourceConnector();
            }
            return conMgr;
        }

        public static Connection getConnection() {
            Connection result = null;
            try {
                result = getInstance().datasource.getConnection();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            return result;
        }

    }