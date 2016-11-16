import java.util.Arrays;

public class ArrayEx10_1 
{
	public static void main(String[] args) 
	{
		int [ ] a = {69, 10, 30, 2, 16, 8, 31, 22 };
				
		for (int i = 0 ; i < a.length; i++)
		{
			for (int j = i+1 ; j < a.length; j++)
			{
				// -------- 오름차순-------
				if(a[i] > a[j])
				{
					int tmp =a [i];
					a [i] = a [j];
					a [j] = tmp;
				}
				
				/*---------- 내림차순------
				if(a[i] < a[j])
				{
					int tmp =a [i];
					a [i] = a [j];
					a [j] = tmp;
				}*/
				
			}
		}
		System.out.print(Arrays.toString(a));

	}
}
