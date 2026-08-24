package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SimpleInsertBatch {
	static final String DB_URL ="jdbc:mysql://localhost:3306/coursedetail";
	static final String DB_UNAME = "root";
	static final String DB_PWD = "test";
	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
		String sql = "INSERT INTO PERSON(p_id,p_name,age) VALUES(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		//Record 1 insert
		ps.setInt(1,1);
		ps.setString(2,"Raman");
		ps.setInt(3,20);
		ps.addBatch();
		
		//Record 2 insert
		ps.setInt(1,2);
		ps.setString(2,"Param");
		ps.setInt(3,25);
		ps.addBatch();
		
		//Record 3 insert
		ps.setInt(1,3);
		ps.setString(2,"Garam");
		ps.setInt(3,27);
		ps.addBatch();
		
		ps.executeBatch();
		System.out.println("Executed successfully");
		con.close();
	}
	
}
