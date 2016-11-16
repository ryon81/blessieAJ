public class ArrayQstd1 
{
	public static void main(String[] args) 
	{
		int [][] m1 = {{1,2},{3,4}};
		int [][] m2 = {{5,6},{7,8}};
		int [][] sum = new int [2][2];
		
		for (int i=0; i<m1.length;i++)
		{
			for (int j=0;j<m2.length;j++)
			{
				sum[i][j] = m1[i][j]+m2[i][j];
				System.out.printf("%2d ", sum[i][j]);
			}
			System.out.println();
		}		
		
	}
}
