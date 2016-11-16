import java.util.Scanner;

public class RepQt03_a 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int i = 2;
		
		System.out.print("정수를 입력하세요.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt (tmp);
		
		
		while (num > 1)
		{
			if (num % i == 0)
			{
				System.out.printf("%d ", i);
				num /= i;
			} else 
			{
				i++;
			}
		}
		
		scanner.close();
	}
}