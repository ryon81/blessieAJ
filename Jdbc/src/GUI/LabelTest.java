package GUI;

import java.awt.*;

public class LabelTest 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);    // ��ġ�Ӽ��� �����ϰ� ���Ƿ� �ֱ� ���Ͽ� �ʿ�
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