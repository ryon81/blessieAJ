import java.util.Arrays;

public class ArrayQstc1 
{
	public static void main(String[] args) 
	{
		int [ ] score = new int [10];

		//-----------배열 초기화하기-----------
		for (int i = 0; i < score.length;i++)
		{
			score[i] = (int)(Math.random( )*100)+1;
		}		
		
		//-----------배열 정렬하기-----------
		for (int i = 0 ; i < score.length; i++)
		{
			for (int j = i+1 ; j < score.length; j++)
			{
				// -------- 내림차순-------
				if(score[i] < score[j])
				{
					int tmp =score [i];
					score [i] = score [j];
					score [j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(score));
		System.out.printf("3번째로 큰값은 %d입니다.",score[2]);
	}
}
