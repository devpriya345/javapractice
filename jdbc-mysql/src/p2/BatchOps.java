package p2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class BatchOps {
	static final String DB_URL ="jdbc:mysql://localhost:3306/coursedetail";
	static final String DB_UNAME = "root";
	static final String DB_PWD = "test";
	public static void main(String[] args)throws Exception {
		Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
		Statement stmt = con.createStatement();
		stmt.addBatch("INSERT INTO COURSE(id,name,fee) VALUES(101,'Python',4500)");
		stmt.addBatch("INSERT INTO COURSE(id,name,fee) VALUES(102,'Java',5500)");
		stmt.addBatch("INSERT INTO COURSE(id,name,fee) VALUES(103,'Sql',6500)");
		stmt.addBatch("INSERT INTO COURSE(id,name,fee) VALUES(104,'Devops',7500)");
		int[]count = stmt.executeBatch();
		for(int i :count) {
			System.out.println("records effected::"+ i);
		}
		con.close();
		System.out.println("Execution completed");
	}
}
