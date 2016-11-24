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
			
			System.out.println("��    ��: " + cs.getInt(1));
			System.out.println("��    ��: " + cs.getString(2));
			System.out.println("��    å: " + cs.getString(3));
			System.out.println("�� �� ��: " + cs.getInt(4));
			System.out.println("ä �� ��: " + cs.getDate(5));
			System.out.println("��    ��: " + cs.getInt(6));
			System.out.println("Ŀ �� ��: " + cs.getInt(7));
			System.out.println("�μ���ȣ: " + cs.getInt(8));
		
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
