public class ArrayQstc2 
{
	public static void main(String[] args) 
	{
		int [ ] score = {23,45,12,34,65,23,89,61,26,11};
		int [ ] rank = new int [10];
		
		//------- �迭 ����------
		for (int i=0; i<score.length;i++)
		{
			rank[i]=score[i];
		}			
		
		//-----------rank�迭 ����-----------
		for (int i = 0 ; i < rank.length; i++)
		{
			for (int j = i+1 ; j < rank.length; j++)
			{
				// -------- ��������-------
				if(rank[i] > rank[j])
				{
					int tmp =rank [i];
					rank [i] = rank [j];
					rank [j] = tmp;
				}				
			}
		}			
		
		//----------�迭 �� �� �� ���---------
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
