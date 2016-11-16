public class RepeatQt05 
{
	public static void main(String[] args) 
	{
		float rad = 0.0f;	
		
		for (int deg=0; deg <=360; deg+=10)
		{	
			rad = ((float)(deg)/180)*3.14f; 			
			System.out.printf("°á°ú : %d   %.3f%n", deg, rad);
		}		
	}
}
