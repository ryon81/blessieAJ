package oracle_connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BoxLayoutTest extends JFrame
{		
	public BoxLayoutTest()
	{
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel label = new JLabel("SQL : ");
		panel.add(label);
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("ЅЗ   За");
		btnNewButton.setAlignmentX(0.5f);
		getContentPane().add(btnNewButton);
		
		JPanel pane2 = new JPanel();
		getContentPane().add(pane2);
		pane2.setLayout(new BoxLayout(pane2, BoxLayout.X_AXIS));
		
		JLabel label2 = new JLabel("result: ");
		pane2.add(label2);
		
		JTextArea textArea2 = new JTextArea();
		pane2.add(textArea2);
		
		this.setSize(400,300);
		this.setVisible(true);
	}

	
	public static void main(String[] args) 
	{
		new BoxLayoutTest();

	}

}
