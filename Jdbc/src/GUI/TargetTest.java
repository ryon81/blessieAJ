package GUI;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TargetTest extends Frame 
{
	int width = 600, height = 600;
	int cx= width / 2;
	int cy= height / 2 - 30;
	int tw, th;
	
	Image imgBack, imgTarget ;
	
	Image img = null;
	Graphics2D gImg = null;
	
	public TargetTest()
	{			
		imgBack = Toolkit.getDefaultToolkit().getImage("images/back.png");
		imgTarget = Toolkit.getDefaultToolkit().getImage("images/target.png");					
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);				
			}
		});		
				
		setBounds(100, 100, width, height);
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
		new TargetTest();	
	}
	

	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		tw = imgTarget.getWidth(this) /2; 
		th = imgTarget.getHeight(this) /2;
		
		//---------------가상화면 만들기------------------
		gImg.scale(1.0, 1.0);
		gImg.drawImage(imgBack, 0, 0, width, height, this);			
		gImg.drawImage(imgTarget, cx-tw, cy-th, this);
		
			
		//---- 가상화면을 실제화면으로 복사하기---------------
		g2.drawImage(img, 0, 0, width, height, this);
	}
}
