package GUI;

import java.awt.*;

class GridLayoutTest 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("GridLayoutTest");
		f.setSize(550,550);
		f.setLayout(new GridLayout(3,2));   //(3행, 2열)
		
		//맨 위에 코드부터 상단 좌측 -> 우측 -> 다음행 좌측 순으로 배치된다. 
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.setVisible(true);
	

	}

}
