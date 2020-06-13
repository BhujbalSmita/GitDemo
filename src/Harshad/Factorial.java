package harshad;

import java. util. Scanner;

public class Factorial {

	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int number1,Factorial=1;
		System.out.println("Factorial of which number ?");
		number1 = sc. nextInt();
for (int i=1;i<=number1;i++) {
	Factorial=Factorial*i;
}
System.out.println("Factorial of " +number1+" = " +Factorial);
	}

}
