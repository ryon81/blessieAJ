package GUI;

import java.awt.*;
import java.awt.event.*;

class KeyTest extends Frame
{
	KeyTest()
	{
		setSize(300,400);
		setLocation(100,100);
		setVisible(true);
		
		addKeyListener(new KeyEventHandler());
	}
	
	public static void main(String[] args)
	{
		new KeyTest();
	}
	
	class KeyEventHandler extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			/* -- 전체 키보드에 대한 KeyEvent용 상수값과 문자에 대한 출력 --
			int keycode = e.getKeyCode();
			char keychar = e.getKeyChar();
			String keystring = e.getKeyText(Keycode);
			
			System.out.println("char = " + keychar);
			System.out.println("code = " + Keycode);
			System.out.println("text = " + keystring);
			----------------------------------------------------- */
			
			//VK_값 은 static한 상수로 KeyEvent로 지정해 준다.
			int keycode = e.getKeyCode();
			if (keycode == KeyEvent.VK_UP)
			{
				System.out.println("위를 입력하셨습니다.");
			} else if (keycode == KeyEvent.VK_DOWN)
			{
				System.out.println("아래를 입력하셨습니다.");
			}else if (keycode == KeyEvent.VK_LEFT)
			{
				System.out.println("왼쪽을 입력하셨습니다.");
			}else if (keycode == KeyEvent.VK_RIGHT)
			{
				System.out.println("오른쪽을 입력하셨습니다.");
			}
		}	
		
	}

}
