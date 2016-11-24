package GUI;

import java.awt.*;
import java.awt.event.*;

class DialogTest2 
{

	public static void main(String[] args) 
	{
		Frame f = new Frame("Parent");
		f.setSize(300,200);
		//f.setLocation(500, 500);
		
		final Dialog info = new Dialog(f,"Information", true);  //frame�� �θ�� ����Ѵ�.
		info.setSize(140, 90);
		info.setLocation(50, 50); // ȭ��������� ��ġ�Ѵ�.
		info.setLayout(new FlowLayout());
		
		Label msg = new Label ("This is modal Dialog",Label.CENTER);
		Button ok = new Button("OK");
		
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				info.dispose();
			}
		});
		info.add(msg);
		info.add(ok);
		f.setVisible(true);
		info.setVisible(true);
	}

}
