public class RepDuQta03_1 
{
	public static void main(String[] args) 
	{
		int maxLine = 5;
		int data;		
		int lineNumber; 
		
		for (lineNumber = 1; lineNumber <= maxLine; lineNumber++)
		{						
			if (lineNumber % 2 == 0)
			{
				for (data = lineNumber * 5; data >= (lineNumber * 5) - 4; data--)
				{
					System.out.printf("%d\t ", data);
				}
				System.out.printf("\n");
								
			} else
			{
				for (data = (5 * (lineNumber-1))+1; data <=(5 * (lineNumber-1))+5; data++)
				{
					System.out.printf("%d\t ", data);
				}
				System.out.printf("\n");
			}
			
		}
	}
}

