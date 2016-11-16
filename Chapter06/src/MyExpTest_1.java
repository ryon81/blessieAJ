class MyExp1 
{
	int base;
	int exp;
	int rlt = 1;
			
	int getValue(int i)
	{			
		if (exp == 0)
		{
			return rlt;
		} else 
		{
			rlt *= base;
			--exp; 
			return getValue(base);
		}			 
	}
}

class MyExpTest_1
{
	public static void main(String[] args) 
	{
		MyExp1 number1 = new MyExp1();
		number1.base = 2; 
		number1.exp = 3; 
		MyExp1 number2 = new MyExp1();
		number2.base = 3; 
		number2.exp = 4;
		
		System.out.println("2ÀÇ 3½Â = " + number1.getValue(number1.base));
		System.out.println("3ÀÇ 4½Â = " + number2.getValue(number2.base ));
	}

}
