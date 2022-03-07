import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		String sql1 = "insert into citizen values(909,'kim',31,'kerala')";
		String sql2 = "update citizen set age=30 where id=101";
		String sql3 = "delete from citizen where id=104";
		
		Connection conn=null;
		try {
			conn =JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			
			//adding batch of queries to execute in one go
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			conn.setAutoCommit(false);
			
			stmt.executeBatch();
			
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
				
	}

}
