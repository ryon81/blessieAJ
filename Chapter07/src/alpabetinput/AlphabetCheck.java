package alpabetinput;

import java.util.Scanner;

class AlphabetCheck 
{
	public static void main (String args[]) 
	{
		try
		{
			input();
		} catch(SpellingException s)
		{
			s.printStackTrace();
			System.out.print(s);
		}
		
	}	
	
	static void input() throws SpellingException 
	{
		System.out.print("알파벳 한 개를 입력하세요.>");
		Scanner s = new Scanner(System.in);
		char c = s.nextLine().charAt(0);
		s.close();
		if (!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')))
		{
			throw new SpellingException("사용할 수 있는 알파벳이 아닙니다.");
		}
		System.out.println(c);
	}	
}


class SpellingException extends Exception
{
	SpellingException(String msg)
	{
		super(msg);
	}
}