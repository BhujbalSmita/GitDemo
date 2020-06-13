package harshad;

import java. util. Scanner;

public class DigitAddition {
	
	int Addition(int number1) {
		int Addition=((((number1%100)%10))+(((number1%100)/10))+(number1/100));
		return Addition;
	}

	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int number1,Addition=0;
		System.out.println("Enter any 3 digit number");
		number1 = sc. nextInt();
		DigitAddition Obj = new DigitAddition();
		Addition=Obj.Addition(number1);
		System.out.println("Addition of individual digits is " +Addition);
	}

}
