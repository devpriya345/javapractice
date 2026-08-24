package A2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class InsertBookDetails {
	static final String DB_URL = "jdbc:mysql://localhost:3306/coursedetail";
	static final String DB_UNAME = "root";
	static final String DB_PWD = "test";
	static final String INSERT_SQL= "INSERT INTO COURSE VALUES(105,'C++',6000)"; 

public static void main(String[] args) throws Exception{
	Class.forName ("com.mysql.cj.jdbc.Driver");//load driver
	Connection con =  DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD); //get conection
	Statement stmt = con.createStatement();//create stmt			
	int rowEffected= stmt.executeUpdate(INSERT_SQL);//execute query
	System.out.println("Record inserted:"+ rowEffected);//process result
	con.close(); //close connection
}

}







