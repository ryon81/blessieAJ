public class RepeatQt02 
{

	public static void main(String[] args) 
	{
		float rlt = 0;
		
		for (int i=1; i <=10; i++)
		{
			float f = i;
			rlt = 1/f;
						
			System.out.printf("1/%d = %g%n", i, rlt);
		}
		
	}

}
