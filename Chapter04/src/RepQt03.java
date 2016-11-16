import java.util.Scanner;

public class RepQt03 
{
	public static void main(String[] args) 
	{
		int num = 0;
						
		System.out.print("정수를 입력하세요.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt (tmp);
		
		for (int i = 2; i<=num; i++)
		{			
			if (num % i == 0)
			{
				System.out.printf("%d ", i);
				num /= i;
				--i;
			}
		}
		
		scanner.close();
	}
}