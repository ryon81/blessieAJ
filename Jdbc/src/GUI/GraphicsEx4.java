package GUI;

import java.awt.*;
import java.awt.event.*;

class GraphicsEx4 extends Frame implements MouseMotionListener 
{
	int x = 0;
	int y = 0;
	
	Image img = null;
	Graphics gimg = null;
	
	public static void main(String[] args) 
	{
		new GraphicsEx4("GraphicsEx4");

	}
	
	public GraphicsEx4(String title)
	{
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		setBounds(100,100,500,500);
		setVisible(true);
		
		img = createImage(500,500);
		gimg = img.getGraphics();
		gimg.drawString("왼쪽버튼을 누른 채로 마우스를 움직여보세요.", 10, 50);
		repaint();
	}
	
	public void paint(Graphics g) 
	{
		if(img != null) g.drawImage(img, 0, 0, this);
	}
	
	public void mouseMoved(MouseEvent me)
	{		
	}
	
	public void mouseDragged(MouseEvent me)
	{
		if(me.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK)
		{
			x = me.getX();
			y = me.getY();
			gimg.drawString("*",x,y);
			repaint();
		}
	}
}
