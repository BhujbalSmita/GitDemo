package harshad;
//import java.util.Scanner;

public class Special {
	
	int a;
	int b;
void setValue (int a, int b){
	this.a=a;
	this.b=b;
};

void showValue (){
	System.out.println("Value of a = " +a);
	System.out.println("Value of b = " +b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Special obj = new Special();
		obj.setValue(10, 20);
		obj.showValue();
	}

}
