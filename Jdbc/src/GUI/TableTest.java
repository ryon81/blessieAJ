package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class TableTest 
{
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();
	}
}

class MyFrame extends JFrame
{
	Object[][] cell_value = 
		{
				{"ȫ�浿",20,30,40,90},
				{"ȫ�浿",20,30,40,90},
				{"ȫ�浿",20,30,40,90}
		};
	String ColName[] = {"�̸�", "����", "����", "����", "����"};
	
	MyFrame()
	{
		setTitle("");
		setSize(600,400);
		setLocation(200,200);
		
		JTable table = new JTable(cell_value, ColName);
		
		add(new JScrollPane(table), BorderLayout.CENTER);
		
		setVisible(true);		
	}
}