import orange.area.Circle;
import java.util.Scanner;

public class CircleTest 
{
	public static void main(String[] args) 
	{
		//-----------반지름 입력--------------
		System.out.print("반지름을 입력하세요.>");
		Scanner s = new Scanner(System.in) ;
		double r = s.nextDouble();
		//-----------반지름 입력--------------
		
		//------------생성자에 입력값 대입------
		Circle c = new Circle(r);
		//------------생성자에 입력값 대입------
		
		//-----------넓이 출력----------------
		System.out.printf("원의 넓이는: %.2f입니다.",c.getArea());
		
		s.close();		
		//-----------넓이 출력-------------
	}

}
