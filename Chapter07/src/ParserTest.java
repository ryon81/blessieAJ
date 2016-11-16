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
		
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.HTML");
	}

}
