public class ArraySample01 
{
	public static void main(String[] args) 
	{
		/* --- �迭 ���� �� �ʱ�ȭ ---
		 int[] score;
		 score = new int[5];
		
		 score[0]=10;
		 score[1]=20;
		 score[2]=30;
		 score[3]=40;
		 score[4]=50; 
		 ---------------------- */
		
		/*-- ����� �����κ��� ���ٷ� ����ȭ --
		// int [] score = new int[5]; 
		 score[0]=10;
		 score[1]=20;
		 score[2]=30;
		 score[3]=40;
		 score[4]=50;  
		--------------------------- */
		
		/* ------ ��ü�� ���ٷ� ǥ�� ------
		int [] score = {10,20,30,40,50};
		------------------------------ */
		
		// -----for���� �̿��Ͽ� �ʱ�ȭ ---- // 
		
		int[] score = new int[5];
		
		for (int i=0; i <score.length;i++)
		{
			score [i] = (i+1)*10;			
		}
		//--------------------------//
		
		
		// ------for�� Ȱ���Ͽ� ����ϱ�--------//
		for (int i=0; i < score.length; i++)
		{
			System.out.println(score[i]);
		}
		 //------------------------------- //

	}

}
