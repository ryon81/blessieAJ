package GUI;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

class Login extends JFrame
{
	JFrame f = new JFrame();
	
	Login()
	{		
		f.setSize(400,100);
		f.setLayout(new FlowLayout()); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
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
	}
	
	
	public static void main(String[] args) 
	{
		new Login();
				
	}

}
