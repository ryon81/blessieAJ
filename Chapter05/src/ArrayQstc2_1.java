public class ArrayQstc2_1 
{
	public static void main(String[] args) 
	{
		int [ ] score = {23,45,12,34,65,23,89,61,26,11};
		int [ ] rank = new int [10];
		int j =0;
		//------ ���ϳ��� �����ϰ� ����� ���� (�̿ϼ�)-----
		
		//------- �迭 ����------
		System.arraycopy(score, 0, rank, 0, score.length);			
		
		//-----------rank�迭 ����-----------
		for (int i = 0; i < score.length; i++)
		{
			for (j = i+1; j < rank.length; j++)
			{
				// -------- ��������-------
				if(rank[i] > rank[j])
				{
					int tmp = rank [i];
					rank [i] = rank [j];
					rank [j] = tmp;					
				}				
			}
			System.out.printf("%d(%d) ",score[i],j);									
		}			
		
		
		/*
		 for (int i=0; i < score.length;i++)
		{
			for (int j=0; j<rank.length;j++)
			{
				if(score[i] == rank[j])
				{
					System.out.printf("%d(%d) ",score[i],j+1);
					break;
				} 
			}									
		}		*/
	}
}
