import java.util.*;

public class ArrayQsta1 
{
	public static void main(String[] args) 
	{
		int[] kilo = new int[5];
		Scanner scanner = new Scanner (System.in);
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("������ �Է��ϼ���.>");			
			kilo[i] = scanner.nextInt();			
		}
		
		scanner.close();		
		
		int max = kilo[0];
		int min = kilo[0];
		
		for (int i = 1; i < kilo.length; i++)
		{
			if (max < kilo[i])
			{
				max = kilo[i];
				
			} else if (min > kilo[i])
			{
				min = kilo[i];
			}
		}
		System.out.printf("%n�ְ� �����Դ� %dKg%n���� �����Դ� %dKg",max, min);
				
	}

}
