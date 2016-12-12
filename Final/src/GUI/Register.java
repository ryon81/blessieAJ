package GUI;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

public class Register extends JFrame
{
	JFrame f = new JFrame();
	
	Register()
	{		
		f.setSize(400,100);
		f.setLayout(new FlowLayout()); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		Label lid = new Label("ID: ", Label.RIGHT);
		Label lpwd = new Label(("Password: "), Label.RIGHT);		
		Label relpwd = new Label(("RE-Password: "), Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		TextField repwd = new TextField(10);
		pwd.setEchoChar('*');  // <-- ��й�ȣ�� ���Ȼ����� ���� ĳ���͸� �� ���̰� �� �� ���
		repwd.setEchoChar('*');
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(relpwd);
		f.add(repwd);
		
		f.setVisible(true);
	}
}
