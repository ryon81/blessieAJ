import java.util.*;

public class RepQt04 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int num2 = 1;
				
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt (tmp);
		
		for (int i = 2; i<num; i++)
		{			
			num2 = num2 * (num%i); 
		}
		 
		scanner.close();
		
		if (num2 == 0)
		{
			 System.out.printf("%d�� �Ҽ��� �ƴմϴ�.", num);
		} else
		{
			System.out.printf("%d�� �Ҽ� �Դϴ�.", num);
		}		
	}	
}