import java.util.Scanner;

public class Quest03 
{

	public static void main(String[] args) 
	{
		int def = 0;
		
		System.out.print("������ �Է��ϼ���.>");
		
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		def = Integer.parseInt(tmp);
		scanner.close();
		
		if (def == 0)
		{
			System.out.println("0�� ��� �� �� �����ϴ�.");
		} else
		{
			if (def % 6 == 0 ) 
			{
				System.out.println("2�� ����̸鼭 3�� ����Դϴ�.");
				
			} else if (def % 2 == 0 )  
			{
					System.out.println("2�� ����Դϴ�.");
					
			} else if (def % 3 == 0)
			{
				System.out.println("3�� ����Դϴ�.");
				
			} else 
			{
				System.out.println("2�� 3�� ����� �ƴմϴ�.");
			}			
		}
	}

}
