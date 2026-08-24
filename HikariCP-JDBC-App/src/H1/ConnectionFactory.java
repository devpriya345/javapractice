package H1;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Statement;
import java.sql.Connection;


public class ConnectionFactory {
	static final String DB_URL ="jdbc:mysql://localhost:3306/coursedetail";
	static final String DB_UNAME = "root";
	static final String DB_PWD = "test";
	public static void main(String[] args) throws Exception {
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl(DB_URL);
		config.setUsername(DB_UNAME);
		config.setPassword(DB_PWD);
		
		config.setMaximumPoolSize(20);
		
		config.setMinimumIdle(5);
		HikariDataSource datasource = new HikariDataSource(config);
		
		Connection con1 = datasource.getConnection();
		String sql ="INSERT INTO COURSE VALUES(105,'AI',7000)";
		Statement stmt = con1.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Record inserted");
		con1.close();
		
	}
}
