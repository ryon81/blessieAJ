import java.util.*;

class HashSetLotto 
{
	public static void main(String[] args) 
	{
		Set set = new HashSet();
		int count = 0;
		
		for (int i=0; set.size() < 6; i++)
		{
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
			++count;			
		}
		
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("for¹® ¹Ýº¹È½¼ö = " + count);
	}

}
