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
		tk = Toolkit.getDefaultToolkit();  // 이미지를 사용하기 위한 선행작업
		initDuke();
		
		// 이미지 그리기 
		this.add(can = new Canvas()  // 이미지를 만들 수 있는 일종의 도화지
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
				
		//스페이스바 일시 멈춤
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
		
		// 윈도우 창 X표 눌러서 끄기		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setBounds(300,100,400,400);  // x좌표, y좌표, x길이 , y 길이
		setVisible(true);
		
		makeThread(); // Thread로 실행하기 
	}
	public void makeThread()
	{
		new Thread(this).start();   //인터페이스로 상속받은 Thread클래스 자신을 실행한다.
	}
	
	//배열에 이미지 삽입
	public void initDuke()
	{
		duke = new Image[10];
		
		for(int i = 0; i <duke.length; i++)
		{
			duke[i] = tk.getImage(String.format("images/Duke%d.gif",i+1));
		}
	}
	
	// 캔버스에서 이미지 표시되는 위치 지정하기
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
					Thread.sleep(50);  //0.05초
				} catch (InterruptedException ex){}
					bufferPaint(i); 
			}
		}		
	}
}
