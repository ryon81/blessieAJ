import java.util.*;

public class RepQt04_a 
{
	public static void main(String[] args) 
	{
		int num = 0;		
				
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt (tmp);
		
		for (int i = 2; i<=num; i++)
		{			
			if (num % i == 0)
			{				
				if (num == i)
				{
					System.out.printf("%d�� �Ҽ� �Դϴ�.", num);
				} else 
				{
					System.out.printf("%d�� �Ҽ��� �ƴմϴ�.", num);
				}				
				break;
			} 
		}
		 
		scanner.close();
	}
}
