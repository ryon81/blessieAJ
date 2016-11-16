import java.util.ArrayList;

class Fruit implements Eatable {public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy {public String toString() {return "Fruit";}}

interface Eatable{}

class FruitBoxEx2 
{
	public static void main(String[] args) 
	{
		Box<Fruit> fruitBox = new FruitBox<Fruit>();
		
		/*
		--- �ݴ��� ��� �Ʒ��� ���� Casting�� �ص� �������� ����---
		FruitBox<Fruit> fruitBox = (FruitBox<Fruit>) new Box<Fruit>()
		*/  
		
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		/* 
		-- ���׸��� Ÿ���� ��Ӱ��踦 �������� ����. ������ ��ġ�ؾ� �� --
		FruitBox<Apple> appleBox1 = new FruitBox<Fruit>();		
		FruitBox<Grape> grapeBox1 = new FruitBox<Apple>();
		*/
		
		Box<Toy> toyBox = new Box<Toy>();
		/*
		-- ������� ���ѵ� Toy�� FruitBox������ ���Ұ� 
		FruitBox<Toy> toyBox = new FruitBox<Toy>();
		*/
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		//appleBox.add(new Fruit());
		//appleBox.add(new Grape());
		
		grapeBox.add(new Grape());
		//grapeBox.add(new Fruit());
		// appleBox.add(new Fruit());
		// appleBox.add(new Toy());
		
		toyBox.add(new Toy());
		// toyBox.add(new Apple());
		
		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T> 
{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();} 

}
