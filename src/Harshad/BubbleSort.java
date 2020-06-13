package harshad;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int m,n,temp=0;
System.out.println("Enter one number");
m=sc.nextInt();
System.out.println("Enter another number");
n=sc.nextInt();
System.out.println("m as of now is " +m);
System.out.println("n as of now is " +n);

if (m>n) {
temp=m;
m=n;
n=temp;
}
System.out.println("m after bubble sort is " +m);
System.out.println("n after bubble sort is " +n);
	}

}
