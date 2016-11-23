package testPackage;

import java.sql.*;

public class CallableStatementTest 
{
	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		CallableStatement cs = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
			
			cs = con.prepareCall("{call simpleProc(?,?,?)}");
			
			cs.setInt(1, 3);
			cs.registerOutParameter(2, java.sql.Types.INTEGER);
			cs.registerOutParameter(3, java.sql.Types.VARCHAR);
			cs.execute();
			
			System.out.println("id: " + cs.getInt(2) + " name : " + cs.getString(3));
			
		} catch(Exception e)
		{
			System.out.print(e);
		} finally 
		{
			cs.close();
			con.close();
		}
	}	
}
