package oracle_connect;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class MetaDataApplication extends JFrame implements ActionListener, TextListener, KeyListener 
{
	String data[][] = new String[0][1];
	String title[] = {" "};
	
	DefaultTableModel model = new DefaultTableModel(data,title)
	{
		public boolean isCellEditable(int r, int c)
		{
			return false;
		}		
	};
	
	private JTable table = new JTable(model);
	
	ImageIcon icon1 = new ImageIcon("./bb.gif");
	ImageIcon icon2 = new ImageIcon("./cc.gif");
	
	private JPanel jPanel1 = new JPanel();
	private JTextField ipTF = new JTextField();
	private JLabel jLabel1 = new JLabel();
	private JTextField userTF = new JTextField();
	private JLabel jLabel2 = new JLabel();
	private JLabel jLabel3 = new JLabel();
	private JPasswordField pwdTF = new JPasswordField();
	private JPanel jPanel2 = new JPanel();
	private JButton conn = new JButton(icon2);
	private JButton disconn = new JButton(icon1);
	private JPanel sqlPanel = new JPanel();
	private JPanel resultPanel = new JPanel();
	private BorderLayout borderLayout1 = new BorderLayout();
	private BorderLayout borderLayout2 = new BorderLayout();
	private JScrollPane jScrollPane2 = new JScrollPane();
	private JTextField portTF = new JTextField();
	private JTextField sidTF = new JTextField();
	private JLabel jLabel4 = new JLabel();
	private JLabel jLabel5 = new JLabel();
	private JLabel jLabel6 = new JLabel();
	private JLabel jLabel7 = new JLabel();
	
	Connection con = null;
	int sw = 0;
	
	private static final int S_MENU = 0;
	private static final int S_SQL = 1;
	private static final int S_NOCOM = 2;
	private static final int S_QUIT = 3;
	
	public TextArea sqlTA = new TextArea();
	
	ImageIcon icon = new ImageIcon("./aa.gif");
	private JButton banner = new JButton(icon);
	private TitledBorder titledBorder1;
	
	public MetaDataApplication()
	{
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try 
		{
			jbInit();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		MetaDataApplication terminal = new MetaDataApplication();
		terminal.setTitle("메타데이터 프로그램");
	}
	
	private void jbInit() throws Exception
	{
		titledBorder1 = new TitledBorder("");
		this.getContentPane().setLayout(null);
		jPanel1.setBorder(BorderFactory.createEtchedBorder());
		jPanel1.setOpaque(false);
		jPanel1.setBounds(new Rectangle(6,5,345,60));
		jPanel1.setLayout(null);
		ipTF.setText("127.0.0.1");
		ipTF.setBounds(new Rectangle(7,26,96,25));
		jLabel1.setForeground(Color.orange);
		jLabel1.setText("IP");
		jLabel1.setBounds(new Rectangle(8,7,69,19));
		userTF.setText("scott");
		userTF.setBounds(new Rectangle(202,27,74,25));
		jLabel2.setForeground(Color.orange);
		jLabel2.setText("SID");
		jLabel2.setBounds(new Rectangle(147,9,59,15));
		jLabel3.setForeground(Color.orange);
		jLabel3.setText("USER");
		jLabel3.setBounds(new Rectangle(201,9,51,15));
		pwdTF.setText("tiger");
		pwdTF.setBounds(new Rectangle(277,27,64,25));
		
		jPanel2.setBorder(BorderFactory.createEtchedBorder());
		jPanel2.setOpaque(false);
		jPanel2.setBounds(new Rectangle(359,6,145,58));
		jPanel2.setLayout(null);
		conn.setBounds(new Rectangle(3,7,68,45));
		disconn.setBounds(new Rectangle(75,7,65,45));
		sqlPanel.setBorder(BorderFactory.createEtchedBorder());
		sqlPanel.setBounds(new Rectangle(7,85,496,95));
		sqlPanel.setLayout(borderLayout1);
		resultPanel.setBorder(BorderFactory.createEtchedBorder());
		resultPanel.setBounds(new Rectangle(6,203,497,176));
		resultPanel.setLayout(borderLayout2);
		portTF.setText("1521");
		portTF.setBounds(new Rectangle(105,26,37,26));
		sidTF.setText("orcl");
		sidTF.setBounds(new Rectangle(147,27,53,26));
		jLabel4.setForeground(Color.ORANGE);
		jLabel4.setText("PORT");
		jLabel4.setBounds(new Rectangle(105,8,39,17));
		jLabel5.setForeground(Color.ORANGE);
		jLabel5.setText("PASSWORD");
		jLabel5.setBounds(new Rectangle(274,6,67,20));
		jLabel6.setFont(new java.awt.Font("Monospaced", 0 ,12));
		jLabel6.setForeground(Color.white);
		jLabel6.setText("SQL문");
		jLabel6.setBounds(new Rectangle(7,70,71,18));
		jLabel7.setFont(new java.awt.Font("Monospaced", 0 ,12));
		jLabel7.setForeground(Color.white);
		jLabel7.setText("실행결과");
		jLabel7.setBounds(new Rectangle(6,185,57,22));
		banner.setBounds(new Rectangle(6,384,497,64));
		banner.setBorder(BorderFactory.createLineBorder(Color.black));
		this.getContentPane().setBackground(Color.black);
		sqlTA.setFont(new java.awt.Font("Dialog", 0, 14));
		sqlTA.setEnabled(false);
		this.getContentPane().add(jPanel1, null);
		jPanel1.add(ipTF, null);
		jPanel1.add(pwdTF, null);
		jPanel1.add(userTF, null);
		this.getContentPane().add(jPanel2, null);
		jPanel2.add(conn, null);
		jPanel2.add(disconn, null);
		jPanel1.add(jLabel4, null);
		jPanel1.add(jLabel3, null);
		jPanel1.add(portTF, null);
		jPanel1.add(sidTF, null);
		jPanel1.add(jLabel2, null);
		jPanel1.add(jLabel1, null);
		jPanel1.add(jLabel5, null);
		this.getContentPane().add(jLabel6, null);
		this.getContentPane().add(sqlPanel, null);
		sqlPanel.add(sqlTA, BorderLayout.CENTER);
		this.getContentPane().add(jLabel7, null);
		this.getContentPane().add(resultPanel, null);
		resultPanel.add(jScrollPane2, BorderLayout.CENTER);
		this.getContentPane().add(banner, null);
		
		table.setRequestFocusEnabled(false);
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jScrollPane2.getViewport().add(table, null);
		
		this.setSize(new Dimension(250,485));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if(frameSize.height > screenSize.height)
		{
			frameSize.height = screenSize.height;
		}
		if(frameSize.width > screenSize.width)
		{
			frameSize.width = screenSize.width;
		}
		this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		this.setVisible(true);
		
		this.conn.addActionListener(this);
		this.disconn.addActionListener(this);
		this.sqlTA.addTextListener(this);
		this.disconn.setEnabled(false);		
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) 
	{
		Object ob = ev.getSource();
		
		if(ob == this.conn)
		{
			if(connProcess())
			{
				this.disconn.setEnabled(true);
				this.conn.setEnabled(false);
				this.sqlTA.setEnabled(true);
				this.setTitle("서버와 접속이 되어진 상태입니다....");
			} else
			{
				JOptionPane.showMessageDialog(this, "서버와 접속 실패하였습니다, 확인하세요!", "접속실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
		} else if(ob==this.disconn)
		{
			disconnProcess();
			this.sqlTA.setEnabled(false);
		}		
	}
	
	public boolean connProcess()
	{
		String url = "jdbc:oracle:thin:@" + this.ipTF.getText().trim() + ":" + this.portTF.getText() + ":" + this.sidTF.getText();
		String user = this.userTF.getText().trim();
		String passwd = new String(this.pwdTF.getPassword());
		
		System.out.println("데이터베이스와 연결 중.....");
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, passwd);
			if(con != null)
			{
				con.setAutoCommit(false);
			}
		} catch (ClassNotFoundException e1)
		{
			System.out.println("연결실패: 드라이버 로딩 실패");
			return false;
		} catch(SQLException e2)
		{
			System.out.println("연결실패: url, user, passwd 정보가 올바르지 않음");
			return false;
		}
		System.out.println("연결 성공");
		
		this.sw=0;
		return true;
	}
	
	public void disconnProcess()
	{
		this.sqlTA.setText("");
		this.conn.setEnabled(true);
		this.disconn.setEnabled(false);
		this.setTitle("서버와 접속이 끊어진 상태입니다.......");
		this.sqlTA.setEnabled(false);
		try
		{
			this.con.close();
		} catch(Exception e) {}
		JOptionPane.showMessageDialog(this, "서버와 연결을 끊었습니다", "끊기 성공", JOptionPane.DEFAULT_OPTION);
		return;		
	}

	@Override
	public void textValueChanged(TextEvent ev) 
	{
		String temp = this.sqlTA.getText().trim();
		int cnt = temp.length();
		if(cnt == 0) return;		
		
		if(temp.charAt(cnt-1) == ';')
		{
			if(sw == 0)
			{
				this.sqlTA.addKeyListener(this);
				sw = 1;
			}
		} else 
		{
			this.sqlTA.removeKeyListener(this);
			sw = 0;
		}
	}

	@Override
	public void keyReleased(KeyEvent ev) 
	{
		if(ev.getKeyCode() == 10)
		{
			String cmd = this.sqlTA.getText().trim();
			if(cmd.length() < 1) return;
			int len = cmd.length();
			cmd = cmd.substring(0,  len-1);
			exeProcess(cmd);			
		}
		
	}

	@Override
	public void keyPressed(KeyEvent ev) {}

	@Override
	public void keyTyped(KeyEvent ev) {}

	public void exeProcess(String cmd)
	{
		int menu = 0;
		if((menu = comm_proc(cmd))== S_SQL)
		{
			executeSQL(cmd);
		} else if(menu == S_QUIT) disconnProcess();
	}
	
	public int comm_proc(String cmd)
	{
		try
		{
			StringTokenizer st = new StringTokenizer(cmd);
			String menu = st.nextToken().toUpperCase();
			if(menu.equals("AUTOCOMMIT"))
			{
				String flag = st.nextToken();
				if(flag.equals("true"))
					if(!con.getAutoCommit())
					{
						con.setAutoCommit(true);
					} 
				else if (flag.equals("false"))
					if (con.getAutoCommit())
					{
						con.setAutoCommit(false);
					}
					else return S_NOCOM;
				return S_MENU;
			}
			else if (menu.equals("COMMIT"))
			{
				if(!con.getAutoCommit()) con.commit();
				return S_MENU;
			} else if(menu.equals("ROLLBACK"))
			{
				if(!con.getAutoCommit()) con.rollback();
				return S_MENU;
			} else if(menu.equals("S_QUIT"))
			{				
				return S_QUIT;
			} return S_SQL;
		} catch (NoSuchElementException e)
		{
			return S_NOCOM;
		} catch (SQLException e2)
		{
			return S_NOCOM;
		}
	}
	
	public void executeSQL(String sql)
	{
		String result = "";
		try
		{
			Statement stmt = con.createStatement();
			boolean res1 = stmt.execute(sql);
			if(res1)
			{
				showData(stmt.getResultSet());
			} else 
			{
				if(stmt.getUpdateCount() == -1)
				{
					JOptionPane.showMessageDialog(this, "요청한 작업 실패!", "작업 실패", JOptionPane.DEFAULT_OPTION);
					return;
				} else 
				{
					result = stmt.getUpdateCount() + " row(s) update. \n";
					JOptionPane.showMessageDialog(this, result + "\n요청한 작업 성공!", "작업 성공", JOptionPane.DEFAULT_OPTION);
					return;
				}
			}
			stmt.close();		
		} catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage()+"\n요청한 작업 실패!", "작업 실패", JOptionPane.DEFAULT_OPTION);
			return;
		}		
	}
	
	public void tableDesc(String tableName) throws SQLException
	{
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM "  + tableName);
		ResultSetMetaData meta = rs.getMetaData();
		int colNum = meta.getColumnCount();
		
		this.data = new String[0][4];
		this.title = new String[4];
		this.title[0] = "NO";
		this.title[1] = "COL NAME";
		this.title[2] = "TYPE";
		this.title[3] = "NULL";
		
		this.model = new DefaultTableModel(data, title)
		{
			public boolean isCellEditable(int r, int c)
			{
				return false;
			}			
		};
		
		this.jScrollPane2.getViewport().remove(table);
		table.setModel(this.model);
		this.jScrollPane2.getViewport().add(table, null);
		
		for(int i=1; i<=colNum; i++)
		{
			String tbl_data[] = new String[4];
			tbl_data[0] = String.valueOf(i);
			tbl_data[1] = meta.getColumnName(i);
			tbl_data[2] = meta.getColumnTypeName(i);
			
			if(meta.isNullable(i) == ResultSetMetaData.columnNoNulls)
			{
				tbl_data[3] = "NOT NULL";
			} else if (meta.isNullable(i) == ResultSetMetaData.columnNullable)
			{
				tbl_data[3] = "NULL";
			} else
			{
				tbl_data[3] = " ";
			}
			model.addRow(tbl_data);			
		}
	}
		
	public void showData(ResultSet rs) throws SQLException
	{
		ResultSetMetaData meta = rs.getMetaData();
		int colNum = meta.getColumnCount();
			
		this.data = new String[0][colNum+1];
		this.title = new String[colNum+1];
			
		this.title[0] = "NO";
		for(int i=1; i<=colNum; i++)
		{
			title[i] = meta.getColumnName(i);
		}
			
		this.model = new DefaultTableModel(data, title)
		{
			public boolean isCellEditable(int r, int c)
			{
				return false;
			}				
		};
			
		this.jScrollPane2.getViewport().remove(table);
		table.setModel(this.model);
		this.jScrollPane2.getViewport().add(table,null);
			
		String data;
		int cnt1 = 1;
			
		while(rs.next())
		{
			String tbl_data[] = new String[colNum+1];
			tbl_data[0] = String.valueOf(cnt1);
			for(int i=1; i<= colNum; i++)
			{
				if(rs.getObject(i) != null)
				{
					data = rs.getObject(i).toString();
				} else 
				{
					data = "";
				}
				tbl_data[i] = data;
			}
			model.addRow(tbl_data);
			cnt1++;
		}
	}
		
	protected void processWindowEvent(WindowEvent e)
	{
		super.processWindowEvent(e);
		if(e.getID() == WindowEvent.WINDOW_CLOSING)
		{
			System.exit(0);
		}
	
	}
}
