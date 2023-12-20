import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Get {
	public static void geter() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/rishi";
		String username = "root";
		String password = "2580";
		String Query = "select * from stud";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement pst = con.createStatement();
		ResultSet rs = pst.executeQuery(Query);
		while(rs.next()){
			System.out.println("id"+rs.getInt(1));
			System.out.println("name"+rs.getString(2));
			System.out.println("pass"+rs.getString(3));
			
		}
		con.close(); 
 		
	}
	public static void main(String[] args) throws Exception {
		geter();
		
	}

}

