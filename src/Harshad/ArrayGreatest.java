package harshad;

import java.util.Scanner;

public class ArrayGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];//declaration and instantiation  
		System.out.println("Enter 5 numbers");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		int Greatest = arr[0];
for (int i=0; i<5;i++) {
if (Greatest<arr[i]) {
	Greatest= arr[i];
}
}
System.out.println("Greatest of entered 5 numbers is " +Greatest);
	}

}
