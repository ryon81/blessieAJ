package GUI;

import java.awt.*;

class GridLayoutTest 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("GridLayoutTest");
		f.setSize(550,550);
		f.setLayout(new GridLayout(3,2));   //(3��, 2��)
		
		//�� ���� �ڵ���� ��� ���� -> ���� -> ������ ���� ������ ��ġ�ȴ�. 
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.setVisible(true);
	

	}

}
