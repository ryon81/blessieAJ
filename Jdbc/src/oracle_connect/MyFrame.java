package oracle_connect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame
{
	String sql;	
	JTextArea textArea, textArea2;
	JPanel panel, pane2;
	JLabel label, label2;
	JButton btnNewButton;
	String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	Connection con;
	Statement stmt;
	ResultSet rs;
	String[] col;
	
	ResultSetMetaData rsmd;
	
	public MyFrame()
	{
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

		} catch (SQLException e)
		{
			System.err.println("SQLException: " + e.getMessage());
		}	
		
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		label = new JLabel("SQL : ");
		panel.add(label);	
		
		textArea = new JTextArea();
		panel.add(textArea);		
		
		btnNewButton = new JButton("실   행");
		btnNewButton.addActionListener(new ButtonSelectEvent());
		btnNewButton.setAlignmentX(0.5f);
		getContentPane().add(btnNewButton);
		
		pane2 = new JPanel();
		getContentPane().add(pane2);
		pane2.setLayout(new BoxLayout(pane2, BoxLayout.X_AXIS));
		
		label2 = new JLabel("result: ");
		pane2.add(label2);
		
		textArea2 = new JTextArea();
		pane2.add(textArea2);
		
		this.setSize(800,600);
		this.setVisible(true);
	}
	
	class ButtonSelectEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			textArea2.setText("");
			sql=textArea.getText();
			System.out.println(sql);
			
			try
			{
				rs = stmt.executeQuery(sql);
				rsmd = rs.getMetaData();
				
				for (int i=1; i<=rsmd.getColumnCount(); i++)
				{
					col = new String[rsmd.getColumnCount()];
					col[i-1] = rsmd.getColumnLabel(i);
					textArea2.append(col[i-1] + "\t"); 
				}
				
				textArea2.append("\n");
				while(rs.next())
				{
					for (int i=1; i<=rsmd.getColumnCount();i++)
					{						
						if(rsmd.getColumnTypeName(i).equals("VARCHAR2") || rsmd.getColumnTypeName(i).equals("Date"))
						{
							textArea2.append(rs.getString(i)+"\t");
						} else if (rsmd.getColumnTypeName(i).equals("NUMBER"))
						{
							textArea2.append(rs.getInt(i)+"\t");
						}
					}
					textArea2.append("\n");
				}				
			} catch (SQLException ex) 
			{
				textArea2.append("\r\n " + "조회 명령에 오류가 있어 작업이 실패했습니다.");
			} finally
			{
				sql = "";
				textArea.setFocusable(true);
			}			
		}
	}
	
	public static void main(String[] args) 
	{
		new MyFrame();
	}

}
