package harshad;

import java. util. Scanner;
public class ReverseNumber {

	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int number1,Reverse=0;
		System.out.println("Enter any 3 digit number");
		number1 = sc. nextInt();
		Reverse=((((number1%100)%10)*100)+(((number1%100)/10)*10)+(number1/100));
		System.out.println("Reverse of this number is " +Reverse);
	}

}
