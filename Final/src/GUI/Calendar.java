package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

class Calendar extends JFrame
{
	JFrame nFrame, sFrame;
	
	JTabbedPane pane;	
	Container contentPane;
		
	private JTable table1;
	private JTable table2;
	private JTable table3;
		
	ImageIcon iconReport, iconBudget, iconMoney, iconCalendar;  

	Calendar()
	{
		setTitle("나만의 가계부");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nFrame = new JFrame();
		nFrame.getContentPane().setLayout(new BorderLayout());
		nFrame.setSize(432, 20);
					
		pane = new JTabbedPane();
		pane.setSize(432, 20);
		
		nFrame.add(pane,"North");
				
		iconReport = new ImageIcon("img/report.png");
		Image report = iconReport.getImage();
		Image fixedimg = report.getScaledInstance(120,120, 0);
		iconReport = new ImageIcon(fixedimg);
				
		JButton btnReport = new JButton(iconReport);
		btnReport.setToolTipText("리포트");
		pane.add(btnReport, "North");

			
		btnReport.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			}
		});				
		
		iconCalendar = new ImageIcon("img/calendar.png");
		Image calendar = iconCalendar.getImage();
		Image fixedimg2 = calendar.getScaledInstance(120,120, 0);
		iconCalendar = new ImageIcon(fixedimg2);
		JButton btnCalendar = new JButton(iconCalendar);
		btnCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCalendar.setToolTipText("달력형");
		pane.add(btnCalendar);
		
		iconMoney = new ImageIcon("img/money.png");
		Image money = iconMoney.getImage();
		Image fixedimg3 = money.getScaledInstance(120,120, 0);
		iconMoney = new ImageIcon(fixedimg3);
		JButton btnMoney = new JButton("", iconMoney);
		btnMoney.setToolTipText("자산관리");
		pane.add(btnMoney);
		
		iconBudget = new ImageIcon("img/budget.png");	
		Image budget = iconBudget.getImage();
		Image fixedimg4 = budget.getScaledInstance(120,120, 0);
		iconBudget = new ImageIcon(fixedimg4);
		JButton btnBudget = new JButton(iconBudget);
		btnBudget.setToolTipText("예산");
		pane.add(btnBudget);
				
		sFrame = new JFrame();
		sFrame.getContentPane().setLayout(new BorderLayout());
		
		contentPane = new Container();
		
		sFrame.add(contentPane,"CENTER");
						
		table1 = new JTable();
		contentPane.add(table1);		
		getContentPane().add(new JScrollPane(table1));
				
		table2 = new JTable();
		contentPane.add(table2);		
		getContentPane().add(new JScrollPane(table2));
				
		table3 = new JTable();
		contentPane.add(table3);		
		getContentPane().add(new JScrollPane(table3));
		
		setSize(432,768);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Calendar();
	}
}
