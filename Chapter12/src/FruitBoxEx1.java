import java.util.*;

class Fruit1 {public String toString() {return "Fruit";}}
class Apple1 extends Fruit1 {public String toString() {return "Apple";}}
class Grape1 extends Fruit1 {public String toString() {return "Grape";}}
class Toy1 {public String toString() {return "Fruit";}}

class FruitBoxEx1 
{
	public static void main(String[] args) 
	{
		Box<Fruit1> fruitBox = new Box<Fruit1>();
		Box<Apple1> appleBox = new Box<Apple1>();
		Box<Toy1> toyBox = new Box<Toy1>();
		// Box<Grape> grapebox = new Box<Apple>();
		
		fruitBox.add(new Fruit1());
		fruitBox.add(new Apple1());
		fruitBox.add(new Grape1());
		
		appleBox.add(new Apple1());
		appleBox.add(new Apple1());
		// appleBox.add(new Fruit());
		// appleBox.add(new Toy());
		
		toyBox.add(new Toy1());
		// toyBox.add(new Apple());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

	}

}

class Box1<T> 
{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();} 

}
