import java.util.Scanner;

public class RepQt02 
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("첫 번째 정수를 입력하세요.>");
		Scanner scanner1 = new Scanner (System.in);
		String tmp1 = scanner1.nextLine();
		num1 = Integer.parseInt (tmp1);
		
				
		System.out.print("두 번째 정수를 입력하세요.>");
		Scanner scanner2 = new Scanner (System.in);
		String tmp2 = scanner2.nextLine();
		num2 = Integer.parseInt (tmp2);
		
		scanner1.close();
		scanner2.close();
		
		int mx = 0;
		int mn = 0;
		
		if (num1 > num2)
		{
			for (int i = num1; i>1; i--)
		    {
				if (num1 % i == 0 && num2 % i == 0)
				{										
					mx = i;
					mn = (num1 * num2)/mx; 
					break;
				} else
				{
					mx = 1;
					mn = (num1 * num2)/mx;
				}
			}
		} else if (num1 < num2)
		{
			for (int i = num2; i>1; i--)
		    {
				if (num2 % i == 0 && num1 % i == 0)
				{										
					mx = i;
					mn = (num1 * num2)/mx; 
					break;
				} else
				{
					mx = 1;
					mn = (num1 * num2)/mx;
				}
			}
			
		} else if (num1 == num2)
		{
			mx = num1;
			mn = num2; 
		}
		
		System.out.printf("최대 공약수: %d 최소 공배수: %d", mx, mn);
		
		
	}
}