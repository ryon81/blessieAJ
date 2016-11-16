class currencyConverter
{	
	private static double rate;
	
	static void setRate(double r)
	{		
		rate = r;
		return;
	}
	
	static double toKWR(double d)
	{
		double rlt = d * rate; 
		return rlt;
	}
	static double toDollar(double w)
	{
		double rlt = w / rate;
		return rlt;
	}
}

public class StaticMember 
{
	public static void main(String[] args) 
	{
		currencyConverter.setRate(1121);
		System.out.println("백만원은 "+currencyConverter.toDollar(10000000)+"달러입니다.");
		System.out.println("백달러는 "+currencyConverter.toKWR(100)+"원입니다.");
	}
}
