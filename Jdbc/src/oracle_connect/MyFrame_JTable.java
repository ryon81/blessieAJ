package oracle_connect;

import java.awt.BorderLayout;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class MyFrame_JTable extends JFrame
{
	String sql;	
	JTextArea textArea, textArea2;
	JPanel pane1, pane2;
	JLabel label, label2;
	JButton btnNewButton;
	String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	Connection con;
	Statement stmt;
	ResultSet rs;
	String[] col;
	JTable table;
	JScrollPane scrollPane;
	
	Object[][] data;	
	String[] ColStr;	
		
	ResultSetMetaData rsmd;	
	
	public MyFrame_JTable()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		pane1 = new JPanel();
		getContentPane().add(pane1);
		pane1.setLayout(new BoxLayout(pane1, BoxLayout.X_AXIS));
		
		label = new JLabel("SQL : ");
		pane1.add(label);	
		
		textArea = new JTextArea();
		pane1.add(textArea);		
		
		btnNewButton = new JButton("실   행");
		btnNewButton.addActionListener(new ButtonSelectEvent());
		btnNewButton.setAlignmentX(0.5f);
		getContentPane().add(btnNewButton);
		
		pane2 = new JPanel();
		getContentPane().add(pane2);
		pane2.setLayout(new BoxLayout(pane2, BoxLayout.X_AXIS));
				
		
		table = new JTable(data, col);
		pane2.add(table);
		scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		label2 = new JLabel("result: ");
		scrollPane.setRowHeaderView(label2);
		
		this.setSize(800,600);
		this.setVisible(true);
	}
	
	class ButtonSelectEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{								
			try
			{					
				sql=textArea.getText();		
				rs = stmt.executeQuery(sql);
				rsmd = rs.getMetaData();
				int colNum = rsmd.getColumnCount();
								
				//컬럼명 넣기//
				for (int i=1; i<=colNum; i++)
				{
					col = new String[colNum];
					col[i-1] = rsmd.getColumnName(i);					
				}
				
				data = new String[0][colNum];						
				
				//테이블에 결과 넣기
				String data;
				int cnt1=1;
				while(rs.next())
				{
					String ColStr[] = new String[colNum+1];
					ColStr[0] = String.valueOf(cnt1);
					for(int i =1; i<colNum;i++)
					{
						if(rs.getObject(i) != null)
						{
							data = rs.getObject(i).toString();							
						} else 
						{
							data = "";
						}
						ColStr[i] = data;												
					}
					data.addRow(ColStr);
					cnt1++;
					
					/*for (int i=1; i<=rsmd.getColumnCount();i++)
					{						
						if(rsmd.getColumnTypeName(i).equals("VARCHAR2") || rsmd.getColumnTypeName(i).equals("Date"))
						{
							ColStr[i-1] = rs.getString(i);
							table.(ColStr[i-1]);
							textArea2.append(rs.getString(i)+"\t");
						} else if (rsmd.getColumnTypeName(i).equals("NUMBER"))
						{
							ColInt[i-1] = rs.getInt(i);
							textArea2.append(rs.getInt(i)+"\t");
							table.setValueAt(rs.getInt(i)+"\t", i+1, 1);
						}
					}	*/			
					
				}				
			} catch (SQLException ex) 
			{
				textArea.append("\r\n " + "조회 명령에 오류가 있어 작업이 실패했습니다.");
			} finally
			{
				sql = "";
				textArea.setFocusable(true);
			}			
		}
	}
	
	public static void main(String[] args) 
	{
		new MyFrame_JTable();
	}

}
