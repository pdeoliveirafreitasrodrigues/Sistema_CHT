import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDados {
	
	private String host = "localhost";
	private String database = "test"; // schema = database
	private String user = "admBDPOO";
	private String password = "";
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs;

	public BancoDados() {
		String strConn = "jdbc:mysql://" + this.host + "/" + this.database + "?" + "user=" + this.user + "&password="
				+ this.password;
		try {
			conn = DriverManager.getConnection(strConn);
			
			System.out.println("Conectado ao Banco de dados com Sucesso.");
			System.out.println("Host: " + host);
			System.out.println("Database: " + database);
			System.out.println("Administrador: " + user);
			
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	
	public static void main(String[] args) {
		
		BancoDados bd = new BancoDados();

	}
	

}
