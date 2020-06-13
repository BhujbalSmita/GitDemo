package harshad;
import java. util. Scanner;
public class PrimeNumber {

	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int n;
		System.out.println("Enter any number");
		n = sc. nextInt();
		sc.close();
		if ((n==2)||(n==3)||(n==5)||(n==7)||(n==11)) {
			System.out.println("Number is Prime Number");}
		else if ((n%2!=0)&&(n%3!=0)&&(n%5!=0)&&(n%7!=0)&&(n%11!=0)) {
			System.out.println("Number is Prime Number");}
			else {
				System.out.println("Number is NOT a Prime Number");				
			}
		
	}

}
