public class ArrayQstb1 
{
	public static void main(String[] args) 
	{
		int[][] score = new int [4][];
		score [0] = new int [3];
		score [1] = new int [2];
		score [2] = new int [2];
		score [3] = new int [3];
		
		int i=0;
		int j=0;
		
		for (int[] tmp: score)
		{ 			
			for (int num: tmp)
			{	
				score[i][j] = (i+1)*10+j;
				num = score[i][j];
				System.out.printf("%2d ", num);	
				j++;
			}
			i++; 
			j=0;
			System.out.println();			
		}
		
		/* -------기존 for문-------
		 for (int i=0; i< score.length;i++)
		 {
		 	for (int j=0; j<score[i].length; j++)
		 	{
		 		score[i][j]=(i+1)*10+j;
		 		System.out.printf("%2d ", score[i][j]);		 		
		 	}
		 	System.out.println();
		 } 
		*/
		
		
		/*  ======출력과 초기화 분리========
		 for (int[] tmp: score)
		{ 			
			for (int num: tmp)
			{	
				score[i][j] = (i+1)*10+j;		
				j++;
			}
			i++; 
			j=0;						
		}
		  
		for (int[] tmp: score)
		{ 			
			for (int num: tmp)
			{	
				System.out.print(num + " ");
			}
			System.out.println();
		}
		*/
		
		
	}
	
}
