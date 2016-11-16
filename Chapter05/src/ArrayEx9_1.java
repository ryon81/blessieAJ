import java.util.Arrays;

public class ArrayEx9_1 
{
	public static void main(String[] args) 
	{
		
		int[] arr = new int[10];		
		
		for (int i=0; i < arr.length; i++)
		{
			int tmp = (int)(Math.random() * 7) + -3;
			arr[i] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
