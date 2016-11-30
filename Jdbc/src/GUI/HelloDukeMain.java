package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloDukeMain extends JFrame implements Runnable 
{
	Canvas can;
	Image buffer;
	Image[] duke;
	Toolkit tk;
	boolean repeat = true;
	
	public HelloDukeMain()
	{
		tk = Toolkit.getDefaultToolkit();  // �̹����� ����ϱ� ���� �����۾�
		initDuke();
		
		// �̹��� �׸��� 
		this.add(can = new Canvas()  // �̹����� ���� �� �ִ� ������ ��ȭ��
		{
			@Override
			public void paint(Graphics g)
			{
				g.drawImage(buffer, 0, 0, this);
			}
			
			@Override
			public void update(Graphics g)
			{
				paint(g);
			}
		});
				
		//�����̽��� �Ͻ� ����
		can.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				int code = e.getKeyCode();
				switch (code)
				{
				case KeyEvent.VK_SPACE: 
					repeat = !repeat;
					if (repeat) makeThread();
					break;
				}
			}
		});
		
		// ������ â Xǥ ������ ����		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setBounds(300,100,400,400);  // x��ǥ, y��ǥ, x���� , y ����
		setVisible(true);
		
		makeThread(); // Thread�� �����ϱ� 
	}
	public void makeThread()
	{
		new Thread(this).start();   //�������̽��� ��ӹ��� ThreadŬ���� �ڽ��� �����Ѵ�.
	}
	
	//�迭�� �̹��� ����
	public void initDuke()
	{
		duke = new Image[10];
		
		for(int i = 0; i <duke.length; i++)
		{
			duke[i] = tk.getImage(String.format("images/Duke%d.gif",i+1));
		}
	}
	
	// ĵ�������� �̹��� ǥ�õǴ� ��ġ �����ϱ�
	public void bufferPaint(int n)
	{
		buffer = createImage(can.getWidth(), can.getHeight());
		Graphics buffer_g = buffer.getGraphics();
		
		buffer_g.drawImage(duke[n], 30, 30, this);
		
		can.repaint();
	}

	public static void main(String[] args) 
	{
		new HelloDukeMain();

	}

	@Override
	public void run() 
	{
		while(true)
		{
			for(int i = 0; i<duke.length; i++)
			{
				if(!repeat) return;
				try
				{
					Thread.sleep(50);  //0.05��
				} catch (InterruptedException ex){}
					bufferPaint(i); 
			}
		}		
	}
}
