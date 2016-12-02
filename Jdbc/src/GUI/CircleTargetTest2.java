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

public class CircleTargetTest2 extends Frame 
{
	Image img = null;
	Graphics2D gImg = null;
	
	int width = 600, height = 600;
	int cx= width / 2;
	int cy= height / 2 - 30;
	int tw, th;
	
	ArrayList<Arrow> mArrow;
	Image imgBack, imgTarget ;
	
	int arScore[] = {10, 6, 12, 4, 15, 8, 10, 6, 12, 4, 15, 8, 10};
	int score = 0;
	int tot = 0;
		
	int x, y;
		
	public CircleTargetTest2()
	{			
		imgBack = Toolkit.getDefaultToolkit().getImage("images/back.png");
		imgTarget = Toolkit.getDefaultToolkit().getImage("images/target_2.png");					
		
		mArrow = new ArrayList<Arrow>();
		
		pt.x = 100;
		pt.x = 200;
		
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
														
				CalcScore(x, y);
				
				repaint();
			}			
		});
		
		setBounds(100, 100, width, height);
		setVisible(true);
		
		img = createImage(600,600);
		gImg = (Graphics2D) img.getGraphics();
				
	}	
	
	class Arrow
	{
		public int x, y;
		public Image dart;
		public int dh;
		
		public Arrow(int _x, int _y)
		{
			dart = Toolkit.getDefaultToolkit().getImage("images/dart.png");
			x = _x;
			y = _y;
		}
	}
	
	class Point 
	{
		int x, y;
	}
	
	Point pt = new Point();
	
	public static void main(String[] args) 
	{
		new CircleTargetTest2();	
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		tw = imgTarget.getWidth(this) /2; 
		th = imgTarget.getHeight(this) /2;
			
		gImg.drawImage(imgBack, 0, 0, width, height, this);
		
		gImg.scale(1.0, 1.0);
		
		gImg.drawImage(imgTarget, cx-tw, cy-th, this);
						
		gImg.setPaint(Color.WHITE);
		gImg.drawString("점수 = " + score, 10, 50);
		gImg.drawString("합계 = " + tot, 200, 50);
						
		gImg.drawString("마우스좌표 x=" + x + " y=" + y, 10, 90);
		gImg.drawString("mArrow = " + mArrow.size(), 10, 110);
		
		for (Arrow tDart: mArrow)
		{
			gImg.drawImage(tDart.dart, tDart.x, tDart.y - tDart.dart.getHeight(this), this);
		}	
		
		g2.drawImage(img, 0, 0, width, height, this);
	}
	
	public void update(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		paint(g2);
	}
	
	private void CalcScore(int x, int y)
	{
		int r[] = {40, 90, 140};

		double deg = Math.atan2(x - cx, y - cy) * 180 / Math.PI -90;  // atan2는 찍은 지점의 각도를 구한다. 
		if (deg < 0) deg += 360;

		int n = 3;
		score = 0;

		for (int i =0; i < 3 ; i++)
		{
			if(Math.pow(cx-x, 2) + Math.pow(cy-y, 2) <= Math.pow(r[i], 2))
			{
				mArrow.add(new Arrow(x,y));
				for (int j = 0; j <13; j++)
				{
					int k = j * 30 +15;
					if (deg < k) 
					{
						score = arScore[j] * n;
						tot += score;
						break;
					}
				}
				if(score > 0 ) break;
			}
			n--;
		}
	}
}
