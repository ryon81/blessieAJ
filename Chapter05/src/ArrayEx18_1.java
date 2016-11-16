public class ArrayEx18_1 
{
	public static void main(String[] args) 
	{
		/* ----기본 구조--------
		int[][] score; 
		score = new int [5] [3];
		--------------------*/
		
		/*-----간략형 1 -----------
		int[][] score = new int [5][3];*/
		
		/*--------초기화 기본구조--------
		score[0][0]=1;
		score[0][1]=2;
		score[0][2]=3;
		score[1][0]=4;
		score[1][1]=5;
		score[1][2]=6;
		score[2][0]=7;
		score[2][1]=8;
		score[2][2]=9;
		score[3][0]=10;
		score[3][1]=11;
		score[3][2]=12;
		score[4][0]=13;
		score[4][1]=14;
		score[4][2]=15;*/
		
		//-----초기화 포함 기본구조---- 
		int[][] score = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
				};
		
		for (int[] tmp: score)
		{						
			for (int i: tmp)
			{
				System.out.printf("%2d ",i);
			}
		}
		
		/* -----------중첩for문으로 출력하기---------------
		 for (int i = 0; i < score.length;i++ )
		{
			for (int j = 0; j < score[0].length; j++)
			{				
				System.out.printf("%2d ",score[i][j]);
			}			
		}*/
		
		
		
		/* -------------초기화 및 출력하기-----------------
		System.out.printf("%2d ",score[0][0]=1);
		System.out.printf("%2d ",score[0][1]=2);
		System.out.printf("%2d ",score[0][2]=3);
		System.out.printf("%2d ",score[1][0]=4);
		System.out.printf("%2d ",score[1][1]=5);
		System.out.printf("%2d ",score[1][2]=6);
		System.out.printf("%2d ",score[2][0]=7);
		System.out.printf("%2d ",score[2][1]=8);
		System.out.printf("%2d ",score[2][2]=9);
		System.out.printf("%2d ",score[3][0]=10);
		System.out.printf("%2d ",score[3][1]=11);
		System.out.printf("%2d ",score[3][2]=12);
		System.out.printf("%2d ",score[4][0]=13);
		System.out.printf("%2d ",score[4][1]=14);
		System.out.printf("%2d ",score[4][2]=15);
		-------------------------------------*/
	}

}

