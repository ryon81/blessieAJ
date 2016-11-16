import java.util.Arrays;
import java.util.Scanner;

public class ArrayQsta2 
{
	public static void main(String[] args) 
	{	
	
		int num = 0;
		
		System.out.print("정수를 입력하세요.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);		
		
		int[] fibo = new int[num];
		fibo[0] = 1; 
		fibo[1] = 1;
		
		for (int i = 2; i < fibo.length; i++)
		{
			fibo[i]=fibo[i-1]+fibo[i-2];			
		}
		
		System.out.print(Arrays.toString(fibo));
		
		scanner.close();				
	}
}
	

