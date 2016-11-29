package GUI;

import java.awt.*;
import java.awt.event.*;

class GraphicsEx1 extends Frame
{
	public static void main(String[] args) 
	{
		new GraphicsEx1("GraphicsEx1");
	}
	
	public void paint(Graphics g)
	{
		// --- �۲� ��Ÿ�� ---
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		g.drawString("Graphics�� �̿��ؼ� �׸��� �׸��ϴ�.", 10, 50);
		// --- �۲� ��Ÿ�� ---
		
		// --- �⺻ �� �׸��� ---
		g.drawOval(8,30,10,10);  // (������ �»�� x��ǥ, ������ �»�� Y��ǥ, width, height)
		// --- �⺻ �� �׸��� ---
		
		// --- �⺻���� ��Ÿ�� ---		
		g.setColor(Color.blue);
		g.fillOval(100,100,50,50);
		
		g.setColor(Color.red);
		g.drawLine(100,100,150,150);		
		g.fillRoundRect(200,100,120,80,30,30); // (������ �»�� x��ǥ, ������ �»�� Y��ǥ, width, height, �ձٲ����� width, �ձٲ����� height)
		
		g.setColor(Color.orange);
		g.fillPolygon(new int[] {50,100,150,200}, new int[] {250, 200, 200, 250}, 4);
		
		g.setColor(Color.cyan);
		g.fillArc(250,200,100,100,0,120);
	}
	
	public GraphicsEx1 (String title)
	{
		super(title);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we) 
			{
				System.exit(0);
			} 			
		});
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
	}
}
