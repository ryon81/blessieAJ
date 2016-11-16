class MyExp 
{
	int base;
	int exp;
			
	int getValue()
	{
		int rlt = 1; 
		
		for (int i = 1; i <= exp; i++)
		{
			rlt *= base; 
		}
		return rlt;
	}
}

class MyExpTest 
{
	public static void main(String[] args) 
	{
		MyExp number1 = new MyExp();
		number1.base = 2; 
		number1.exp = 3; 
		MyExp number2 = new MyExp();
		number2.base = 3; 
		number2.exp = 4;
		
		System.out.println("2ÀÇ 3½Â = " + number1.getValue());
		System.out.println("3ÀÇ 4½Â = " + number2.getValue());
	}

}
