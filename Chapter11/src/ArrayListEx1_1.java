import java.util.*;

public class ArrayListEx1_1 
{
	public static void main(String[] args) 
	{
		//---------list 생성 및 값 추가------------//
		ArrayList list = new ArrayList(10);
		
		for (int i = 1; i < 11 ; i++)
		{
			list.add(new Integer(i));
		}
		
		//------------list 값 더하기 ------------//
		int sum = 0;
		
		for (int j = 0; j <list.size(); j++)
		{
			sum += (Integer)list.get(j);
		}
		
		//-----------------출력----------------//
		System.out.println(list);
		System.out.println("합계 = " + sum);
	}

}
