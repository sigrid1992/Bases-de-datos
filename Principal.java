import java.sql.Connection;
import java.sql.DriverManager;

public class Principal {

    public static void main(String args[]) {
        /* 
        String usuario = "root";
         String password = "root"; 
         Connection connection = null; 
         String host = "localhost"; //  "192.168.1.14"
         String puerto = "3306"; 
         String sid = "test";
         */ 
         //String driver = "oracle.jdbc.driver.OracleDriver"; //ORACLE
         //String driver = "com.mysql.jdbc.Driver"; //MYSQL antiguo
         String driver = "com.mysql.cj.jdbc.Driver"; //MYSQL 

         String cadena_mysql = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";

         //String cadena_oracle="jdbc:mysql://localhost:3306/"+BBDD+"?serverTimezone=UTC";

        try {
           Class.forName(driver); 
           System.out.println("Driver probado y funcionando");
           Connection con = DriverManager.getConnection(cadena_mysql, "root","root");
           System.out.println("Nos hemos conectado correctamente a la Base de Datos");

            } catch (Exception e) { e.printStackTrace();  } 
        } 
}