package Generics03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GenericsEx4 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("ÀÚ¹Ù¿Õ",1,1,100,100,100));
		list.add(new Student("ÀÚ¹ÙÂ¯",1,2,90,80,70));
		list.add(new Student("È«±æµ¿",2,1,70,70,70));
		list.add(new Student("Àü¿ìÄ¡",2,2,90,90,90));
		
		Collections.sort(list);
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}

	}

}

class Student extends Person implements Comparable<Person>
{
	String name = "";
	int ban =0;
	int no = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	int total = 0;	
	
	Student (String name, int ban, int no, int koreanScore, int mathScore,	int englishScore)	
	{
		super(ban+"-"+no,name);
		this.name = name;
		this.ban = ban; 
		this.no= no;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		total = koreanScore + mathScore + englishScore;
	}
	
	public String toString()
	{
		return name + "\t"
		+ ban + "\t" 
		+ no + "\t"
		+ koreanScore + "\t"
		+ mathScore + "\t"
		+ englishScore + "\t"
		+ total + "\t";		
	}
	
	public int compareTo(Person o)
	{
		return id.compareTo(o.id);
	}
}

class Person
{
	String id;
	String name;
	
	Person(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

	