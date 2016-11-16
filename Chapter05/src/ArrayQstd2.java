public class ArrayQstd2 
{
	public static void main(String[] args) 
	{
		int [][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] m2 = {{1,0,0},{0,1,0},{0,0,1}};
		int [][] mul = new int [3][3];
				
		for (int i=0; i<m1.length;i++)
		{
			for (int j=0;j<m1[0].length;j++)
			{
				for (int k=0;k<m2.length;k++)
				{
					mul[i][j] += m1[i][k] * m2[k][j];					
				}
				System.out.printf("%2d ", mul[i][j]);				
			}
			System.out.println();
		}
			
	}
}
