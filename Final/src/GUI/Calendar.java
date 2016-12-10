package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Calendar extends JFrame
{
	Container contentPane;
	
	Calendar()
	{
		setTitle("Money");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("Month");
		
		contentPane.add(textLabel);
		
		setSize(432,768);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Calendar();
	}
}
