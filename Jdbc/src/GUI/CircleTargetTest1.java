package GUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class CircleTargetTest1 extends Frame 
{
	int width = 600, height = 600;
	int cx= width / 2;
	int cy= height / 2 - 30;
	int tw, th;
	
	ArrayList<Bullet> mBullet;
	Image imgBack, imgTarget ;
	
	int Score[] = {10,8,6,0};
	int n = 3;
	int tot = 0;
		
	int x, y;
	
	Image img = null;
	Graphics2D gImg = null;
			
	public CircleTargetTest1()
	{			
		imgBack = Toolkit.getDefaultToolkit().getImage("images/back.png");
		imgTarget = Toolkit.getDefaultToolkit().getImage("images/target_1.png");					
		
		mBullet = new ArrayList<Bullet>();			
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);				
			}
		});		
				
		addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e)
			{
				int r[] = {40, 90, 140};
				
				x = (int) e.getX();
				y = (int) e.getY();
														
				n = 3;
				
				//------ Math.pow 는 (값, n승)을 지정할 수 있다.  
				for (int i = 0; i <3; i++)
				{
					if(Math.pow(cx-x, 2) + Math.pow(cy-y, 2) <= Math.pow(r[i], 2))
					{
						mBullet.add(new Bullet(x,y));
						n = i;
						tot += Score[n];
						break;
					}
				}							
				repaint();
			}			
		});
		
		setBounds(300, 300, width, height);
		setVisible(true);
		
		img = createImage(600,600);
		gImg = (Graphics2D) img.getGraphics();
				
	}	
	
	class Bullet
	{
		public int x, y;
		public Image hole;
		public long lastTime;
		
		public Bullet(int _x, int _y)
		{
			hole = Toolkit.getDefaultToolkit().getImage("images/hole.png");
			x = _x;
			y = _y;
			
			lastTime = System.currentTimeMillis();
		}
		
		public boolean MeltHole()
		{
			return true;
		}
	}
	
	public static void main(String[] args) 
	{
		CircleTargetTest1 cm = new CircleTargetTest1();
		cm.new MeltHoleMove().start();		
	}	

	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		tw = imgTarget.getWidth(this) /2; 
		th = imgTarget.getHeight(this) /2;
			
		gImg.drawImage(imgBack, 0, 0, width, height, this);			
		gImg.drawImage(imgTarget, cx-tw, cy-th, this);
						
		gImg.setPaint(Color.WHITE);
		gImg.drawString("점수 = " + Score[n], 10, 50);
		gImg.drawString("합계 = " + tot, 200, 50);		
		
		gImg.drawString("x=" + x + "y=" + y, 10, 70);
		gImg.drawString("mBullet = " + mBullet.size(), 10, 90);
		
		MeltHoles();
		for (Bullet tBullet: mBullet)
		{
			gImg.drawImage(tBullet.hole, tBullet.x - tBullet.hole.getWidth(this)/2, tBullet.y - tBullet.hole.getHeight(this) /2 , this);
		}	
		
		g2.drawImage(img, 0, 0, width, height, this);
	}
	
	public void update(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		paint(g2);
	}
	
	private void MeltHoles()
	{
		long thisTime = System.currentTimeMillis();
		for(int i = mBullet.size() -1; i>=0; i--)
		{
			if(thisTime - mBullet.get(i).lastTime >= 2000)
				if(mBullet.get(i).MeltHole() == true) mBullet.remove(i);					
		}
	}
	
	class MeltHoleMove extends Thread
	{
		public void run()
		{
			while(true)
			{
				repaint();
				try
				{
					Thread.sleep(100);
				} catch (Exception e) {}
			}
		}
	}	
}