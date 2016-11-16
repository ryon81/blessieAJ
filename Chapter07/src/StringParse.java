import java.util.Scanner;
public class StringParse 
{

	public static void main(String[] args) 
	{
		System.out.println("단어를 입력하세요.>");
				 
		Scanner s = new Scanner(System.in);
		String tmp = s.nextLine();
		int length = tmp.length();
		
		System.out.println("입력한 단어는 " + length + " 글자입니다.");
		
		for (int i = 0; i <= length; i++ )
		{
			char[] c = new char[i];
		}
		
		
		s.close();

	}

}
