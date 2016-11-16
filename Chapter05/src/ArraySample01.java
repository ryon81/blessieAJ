public class ArraySample01 
{
	public static void main(String[] args) 
	{
		/* --- 배열 선언 및 초기화 ---
		 int[] score;
		 score = new int[5];
		
		 score[0]=10;
		 score[1]=20;
		 score[2]=30;
		 score[3]=40;
		 score[4]=50; 
		 ---------------------- */
		
		/*-- 선언과 생성부분을 한줄로 간소화 --
		// int [] score = new int[5]; 
		 score[0]=10;
		 score[1]=20;
		 score[2]=30;
		 score[3]=40;
		 score[4]=50;  
		--------------------------- */
		
		/* ------ 전체를 한줄로 표시 ------
		int [] score = {10,20,30,40,50};
		------------------------------ */
		
		// -----for문을 이용하여 초기화 ---- // 
		
		int[] score = new int[5];
		
		for (int i=0; i <score.length;i++)
		{
			score [i] = (i+1)*10;			
		}
		//--------------------------//
		
		
		// ------for문 활용하여 출력하기--------//
		for (int i=0; i < score.length; i++)
		{
			System.out.println(score[i]);
		}
		 //------------------------------- //

	}

}
