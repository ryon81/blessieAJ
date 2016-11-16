import java.util.Scanner;

public class GoodsArray
{
	public static void main(String[] args) 
	{
		Goods[] goodsArray;
		goodsArray = new Goods[3];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < goodsArray.length; i++)
		{
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);			
		}
				
		
		//---출력문--------
		for (int i=0; i<goodsArray.length; i++)
		{
			System.out.printf("%s ",goodsArray[i].getName());
			System.out.printf("%d ",goodsArray[i].getPrice());
			System.out.printf("%d ",goodsArray[i].getNumberOfStock());			
			System.out.printf("%d%n",goodsArray[i].getSold());
		}
		//---출력문--------
		
		s.close();
	}
}

class Goods
{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	//---생성자--------
	Goods(String name, int price, int numberOfStock, int sold)
	{
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}	
	
	//---생성자--------
	
	String getName(){return name;}
	int getPrice(){return price;}
	int getNumberOfStock(){return numberOfStock;}
	int getSold(){return sold;}
}

	
	
