import java.util.Scanner;

public class Quest03 
{

	public static void main(String[] args) 
	{
		int def = 0;
		
		System.out.print("정수를 입력하세요.>");
		
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		def = Integer.parseInt(tmp);
		scanner.close();
		
		if (def == 0)
		{
			System.out.println("0은 계산 할 수 없습니다.");
		} else
		{
			if (def % 6 == 0 ) 
			{
				System.out.println("2의 배수이면서 3의 배수입니다.");
				
			} else if (def % 2 == 0 )  
			{
					System.out.println("2의 배수입니다.");
					
			} else if (def % 3 == 0)
			{
				System.out.println("3의 배수입니다.");
				
			} else 
			{
				System.out.println("2와 3의 배수가 아닙니다.");
			}			
		}
	}

}
