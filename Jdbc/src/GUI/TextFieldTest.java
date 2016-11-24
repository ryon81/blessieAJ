package GUI;

import java.awt.*;

public class TextFieldTest 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Login");
		f.setSize(400,70);
		f.setLayout(new FlowLayout());    // 배치속성을 제거하고 임의로 넣기 위하여 필요
				
		Label lid = new Label("ID: ", Label.RIGHT);
		Label lpwd = new Label(("Password: "), Label.RIGHT);		
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');  // <-- 비밀번호등 보안상으로 실제 캐릭터를 안 보이게 할 때 사용
				
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);
		
		/* 
		 setText(String) 
		 getText()
		 getEditable(boolean)  <--- Read-only 하는 법
		 */
		 
	}

}