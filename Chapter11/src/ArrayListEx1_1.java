import java.util.*;

public class ArrayListEx1_1 
{
	public static void main(String[] args) 
	{
		//---------list ���� �� �� �߰�------------//
		ArrayList list = new ArrayList(10);
		
		for (int i = 1; i < 11 ; i++)
		{
			list.add(new Integer(i));
		}
		
		//------------list �� ���ϱ� ------------//
		int sum = 0;
		
		for (int j = 0; j <list.size(); j++)
		{
			sum += (Integer)list.get(j);
		}
		
		//-----------------���----------------//
		System.out.println(list);
		System.out.println("�հ� = " + sum);
	}

}
