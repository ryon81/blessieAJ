package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloDukeMain extends JFrame implements Runnable 
{
	Canvas can;
	Image buffer;
	Image[] duke;
	Toolkit tk;
	boolean repeat = true;
	
	public HelloDukeMain()
	{
		tk = Toolkit.getDefaultToolkit();
		initDuke();
		
		this.add(can = new Canvas()
		{
			public void paint(Graphics g)
			{
				g.drawImage(buffer, 0, 0, this);
			}
			
			public void update(Graphics g)
			{
				paint(g);
			}
		});
		
		can.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				int code = e.getKeyCode();
				switch (code)
				{
					case KeyEvent.VK_SPACE: repeat = !repeat;
					if (repeat) makeThread();
					break;
				}
			}
		});
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setBounds(300,100,400,400);
		setVisible(true);
		
		makeThread();
	}
	public void makeThread()
	{
		new Thread(this).start();
	}
	
	public void initDuke()
	{
		duke = new Image[10];
		
		for(int i = 0; i <duke.length; i++)
		{
			duke[i] = tk.getImage(String.format("/images/Duke%d.gif",i+1));
		}
	}
	
	public void bufferPaint(int n)
	{
		buffer = createImage(can.getWidth(), can.getHeight());
		Graphics buffer_g = buffer.getGraphics();
		
		buffer_g.drawImage(duke[n], 30, 30, this);
		
		can.repaint();
	}

	public static void main(String[] args) 
	{
		new HelloDukeMain();

	}

	
	public void run() 
	{
		while(true)
		{
			for(int i = 0; i<duke.length; i++)
			{
				if(!repeat) return;
				try
				{
					Thread.sleep(50);
				} catch (InterruptedException ex)
				{
					bufferPaint(i);
				}
			}
		}
		
	}

}
