package GUI;

import java.awt.*;

public class TextFieldTest 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Login");
		f.setSize(400,70);
		f.setLayout(new FlowLayout());    // ��ġ�Ӽ��� �����ϰ� ���Ƿ� �ֱ� ���Ͽ� �ʿ�
				
		Label lid = new Label("ID: ", Label.RIGHT);
		Label lpwd = new Label(("Password: "), Label.RIGHT);		
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');  // <-- ��й�ȣ�� ���Ȼ����� ���� ĳ���͸� �� ���̰� �� �� ���
				
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);
		
		/* 
		 setText(String) 
		 getText()
		 getEditable(boolean)  <--- Read-only �ϴ� ��
		 */
		 
	}

}