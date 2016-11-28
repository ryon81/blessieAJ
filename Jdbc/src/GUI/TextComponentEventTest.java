package GUI;

import java.awt.*;
import java.awt.event.*;

class TextComponentEventTest extends Frame
{
	TextField tf = new TextField();
	TextArea ta = new TextArea();
	
	TextComponentEventTest(String title)
	{
		tf = new TextField();
		ta = new TextArea();
		add(ta, "Center");
		add(tf, "South");
		
		tf.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				ta.append(tf.getText() + "\n");
				tf.setText("");
				tf.requestFocus();
			}
		});
		
		ta.setEditable(false);
		setSize(300,200);
		setVisible(true);
		tf.requestFocus();
	}
	
	public static void main(String[] args) 
	{
		TextComponentEventTest mainWin = new TextComponentEventTest("TextComponentEventTest");
	}
}
