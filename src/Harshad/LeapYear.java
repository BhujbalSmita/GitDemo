package harshad;
import java. util. Scanner;
public class LeapYear {

	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System. in);
		int Year;
		System.out.println("Enter any Year");
		Year = sc. nextInt();
		if (Year%4!=0) {
			System.out.println("This is NOT a Leap Year");			
		}
		else {
			System.out.println("This is a Leap Year");				
		}
	}

}
