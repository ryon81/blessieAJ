package GUI;

import java.awt.*;
import java.awt.event.*;

class BouncingBall extends Frame
{
	final int BALL_SIZE = 20;
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 300;
	
	final int TOP;
	final int BOTTOM;
	final int LEFT;
	final int RIGHT;
	
	int x;
	int y;
	
	final int SPEED = 3;
	int xStep = SPEED;
	int yStep = SPEED;
	
	BouncingBall(String title)
	{
		super(title);
		
		x = FRAME_WIDTH/2 - BALL_SIZE/2;
		y = FRAME_HEIGHT/2 - BALL_SIZE/2;
		
		setVisible(true);
		setBounds(300,200,FRAME_WIDTH,FRAME_HEIGHT);
		
		// --�������� Boarder ���� �����Ѵ�.--
		Insets insets = getInsets();
		
		TOP = insets.top;
		LEFT = insets.left;
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
		
		registerEventHandler();
		setResizable(false);
	}
	
	void registerEventHandler()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent ke)
			{
				int key = ke.getKeyCode();

				if (key == KeyEvent.VK_UP)
				{
					y -= SPEED;
					
					if (y <= TOP)
					{y = TOP;}

				} else if (key == KeyEvent.VK_DOWN)
				{					
					y += SPEED;
					if (y >= BOTTOM - BALL_SIZE)
					{y = BOTTOM - BALL_SIZE;}
				} else if (key == KeyEvent.VK_LEFT)
				{					
					x -= SPEED;					
					if (x <= LEFT)
					{x = LEFT;}
					
				} else if (key == KeyEvent.VK_RIGHT)
				{					
					x += SPEED;					
					if (x >= RIGHT - BALL_SIZE )
					{x = RIGHT - BALL_SIZE;}
				}
				repaint(); // ������ ���ֱ�
			}
		});		
	}
	
	/*------------ �������� ������ �� �� ���� �ٽ� �׸���------------
	void start()
	{
		while(true)
		{
			repaint();
			try
			{
				Thread.sleep(100);
			} catch (Exception e)
			{}			
		}
	}
	 */
	
	/*  --- ���� ���ֱ�
	public void update(Graphics g)
	{		
		paint(g);
	}
	*/
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
		
	}
}

class Exercise13_10 
{
	public static void main(String[] args) 
	{
		new BouncingBall("BouncingBall");
	}
}
