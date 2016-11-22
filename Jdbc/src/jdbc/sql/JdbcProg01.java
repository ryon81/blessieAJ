package jdbc.sql;

import java.sql.*;

public class JdbcProg01 
{
	public static void main(String[] args) 
	{
		String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		Connection con;
		Statement stmt;
		
		//int empNo, mgr, sal, comm;
		//String ename, job, hireDate;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch(ClassNotFoundException e)
		{
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
		
		try 
		{
			con = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			stmt = con.createStatement();
			
			String sql = "INSERT into emp01 values (1111, 'È«±æµ¿', '¹é¼ö', 7788, sysdate, 500, 0, 10)";
			int insert = stmt.executeUpdate(sql);			
			
			stmt.close();
			con.close();					
		} catch (SQLException e)
		{
			System.err.println("SQLException: " + e.getMessage());
		}
	}
}
