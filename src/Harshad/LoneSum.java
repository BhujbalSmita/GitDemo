package harshad;

import java. util. Scanner;

public class LoneSum {

	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int n1,n2,n3,Addition=0;
		System.out.println("Enter 3 different natural numbers");
		n1 = sc. nextInt();
		n2 = sc. nextInt();
		n3 = sc. nextInt();
		if ((n1==n2)||(n2==n3)||(n1==n3)) {
			System.out.println("Please enter 3 DIFFERENT natural numbers");		
		}
		else {
			Addition=n1+n2+n3;
			System.out.println("Addition of 3 numbers = " +Addition);
		}
	}

}
