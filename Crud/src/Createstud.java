import java.sql.*;
public class Createstud {
	public static void stud() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/rishi";
		String username = "root";
		String password = "2580";
		String Query = "insert into stud values(?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1,100);
		pst.setString(2,"rishi");
		pst.setString(3,"rishijoseph");
		pst.executeUpdate();
		con.close(); 
 		
	}
	public static void main(String[] args) throws Exception {
		stud();
		
	}

}
