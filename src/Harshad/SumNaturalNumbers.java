package harshad;

import java. util. Scanner;

public class SumNaturalNumbers {

	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int number1,Addition=0;
		System.out.println("Sum of how many natural numbers ?");
		number1 = sc. nextInt();
		for(int i=1;i<=number1;i++) {
			Addition=Addition+i;
		}
		System.out.println("Sum of first " +number1 +" natural numbers = " +Addition);
	}

}
