package A2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {
	static final String DB_URL = "jdbc:mysql://localhost:3306/coursedetail";
	static final String DB_UNAME = "root";
	static final String DB_PWD = "test";
	static final String SELECT_SQL="SELECT  * FROM COURSE WHERE ID=104"; 
	public static void main(String[] args) throws Exception{
		Class.forName ("com.mysql.cj.jdbc.Driver");//load driver
		Connection con =  DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD); //get conection
		Statement stmt = con.createStatement();//create stmt		
		ResultSet rs = stmt.executeQuery(SELECT_SQL);
		while(rs.next()) {
			System.out.println("id");
			System.out.println("name");
			System.out.println("fee");
		}
		con.close();
		
	}

}
