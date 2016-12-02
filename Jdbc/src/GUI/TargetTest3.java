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
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class TargetTest3 extends Frame 
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
	Rectangle2D mRect[] = new Rectangle2D[4];
	
	int x, y;
	
	Image img = null;
	Graphics2D gImg = null;
			
	public TargetTest3()
	{			
		imgBack = Toolkit.getDefaultToolkit().getImage("images/back.png");
		imgTarget = Toolkit.getDefaultToolkit().getImage("images/target.png");					
		
		mBullet = new ArrayList<Bullet>();
		
		
		for(int i = 0; i < 3; i++)
		{
			int x1 = cx - i * 50 - 40;
			int y1 = cy - i * 50 - 40;
			int x2 = cx + i * 50 + 40;
			int y2 = cy + i * 50 + 40;
			
			System.out.println("x1 = " + x1 + " y1 = " + y1 + " x2 = " + x2 + " y2 = " + y2);
			mRect[i] = new Rectangle2D.Double(x1, y1, x2-x1, y2-y1);			
		}		
		
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
				x = (int) e.getX();
				y = (int) e.getY();
														
				n = 3;
				
				for (int i = 0; i <3; i++)
				{
					if(mRect[i].contains(x, y) == true)
					{
						System.out.print("총알생성");
						mBullet.add(new Bullet(x, y));
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
		
		public Bullet(int _x, int _y)
		{
			hole = Toolkit.getDefaultToolkit().getImage("images/hole.png");
			x = _x;
			y = _y;
		}
	}
	
	public static void main(String[] args) 
	{
		new TargetTest3();	
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
}
