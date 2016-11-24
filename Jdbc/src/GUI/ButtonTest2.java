package GUI;

import java.awt.*;

public class ButtonTest2 
{

	public static void main(String[] args) 
	{
		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);    // 배치속성을 제거하고 임의로 넣기 위하여 필요
		f.setLocation(500, 400);;
		
		Button b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100,75);
		
		f.add(b);
		f.setVisible(true);
	}

}
