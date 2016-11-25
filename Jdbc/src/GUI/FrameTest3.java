package GUI;

import java.awt.*;
import java.awt.event.*;

class FrameTest3 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Login");
		f.setSize(300,200);
		
		f.addWindowListener(new EventHandler());
		f.setVisible(true);

	}

}

class EventHandler implements WindowListener
{
	public void windowOpened(WindowEvent e)
	{}
	public void windowClosing(WindowEvent e)
	{
		e.getWindow().setVisible(false);
		e.getWindow().dispose();     // 윈도우의 메모리를 제거한다. 
		System.exit(0);		
	}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}	
	
	
}