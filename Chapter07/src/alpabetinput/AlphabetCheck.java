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
		System.out.print("���ĺ� �� ���� �Է��ϼ���.>");
		Scanner s = new Scanner(System.in);
		char c = s.nextLine().charAt(0);
		s.close();
		if (!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')))
		{
			throw new SpellingException("����� �� �ִ� ���ĺ��� �ƴմϴ�.");
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