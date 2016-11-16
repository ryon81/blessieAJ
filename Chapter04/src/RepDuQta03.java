
public class RepDuQta03 
{
	public static void main(String[] args) 
	{
		int sum = 1;
		
		for (int i = 1; i <= 5; i++)
		{						
			if (i % 2 != 0)
			{
				for (int j = sum; j < sum + 5  ; j++)
				{
					System.out.printf("%2d ", j);
				}
				sum = sum + 4;
								
			} else
			{
				for (int k = sum + 5; k > sum; k--)
				{
					System.out.printf("%2d ", k);
				}
				sum = sum + 6;
			}
			System.out.println();
		}
	}
}
