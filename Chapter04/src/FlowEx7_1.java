import java.util.Scanner;


public class FlowEx7_1 
{

	public static void main(String[] args) 
	{
		int user, com;
		
		System.out.print("가위(1), 바위(2),보(3) 중 하나를 숫자로 입력하세요.>");
		
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		user = Integer.parseInt(tmp);
		scanner.close();
		
		com = (int)(Math.random() * 3 ) + 1;
		
		String user1 = " ";
		String com1 = " ";
		
		if (user == 1)
		{
			user1 = "가위(1)";
		} else if (user == 2)
		{
			user1 = "바위(2)";
		} else {user1 ="보(3)";}
		
		System.out.println("당신은 " + user1 + "입니다.");
		
		if (com == 1)
		{
			com1 = "가위(1)";
		} else if (com == 2)
		{
			com1 = "바위(2)";
		} else {com1 ="보(3)";}
				
		System.out.println("컴퓨터는 " + com1 + "입니다.");
		
		switch(user-com)
		{
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}

	}

}
