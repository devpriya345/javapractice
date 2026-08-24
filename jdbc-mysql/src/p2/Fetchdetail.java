package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Fetchdetail {
static final String DB_URL="jdbc:mysql://localhost:3306/coursedetail";
static final String DB_UNAME="root";
static final String DB_PWD="test";
public static void main(String[] args) throws Exception{
	Scanner s = new Scanner(System.in);
	System.out.println("enter price");
	double price = s.nextDouble();
	Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
	StringBuilder sql= new StringBuilder("SELECT * FROM COURSE");
	if(price>0) {
		sql.append(" WHERE FEE<=?")	;	
		}
	PreparedStatement pstmt = con.prepareStatement(sql.toString());
	if(price>0) {
		pstmt.setDouble(1,price);
	}
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"..."+rs.getString(2)+"..."+rs.getDouble(3));
	}
	con.close();
	}
	
}
