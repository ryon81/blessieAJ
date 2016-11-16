public class ArrayQste1_1 
{
	public static void main(String[] args) 
	{
		int r, c, cl, cr, m;
		int num = 1, n = 5;
		int a[][] = new int [n][n];
		m = n / 2;
		cl = cr = m;
		
		for (r= 0; r < n; r++)
		{
			for (c = cl; c <= cr; c++)
			{
				a[r][c] = num++;
			}
			if (r < m)
			{
				cl--;
				cr++;
			}else
			{
				cl++;
				cr--;
			}
			
		}
		
		for (r = 0; r < 5; r++ )
		{				
			for (c = 0; c < 5; c++)
			{							
				System.out.printf("%2d ", a[r][c]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for (r = 0; r < 5; r++ )
		{				
			for (c = 0; c < 5; c++)
			{							
				if(a[r][c] !=0)
				{
					System.out.printf("%2d ", a[r][c]);
				} else
				{
					System.out.print("   ");
				}						
			}
			System.out.println();
		} 
	}
}

