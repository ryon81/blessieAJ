
public class RepDuQta01 {

	public static void main(String[] args) 
	{
				
		for (int i = 0; i < 5; i++)
		{			
			for (int j = 2; j <= 5-i ; j++)
			{
				System.out.print(" ");								
			}
			for (int k = 0; k <= i; k++)
			{
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
	}
}