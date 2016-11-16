
public class RepDuQta02 
{
	
	public static void main(String[] args) 
	{
		for (int i = 1; i < 10; i++)
		{
			if (i < 5)
			{
				for (int j = 0; j < i ; j++)
				{
					System.out.print("*");
				}
			} else
			{
				for (int k = i; k < 10; k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

