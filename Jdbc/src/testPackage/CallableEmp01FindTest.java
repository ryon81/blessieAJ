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
			
			cs = con.prepareCall("{call findTable(?,?,?,?,?,?,?,?)}");
						
			cs.registerOutParameter(1, java.sql.Types.INTEGER);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.VARCHAR);
			cs.registerOutParameter(4, java.sql.Types.INTEGER);
			cs.registerOutParameter(5, java.sql.Types.DATE);
			cs.registerOutParameter(6, java.sql.Types.INTEGER);
			cs.registerOutParameter(7, java.sql.Types.INTEGER);
			cs.registerOutParameter(8, java.sql.Types.INTEGER);
			cs.execute();
			
			System.out.println("사    번: " + cs.getInt(1));
			System.out.println("이    름: " + cs.getString(2));
			System.out.println("직    책: " + cs.getString(3));
			System.out.println("매 니 저: " + cs.getInt(4));
			System.out.println("채 용 일: " + cs.getDate(5));
			System.out.println("급    여: " + cs.getInt(6));
			System.out.println("커 미 션: " + cs.getInt(7));
			System.out.println("부서번호: " + cs.getInt(8));
		
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
