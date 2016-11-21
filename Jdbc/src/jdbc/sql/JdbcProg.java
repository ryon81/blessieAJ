package jdbc.sql;

import java.sql.*;

public class JdbcProg 
{
	public static void main(String[] args) 
	{
		String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		Connection con;
		Statement stmt;
		int empNo;
		String ename;
		
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
			String sql = "SELECT * FROM emp";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("empno" + " " + "ename");
			System.out.println("=====================");
			
			while (rs.next())
			{
				empNo = rs.getInt("empno");
				ename = rs.getString("ename");
				System.out.println(empNo + " " + ename);
			}
			
			rs.close();
			stmt.close();
			con.close();					
		} catch (SQLException e)
		{
			System.err.println("SQLException: " + e.getMessage());
		}
	}
}
