package GUI;

import java.awt.*;
import java.awt.event.*;


class CardLayoutTest 
{
	public static void main(String[] args) 
	{
		final Frame f = new Frame("CardLayoutTest");
		final CardLayout card = new CardLayout(10,10);
		f.setLayout(card);
		
		Panel card1 = new Panel();
		card1.setBackground(Color.lightGray);
		card1.add(new Label("Card 1"));
		Panel card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("Card 2"));
		Panel card3 = new Panel();
		card3.setBackground(Color.cyan);
		card3.add(new Label("Card 3"));
		
		f.add(card1, "1");
		f.add(card2, "2");
		f.add(card3, "3");
		
		class Handler extends MouseAdapter
		{
			public void mouseClicked(MouseEvent e)
			{
				if(e.getModifiers() == e.BUTTON2_MASK)  
					// button1: 왼쪽 버튼, button2: 휠버튼, button3: 오른쪽 버튼  
				{
					card.previous(f);
				} else
				{
					card.next(f);
				}
			}
		}
		
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());
		
		f.setSize(200,200);
		f.setLocation(200, 200);
		f.setVisible(true);
		
		card.show(f, "1"); // frame에 소속된 카드 중 1번을 보여줌
		
		

	}

}
