import java.util.*;

public class LinkedListEx1_1 
{
	public static void main(String[] args) 
	{
		//---------list 생성 및 값 추가------------//
		LinkedList list = new LinkedList();
		
		for (int i = 1; i < 11 ; i++)
		{
			list.add(new Integer(i));
		}
		
		//------------list 값 더하기 ------------//
		int even = 0;
		int odd = 0;
		
		
		for (int j = 0; j < list.size(); j++)
		{
			int num = (Integer)list.get(j);
			
			if (num % 2 == 0)
			{
				even += num;
			}else
			{
				odd += num;
			}
		}
		
		//-----------------출력----------------//
		System.out.println(list);
		System.out.println("짝수합계 = " + even);
		System.out.println("홀수합계 = " + odd);
	}
}
