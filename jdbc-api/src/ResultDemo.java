import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class ResultDemo {

	public static void main(String[] args) {
		String sql = "select * from citizen";
		
		try {
			Connection conn =JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
//			ResultSetMetaData meta = rs.getMetaData();
//			
//			for(int c=1;c<=meta.getColumnCount();c++)
//				System.out.println(meta.getColumnName(c)+"\t");
//			System.out.println();
			
			
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t");
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

}
