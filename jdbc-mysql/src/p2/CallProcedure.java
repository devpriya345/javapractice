package p2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallProcedure {
	static final String DB_URL="jdbc:mysql://localhost:3306/productdb";
	static final String DB_UNAME="root";
	static final String DB_PWD="test";
	static final String PROCEDURE =" call get_products()";
	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
		CallableStatement cstmt = con.prepareCall(PROCEDURE);
		ResultSet rs = cstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"..."+rs.getString(2)+"..."+rs.getInt(3)+"..."+rs.getInt(4));
		}
			con.close();
		
		
	}
}
