package harshad;
import java. util. Scanner;
public class Rectangle {

	int Perimeter (int length, int breadth){
	int Perimeter=2*(length+breadth);
	return Perimeter;
	}
	
	int Area (int length, int breadth){
	int Area=length*breadth;
	return Area;
	}
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int length,breadth;
		System.out.println("Enter length of Rectangle");
		length = sc. nextInt();
		System.out.println("Enter breadth of Rectangle");
		breadth = sc. nextInt();
		Rectangle Obj = new Rectangle();
		int P = Obj.Perimeter(length, breadth);
		int A = Obj.Area(length, breadth);
		System.out.println("Perimeter of Rectangle = " +P);
		System.out.println("Area of Rectangle = " +A);
	}

}
