package GUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class YousTest extends Frame 
{
	String[] tYut = {"○○○○", "●●●●"};
	String[] Yut = { "윷", "걸", "개", "도", "모" };
	Button b;
	Label la1, la2, la3, la4, la5;
		
	public YousTest()
	{
		setLayout(null);

		b = new Button("확인");
		la1 = new Label("●●●●");
		la2 = new Label("●●●●");
		la3 = new Label("●●●●");
		la4 = new Label("●●●●");
		la5 = new Label();

		la1.setBounds(100, 40, 80, 40);
		la2.setBounds(300, 40, 80, 40);
		la3.setBounds(100, 80, 80, 40);
		la4.setBounds(300, 80, 80, 40);
		la5.setBounds(220, 300, 80, 40);

		b.setBounds(220, 400, 40, 40);

		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Random rnd = new Random();
				int n1 = 1 - rnd.nextInt(10) / 6;
				int n2 = 1 - rnd.nextInt(10) / 6;
				int n3 = 1 - rnd.nextInt(10) / 6;
				int n4 = 1 - rnd.nextInt(10) / 6;
				int n = n1 + n2 + n3 + n4;

				la1.setText(tYut[n1]);
				la2.setText(tYut[n2]);
				la3.setText(tYut[n3]);
				la4.setText(tYut[n4]);
				la5.setText(Yut[n]);
			}
		});
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		add(la5);
		add(b);
		setBounds(100, 100, 500, 500);
		setVisible(true);		
	}
		
	public static void main (String[] args)
	{
		new YousTest();
	}

}
	
