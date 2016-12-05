package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SQLTest extends JFrame
{
	Container contentPane;
	
	SQLTest()
	{
		setTitle("SQL Select");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("SQL");
		
		contentPane.add(textLabel);
		
		setSize(400,600);
		setVisible(true);
	}
	

	
	public static void main(String[] args) 
	{
		new SQLTest();
	}
}
