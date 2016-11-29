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
			/* -- ��ü Ű���忡 ���� KeyEvent�� ������� ���ڿ� ���� ��� --
			int keycode = e.getKeyCode();
			char keychar = e.getKeyChar();
			String keystring = e.getKeyText(Keycode);
			
			System.out.println("char = " + keychar);
			System.out.println("code = " + Keycode);
			System.out.println("text = " + keystring);
			----------------------------------------------------- */
			
			//VK_�� �� static�� ����� KeyEvent�� ������ �ش�.
			int keycode = e.getKeyCode();
			if (keycode == KeyEvent.VK_UP)
			{
				System.out.println("���� �Է��ϼ̽��ϴ�.");
			} else if (keycode == KeyEvent.VK_DOWN)
			{
				System.out.println("�Ʒ��� �Է��ϼ̽��ϴ�.");
			}else if (keycode == KeyEvent.VK_LEFT)
			{
				System.out.println("������ �Է��ϼ̽��ϴ�.");
			}else if (keycode == KeyEvent.VK_RIGHT)
			{
				System.out.println("�������� �Է��ϼ̽��ϴ�.");
			}
		}	
		
	}

}
