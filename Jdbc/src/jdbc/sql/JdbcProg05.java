package jdbc.sql;

import java.sql.*;

public class JdbcProg05 
{
	public static void main(String[] args) 
	{
		String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		Connection con;
		Statement stmt;
		int empNo, grade;
		String ename, dname ;
		
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
			
															
			String sql = "SELECT e.empno, e.ename, d.dname, s.grade from emp e, dept d, salgrade s where e.deptno = d.deptno and e.sal between s.losal and s.hisal";
			ResultSet rs = stmt.executeQuery(sql);		
						
			System.out.println("empno" + " " + "ename"+ "  " + "dname" + " " + "grade");
			System.out.println("==================================================");
			
			while (rs.next())
			{
				empNo = rs.getInt("empno");
				ename = rs.getString("ename");
				dname = rs.getString("dname");
				grade = rs.getInt("grade");
				
				System.out.println(empNo + "  " + ename + "  " + dname + " " + grade);
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
