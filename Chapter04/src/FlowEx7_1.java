import java.util.Scanner;


public class FlowEx7_1 
{

	public static void main(String[] args) 
	{
		int user, com;
		
		System.out.print("����(1), ����(2),��(3) �� �ϳ��� ���ڷ� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		user = Integer.parseInt(tmp);
		scanner.close();
		
		com = (int)(Math.random() * 3 ) + 1;
		
		String user1 = " ";
		String com1 = " ";
		
		if (user == 1)
		{
			user1 = "����(1)";
		} else if (user == 2)
		{
			user1 = "����(2)";
		} else {user1 ="��(3)";}
		
		System.out.println("����� " + user1 + "�Դϴ�.");
		
		if (com == 1)
		{
			com1 = "����(1)";
		} else if (com == 2)
		{
			com1 = "����(2)";
		} else {com1 ="��(3)";}
				
		System.out.println("��ǻ�ʹ� " + com1 + "�Դϴ�.");
		
		switch(user-com)
		{
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
			break;
		}

	}

}
