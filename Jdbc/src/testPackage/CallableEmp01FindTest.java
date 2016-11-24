package testPackage;

import java.sql.*;

public class CallableEmp01FindTest 
{
	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		CallableStatement cs = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
			
			cs = con.prepareCall("{call findTable}");
			System.out.println();
		
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
