public class RepeatQt06 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int fin = 0;		
		
		for (int i=1; i <=15; i++)
		{	
			sum += i;
			fin += sum;					
		}						
		System.out.printf("°á°ú : %d", fin);
	}
}
