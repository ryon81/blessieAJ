import orange.area.Circle;
import java.util.Scanner;

public class CircleTest 
{
	public static void main(String[] args) 
	{
		//-----------������ �Է�--------------
		System.out.print("�������� �Է��ϼ���.>");
		Scanner s = new Scanner(System.in) ;
		double r = s.nextDouble();
		//-----------������ �Է�--------------
		
		//------------�����ڿ� �Է°� ����------
		Circle c = new Circle(r);
		//------------�����ڿ� �Է°� ����------
		
		//-----------���� ���----------------
		System.out.printf("���� ���̴�: %.2f�Դϴ�.",c.getArea());
		
		s.close();		
		//-----------���� ���-------------
	}

}
