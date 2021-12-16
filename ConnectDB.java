package com.jinujawad.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ConnectDB {
	
	static void createtables() {
		Connection connection = null;
        String host="localhost";
        String port="5432";
        String db_name="posts";
        String username="postgres";
        String password="new_password";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            if (connection != null) {
                System.out.println("Connection OK");
                Statement stmt = connection.createStatement();
                String sql1 = "CREATE TABLE  IF NOT EXISTS PRODUCT" +
                   "(PROD CHAR(50) PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " +
                   " PRICE            INT     NOT NULL)";
                String sql2 = "CREATE TABLE  IF NOT EXISTS DEPOT " +
                "(DEP CHAR(50) PRIMARY KEY     NOT NULL," +
                " ADDR           TEXT    NOT NULL, " +
                " VOLUME          INT     NOT NULL)";
                String sql3 = "CREATE TABLE  IF NOT EXISTS STOCK " +
                "(PROD CHAR(50) PRIMARY KEY     NOT NULL," +
                " DEP           TEXT    NOT NULL, " +
                " QUANTITY            INT     NOT NULL)";
                
                stmt.executeUpdate(sql1);
                stmt.executeUpdate(sql2);
                stmt.executeUpdate(sql3);
                stmt.close();
                connection.close();
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	static void addvalues() {
		Connection connection = null;
        String host="localhost";
        String port="5432";
        String db_name="posts";
        String username="postgres";
        String password="new_password";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            if (connection != null) {
                
                Statement stmt = connection.createStatement();
                String sql4 = "INSERT INTO PRODUCT (PROD,NAME,PRICE) "+ "VALUES ('P1', 'TAPE', 2000 );";
                String sql5 = "INSERT INTO DEPOT (DEP,ADDR,VOLUME) "+ "VALUES ('D1', 'NEY YORK', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P1', 'L.A', 2000 );";
                String sql4 = "INSERT INTO PRODUCT (PROD,NAME,PRICE) "+ "VALUES ('P2', 'TV', 2000 );";
                String sql5 = "INSERT INTO DEPOT (DEP,ADDR,VOLUME) "+ "VALUES ('D2', 'NEY YORK', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P1', 'L.A', 2000 );";
                String sql4 = "INSERT INTO PRODUCT (PROD,NAME,PRICE) "+ "VALUES ('P3', 'VER', 2000 );";
                String sql5 = "INSERT INTO DEPOT (DEP,ADDR,VOLUME) "+ "VALUES ('D3', 'NEY YORK', 2000 );";
                String sql5 = "INSERT INTO DEPOT (DEP,ADDR,VOLUME) "+ "VALUES ('D4', 'NEY YORK', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P1', 'D2', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P3', '41', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P3', 'D4', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P2', 'D4', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P2', 'D1', 2000 );";
                String sql6 = "INSERT INTO STOCK (PROD,DEP,QUANTITY) "+ "VALUES ('P2', 'D2', 2000 );";
                stmt.executeUpdate(sql4);
                stmt.executeUpdate(sql5);
                stmt.executeUpdate(sql6);
                stmt.close();
                connection.close();
                System.out.println("added");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
    public static void main(String[] args) {
    	createtables();
    	addvalues();
    	
    }
}