package GUI;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ToyTest extends Frame 
{
	int width = 600, height = 600;
	int cx, cy;
	int tw, th;
	int sw, sh;
	int ang, dir;
	int an1, an2;
	
	Image imgBack, imgToy, imgShadow;
	
	Image img = null;
	Graphics2D gImg = null;
	
	public ToyTest()
	{
		cx = width / 2; 
		cy = height / 2 + 100;
		
		imgBack = Toolkit.getDefaultToolkit().getImage("images/back.png");
		imgToy = Toolkit.getDefaultToolkit().getImage("images/toy.png");
		imgShadow = Toolkit.getDefaultToolkit().getImage("images/shadow.png");
		
		ang = 0; 
		dir = 0;
		
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
				an1 = -15;
				an2 = 15;
				if (dir == 0) dir = -1;
			}
		});
		
		setBounds(100, 100, width, height);
		setVisible(true);
		
		img = createImage(600,600);
		gImg = (Graphics2D) img.getGraphics();
	}
	
	public static void main(String[] args) 
	{
		ToyTest ty = new ToyTest();
		ty.new ToyMove().start();
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		tw = imgToy.getWidth(this) /2; 
		th = imgToy.getHeight(this);
		sw = imgShadow.getWidth(this) /2;
		sh = imgShadow.getHeight(this) /2;
		
		RotateToy();
		
		/*
		g2.scale(1.0, 1.0);
		g2.drawImage(imgBack, 0, 0, width, height, this);
		g2.drawImage(imgShadow, cx - sw, cy - sh, this);
		
		g2.rotate(Math.toRadians(ang), cx, cy);
		g2.drawImage(imgToy, cx-tw, cy-th, this);
		g2.rotate(Math.toRadians(-ang), cx, cy);
		*/
		
		//---------------가상화면 만들기------------------
		gImg.scale(1.0, 1.0);
		gImg.drawImage(imgBack, 0, 0, width, height, this);
		gImg.drawImage(imgShadow, cx - sw, cy - sh, this);
		
		gImg.rotate(Math.toRadians(ang), cx, cy);
		gImg.drawImage(imgToy, cx-tw, cy-th, this);
		gImg.rotate(Math.toRadians(-ang), cx, cy);		
			
		//---- 가상화면을 실제화면으로 복사하기---------------
		g2.drawImage(img, 0, 0, width, height, this);
	}
	
	public void update(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		paint(g2);
	}
	
	private void RotateToy()
	{
		ang += dir;
		if (ang <= an1 || ang >= an2)
		{
			an1 ++;
			an2 --;
			dir = -dir;
			ang += dir;			
		}
	}
	
	class ToyMove extends Thread
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
