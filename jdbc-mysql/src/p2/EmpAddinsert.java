package p2;

import java.sql.Connection;    
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpAddinsert {
	static final String DB_URL="jdbc:mysql://localhost:3306/assignment";
	static final String DB_UNAME="root";
	static final String DB_PWD ="test";
	static final String EMP_INSERT = "INSERT INTO EMP VALUES(?,?,?)";
	static final String EMP_ADD_INSERT = "INSERT INTO EMP_ADDRESS(city, state, country, emp_id) VALUES(?,?,?,?) ";
	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
		con.setAutoCommit(false); //By default conn-autocommit mode is true
		
		try {
			PreparedStatement pstmt = con.prepareStatement(EMP_INSERT);
			pstmt.setInt(1,101);
			pstmt.setString(2,"John");
			pstmt.setDouble(3,1000.00);
			pstmt.executeUpdate();
			
			 pstmt = con.prepareStatement(EMP_ADD_INSERT);
			pstmt.setString(1,"Hyd");
			pstmt.setString(2,"TG");
			pstmt.setString(3,"India");
			pstmt.setInt(4,102);
			pstmt.executeUpdate();
			
			con.commit();
			System.out.println("records inserted");
		}catch (Exception e) {
			System.out.println("Transcation rolled back...");
	
			e.printStackTrace();
			con.rollback();
		}
		con.close();
		}
	}
