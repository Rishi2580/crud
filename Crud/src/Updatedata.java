import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Updatedata {
	public static void update() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/rishi";
		String username = "root";
		String password = "2580";
		String Query = "update stud set pass ='shalmaan' where id = 1";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close(); 
 		
	}
	public static void main(String[] args) throws Exception {
		update();
		
	}

}
