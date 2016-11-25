package GUI;

import java.awt.*;
import java.awt.event.*;

class TextFieldTest2 extends Frame 
{
	Label lid;
	Label lpwd;
	TextField tfld;
	TextField tfPwd;
	Button ok;
	
	TextFieldTest2(String title)
	{
		super(title);
		
		lid = new Label("ID: ", Label.RIGHT);
		lpwd = new Label("Password: ", Label.RIGHT);
		
		tfld = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');
		
		ok = new Button("OK");
		
		tfld.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout());
		add(lid);
		add(tfld);
		add(lpwd);
		add(tfPwd);
		add(ok);
		setSize(450,65);
		setVisible(true);				
	}
	
	public static void main(String[] args) 
	{
		TextFieldTest2 f = new TextFieldTest2("Login");		
	}
	
	class EventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			String id = tfld.getText();
			String password = tfPwd.getText();
			if(!id.equals("javachobo"))
			{
				System.out.println("�Է��Ͻ� ID�� ��ȿ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
				tfld.requestFocus();
				tfld.selectAll();
			} else if (!password.equals("asdf"))
			{
				System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
			} else
			{
				System.out.println(id + "��, ���������� �α��εǾ����ϴ�.");						
			}			
		}	
	}
}
