package GUI;

import java.awt.*;

public class TextAreaTest 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Comments");
		f.setSize(400,220);
		f.setLayout(new FlowLayout());
		
		TextArea comments = new TextArea("�ϰ� ���� ���� ��������",10,50);
		
		f.add(comments);		
		comments.append("�Ƹ���");
		comments.selectAll();
		f.setVisible(true);

	}

}
