package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Yut2Test  extends Frame 
{
	String[] tYut = {"○○○○", "●●●●"};
	String[] Yut = { "윷", "걸", "개", "도", "모" };
	Button b;
	Label la, la1, la2, la3, la4, la5;
	Font f;
	Image[] imgYut;
	
		
	public Yut2Test()
	{
		setLayout(null);
		
		imgYut = new Image[2];
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		imgYut[0] = Toolkit.getDefaultToolkit().getImage("images/yut_0.png");
		imgYut[1] = Toolkit.getDefaultToolkit().getImage("images/yut_1.png");
		
		f = new Font("Ferit", Font.PLAIN, 20);

		b = new Button("확인");
		b.setBounds(350, 600, 120, 60);
		
		la = new Label("윷을 던지세요");
		la.setFont(f);
		la.setForeground(Color.WHITE);
				
		la5 = new Label("결과");

		la.setBounds(330, 40, 250, 60);
		
		la5.setBounds(400, 550, 40, 40);
		la5.setFont(f);
		la5.setForeground(Color.WHITE);
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				repaint();
			}
		});
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		add(la);
		
		add(la5);
		add(b);
		setBackground(Color.BLACK);
		setBounds(200, 100, 800, 800);
		setVisible(true);		
	}
		
	public static void main (String[] args)
	{
		new Yut2Test();
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Random rnd = new Random();
		int n1 = 1 - rnd.nextInt(10) / 6;
		int n2 = 1 - rnd.nextInt(10) / 6;
		int n3 = 1 - rnd.nextInt(10) / 6;
		int n4 = 1 - rnd.nextInt(10) / 6;
		int n = n1 + n2 + n3 + n4;
		
		la5.setText(Yut[n]);
		
		g2.drawImage(imgYut[n1], 120,150,this);
		g2.drawImage(imgYut[n2], 450,150,this);
		g2.drawImage(imgYut[n3], 120,250,this);
		g2.drawImage(imgYut[n4], 450,250,this);
	}
}
	
