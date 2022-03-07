import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		String sql = "insert into citizen values (104,'Microsoft',24,'US')";
				try {
					Connection conn = JdbcFactory.getConnection();
					 
					Statement stmt = conn.createStatement();
					
					stmt.executeUpdate(sql);  //DML Operation 
					  
					  System.out.println("Record Inserted");
				}catch (SQLException e ) {
					e.printStackTrace();
				}
	}

}
