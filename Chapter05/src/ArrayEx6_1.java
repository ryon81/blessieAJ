import java.util.*;

public class ArrayEx6_1 
{
	public static void main(String[] args) 
	{
		/* 배열에 값을 입력해 보기  <미완성> */
		
		int[] score = new int [7];		
		
		System.out.print("정수를 입력하세요.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		
		for (int i = 0; i < score.length; i++)
		{
			score[i] = Integer.parseInt(tmp);
		}
		
		int max = score [0];
		int min = score [0];
		
		for(int i = 1; i < score.length; i++)
		{			
			if (score[i] > max)
			{
				max = score[i];
			} else if (score[i] < min)
				min = score[i];
		}
		
		scanner.close();
		
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
				
	}
}
