import java.util.Arrays;

public class ArrayQstc1 
{
	public static void main(String[] args) 
	{
		int [ ] score = new int [10];

		//-----------�迭 �ʱ�ȭ�ϱ�-----------
		for (int i = 0; i < score.length;i++)
		{
			score[i] = (int)(Math.random( )*100)+1;
		}		
		
		//-----------�迭 �����ϱ�-----------
		for (int i = 0 ; i < score.length; i++)
		{
			for (int j = i+1 ; j < score.length; j++)
			{
				// -------- ��������-------
				if(score[i] < score[j])
				{
					int tmp =score [i];
					score [i] = score [j];
					score [j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(score));
		System.out.printf("3��°�� ū���� %d�Դϴ�.",score[2]);
	}
}
