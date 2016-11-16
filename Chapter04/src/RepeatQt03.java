public class RepeatQt03 
{
	public static void main(String[] args) 
	{
		float rlt = 0;
		float sum = 0;
		
		for (int i=1; i <=10; i++)
		{
			float f = i;
			rlt = 1/f;
			sum += rlt;			
		}
		System.out.printf("°á°ú : %f", sum);
	}

}
