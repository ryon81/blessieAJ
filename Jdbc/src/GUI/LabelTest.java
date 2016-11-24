package GUI;

import java.awt.*;

public class LabelTest 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);    // 배치속성을 제거하고 임의로 넣기 위하여 필요
		f.setLocation(500, 400);
		
		Label id = new Label("ID: ");
		id.setBounds (50,50,30,10);
		
		
		Label pwd = new Label("Password: ");
		pwd.setBounds (50,65,100,100);
		
		f.add(id);
		f.add(pwd);
		f.setVisible(true);
	}

}