
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class BaseDeDatos {

 public static Connection  conectar (String Gestor, String usuario, String clave, String BBDD)  {
     Connection connection=null;
     String driver_oracle = "oracle.jdbc.driver.OracleDriver"; //ORACLE
     //String driver = "com.mysql.jdbc.Driver"; //MYSQL  anterior
     String driver_mysql = "com.mysql.cj.jdbc.Driver"; //MYSQL

     String cadena_mysql = "jdbc:mysql://localhost:3306/"+BBDD+"?serverTimezone=UTC";
    // String cadena_mysql = "jdbc:mysql://localhost:3306/prueba1?serverTimezone=UTC";
     String cadena_oracle="jdbc:oracle:thin:"+usuario+":"+clave+"@Localhost:1521:"+BBDD;

     try {
     switch (Gestor)
     {
     case "ORACLE" :
            Class.forName(driver_oracle);
            System.out.println("Driver probado y funcionando");
            connection=DriverManager.getConnection(cadena_oracle);
            System.out.println("Nos hemos conectado correctamente a la Base de Datos");
     case    "MYSQL":
            Class.forName(driver_mysql);
            System.out.println("Driver probado y funcionando");
            connection=DriverManager.getConnection(cadena_mysql, usuario,clave);
            System.out.println("Nos hemos conectado correctamente a la Base de Datos");
     case    "DB2":
     case    "SQLSERVER":
     }
     } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    return connection;

 }
 
}