package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRegistration {
	
	static final String DB_URL="jdbc:mysql://localhost:3306/userdetail";
	static final String DB_UNAME="root";
	static final String DB_PWD ="test";
public static void main(String[] args) throws Exception {
	Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
	Scanner s = new Scanner(System.in);
	PreparedStatement ps = con.prepareStatement("SELECT* FROM user WHERE email=? AND password=?");
	System.out.println("Enter email");
	String email = s.nextLine();
	
	System.out.println("Enter password");
	String password  = s.nextLine();
	
	ps.setString(1,email);
	ps.setString(2, password);
	
	ResultSet  rs = ps.executeQuery();
	if(rs.next()) {
		System.out.println("login successful");
	}else {
		System.out.println("invalid email and password");
	}
}
}

