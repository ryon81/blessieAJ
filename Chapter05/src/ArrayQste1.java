public class ArrayQste1 
{

	public static void main(String[] args) 
	{
		int [][] num = new int [5][5];
		int i=0, j=0, sum = 0;
		
		//----------------초기화 하기------------------				
		for (i = 0; i < num.length; i++)
		{
			if (i == 0 || i == 4)
			{
				j=2;				
				num[i][j] = ++sum;
			} else if (i == 1 || i == 3)
			{
				for (j = 1 ; j<4; j++)
				{
					num[i][j] = ++sum;
				}
			} else if (i == 2)
			{
				for (j = 0 ; j<5; j++)
				{
					num[i][j] = ++sum;				
				}
			}
		}
		
		
		//---------------초기화값 출력---------------
		for (int x = 0; x < 5; x++ )
		{				
			for (int y = 0; y < 5; y++)
			{							
				System.out.printf("%2d ", num[x][y]);
			}
			System.out.println();
		}
		//----------------------------------------
		
		System.out.printf("%n---------------------%n%n");
		
		//----------------최종출력------------------
		for (int x = 0; x < 5; x++ )
		{				
			for (int y = 0; y < 5; y++)
			{							
				if (num[x][y] == 0)
				{
					System.out.print("   ");	
				} else
				{
					System.out.printf("%2d ", num[x][y]);
				}
			}			
			System.out.println();
		}
		//------------------------------------------		
	}
}
