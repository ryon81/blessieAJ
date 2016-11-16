import java.util.*;

public class RepQt04 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int num2 = 1;
				
		System.out.print("정수를 입력하세요.>");
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
			 System.out.printf("%d는 소수가 아닙니다.", num);
		} else
		{
			System.out.printf("%d는 소수 입니다.", num);
		}		
	}	
}