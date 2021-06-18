import java.sql.Connection;
import java.sql.DriverManager;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		connection=BaseDeDatos.conectar("MYSQL", "root", "root", "sakila");
	}
}
		

