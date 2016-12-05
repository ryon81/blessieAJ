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
	
	Object[][] cell_value;	
	String ColName[] = {"사번", "이름", "직책", "매니저", "입사일", "급여", "상여금", "부서번호"};
		
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
				
		table = new JTable(cell_value, ColName);
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
			table.setValueAt(rsmd, table.getRowCount(), table.getColumnCount());;
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
					table.setValueAt(col[i-1] + "\t", i, 0); 
				}
							
				//textArea2.append("\n");
				while(rs.next())
				{
					for (int i=1; i<=rsmd.getColumnCount();i++)
					{						
						if(rsmd.getColumnTypeName(i).equals("VARCHAR2") || rsmd.getColumnTypeName(i).equals("Date"))
						{
							table.setValueAt(rs.getString(i)+"\t", i, 0);
						} else if (rsmd.getColumnTypeName(i).equals("NUMBER"))
						{
							table.setValueAt(rs.getInt(i)+"\t", i, 0);
						}
					}				
					
				}				
			} catch (SQLException ex) 
			{
				//textArea2.append("\r\n " + "조회 명령에 오류가 있어 작업이 실패했습니다.");
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
