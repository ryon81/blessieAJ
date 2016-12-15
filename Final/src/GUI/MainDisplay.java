package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class MainDisplay extends JFrame
{	
	Container contentPane;
	
	MainDisplay()
	{
		setTitle("나만의 가계부");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		JTabbedPane pane = createTabbedPane();
		contentPane.add(pane, BorderLayout.CENTER);
				
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnFile.add(mntmLoad);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnUser = new JMenu("User");
		menuBar.add(mnUser);
		
		JMenuItem mntmNew = new JMenuItem("New..");
		mnUser.add(mntmNew);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnUser.add(mntmLogout);
		
		setSize(432,768);
		setVisible(true);
	}
		
	
	JTabbedPane createTabbedPane()
	{
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("Calendar", new JLabel(new ImageIcon("img/calendar.png")));
		pane.addTab("Report", new JLabel(new ImageIcon("img/report.png")));
		pane.addTab("Money", new JLabel(new ImageIcon("img/money.png")));
		pane.addTab("Budget", new JLabel(new ImageIcon("img/budget.png")));
		return pane;
	}
	
	class MyPanel extends JPanel
	{
		MyPanel() 
		{
			this.setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.RED);
		}
	}
	
	
}
