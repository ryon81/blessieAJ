public class ArrayQstc2 
{
	public static void main(String[] args) 
	{
		int [ ] score = {23,45,12,34,65,23,89,61,26,11};
		int [ ] rank = new int [10];
		
		//------- 배열 복사------
		for (int i=0; i<score.length;i++)
		{
			rank[i]=score[i];
		}			
		
		//-----------rank배열 정렬-----------
		for (int i = 0 ; i < rank.length; i++)
		{
			for (int j = i+1 ; j < rank.length; j++)
			{
				// -------- 오름차순-------
				if(rank[i] > rank[j])
				{
					int tmp =rank [i];
					rank [i] = rank [j];
					rank [j] = tmp;
				}				
			}
		}			
		
		//----------배열 값 비교 및 출력---------
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
		}		
	}
}
