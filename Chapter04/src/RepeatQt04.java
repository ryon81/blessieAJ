public class RepeatQt04 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int mul = 1;		
		
		for (int i=1; i <=10; i++)
		{	
			mul *= i;
			sum += mul;							
		}
		System.out.println("1!+2!+3!+4!+5!+6!+7!+8!+9!+10!=");
		System.out.printf("��� : %d", sum);
	}
}
