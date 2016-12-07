package jdbc.sql;

import java.sql.*;

public class JdbcProg06 
{
	public static void main(String[] args) 
	{
		String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		Connection con;
		Statement stmt;
		int empNo, comm, mgr, sal, deptno;
		String ename, job, hiredate;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch(ClassNotFoundException e)
		{
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
		
		try 
		{
			String sql = "select * from emp";
			
			con = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
						
			//cs.setInt(1, 1000);
			//cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
			//cs.execute();
			//ResultSet rs = (ResultSet)cs.getObject(2);
			
			while(rs.next())
			{
				for (int i=1; i<=rsmd.getColumnCount();i++)
				{						
					if(rsmd.getColumnTypeName(i).equals("VARCHAR2") || rsmd.getColumnTypeName(i).equals("Date"))
					{
						System.out.print(rs.getString(i)+"\t");
					} else if (rsmd.getColumnTypeName(i).equals("NUMBER"))
					{
						System.out.print(rs.getInt(i)+"\t");
					}
				}
				System.out.println();;
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
