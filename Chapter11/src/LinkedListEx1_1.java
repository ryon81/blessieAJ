import java.util.*;

public class LinkedListEx1_1 
{
	public static void main(String[] args) 
	{
		//---------list ���� �� �� �߰�------------//
		LinkedList list = new LinkedList();
		
		for (int i = 1; i < 11 ; i++)
		{
			list.add(new Integer(i));
		}
		
		//------------list �� ���ϱ� ------------//
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
		
		//-----------------���----------------//
		System.out.println(list);
		System.out.println("¦���հ� = " + even);
		System.out.println("Ȧ���հ� = " + odd);
	}
}
