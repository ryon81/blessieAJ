package jdbc.sql;

import java.sql.*;

public class JdbcProg02 
{
	public static void main(String[] args) 
	{
		String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		Connection con;
		Statement stmt;
		int empNo, mgr, sal, comm, deptno;
		String ename, job, hireDate ;
		
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
			
			String sql1 = "INSERT into emp01 values (1111, 'È«±æµ¿', '¹é¼ö', 7788, sysdate, 500, 0, 10)";
			int insert = stmt.executeUpdate(sql1);
											
			String sql = "SELECT * FROM emp01";
			ResultSet rs = stmt.executeQuery(sql);
						
			System.out.println("empno" + " " + "ename"+ "  " + "job" + " " + "mgr" + " " + "hiredate" + " " + "sal" + " " + "comm" + " " + "deptno" );
			System.out.println("=================================================================");
			
			while (rs.next())
			{
				empNo = rs.getInt("empno");
				ename = rs.getString("ename");
				job = rs.getString("job");
				mgr = rs.getInt("mgr");
				hireDate = rs.getString("hiredate");
				sal = rs.getInt("sal");
				comm = rs.getInt("comm");
				deptno = rs.getInt("deptno");
				System.out.println(empNo + "  " + ename + "  " + job + " " + mgr + " " + hireDate + " " + sal + " " + comm + "  " + deptno);
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
