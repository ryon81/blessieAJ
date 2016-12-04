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
				{"È«±æµ¿",20,30,40,90},
				{"È«±æµ¿",20,30,40,90},
				{"È«±æµ¿",20,30,40,90}
		};
	String ColName[] = {"ÀÌ¸§", "±¹¾î", "¼öÇÐ", "¿µ¾î", "ÃÑÁ¡"};
	
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