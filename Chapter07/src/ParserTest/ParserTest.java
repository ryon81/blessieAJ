package ParserTest;

import java.util.Scanner;

interface Parseable
{
	public abstract void parse(String fileName);
}

class ParserManager
{
	public static Parseable getParser(String type)
	{
		if(type.equals("XML"))
		{
			return new XMLParser();
		} else 
		{
			Parseable p = new HTMLParser();
			return p;			
		}
	}
}

class XMLParser implements Parseable
{
	public void parse(String filename)
	{
		System.out.println(filename + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable
{
	public void parse(String filename)
	{
		System.out.println(filename + "- HTML parsing completed.");
	}
}


class ParserTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Ȯ���ڸ� �Է��ϼ���.>");
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		
		x = x.toUpperCase();
		Parseable parser = ParserManager.getParser(x);
		
		System.out.println("���ϸ��� �Է��ϼ���.>");
		String x1 = s.nextLine();
		x1 = x1.toUpperCase();
		
		parser.parse(x1+"."+x);		
		s.close();
	}

}
