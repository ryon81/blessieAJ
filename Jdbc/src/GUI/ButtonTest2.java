package GUI;

import java.awt.*;

public class ButtonTest2 
{

	public static void main(String[] args) 
	{
		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);    // ��ġ�Ӽ��� �����ϰ� ���Ƿ� �ֱ� ���Ͽ� �ʿ�
		f.setLocation(500, 400);;
		
		Button b = new Button("Ȯ��");
		b.setSize(100, 50);
		b.setLocation(100,75);
		
		f.add(b);
		f.setVisible(true);
	}

}
