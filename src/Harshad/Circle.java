package harshad;
import java. util. Scanner;
public class Circle {
	
	int Diameter (int radius){
	int Diameter=2*radius;
	return Diameter;
	}
	
	double Perimeter (int radius){
	double Perimeter=2*3.142*radius;
	return Perimeter;
	}
	
	double Area (int radius){
	double Area=3.142*radius*radius;
	return Area;
	}
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int radius;
		System.out.println("Enter radius of circle");
		radius = sc. nextInt();
		Circle Obj = new Circle();
		int D = Obj.Diameter(radius);
		double P = Obj.Perimeter(radius);
		double A = Obj.Area(radius);
		System.out.println("Diameter of circle = " +D);
		System.out.println("Perimeter of circle = " +P);
		System.out.println("Area of circle = " +A);
	}

}
