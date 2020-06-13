package harshad;

import java.util.Scanner;

public class ArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int arr[]=new int[10];//declaration and instantiation 
int brr[]=new int[10];//declaration and instantiation 
//Loop to accept numbers
for (int i=0; i<10;i++) {
	System.out.println("Enter " +i+" number");
	arr[i]=sc.nextInt();
}
//Loop to find Greatest
int Greatest = arr[0];
for (int i=0;i<10;i++) {
	if (arr[i]>Greatest) {
		Greatest=arr[i];
	}
}
//Logic to Sort
int j=0;
while(j<10) {
	brr[j]=Greatest;
int Second=0;
for (int i=0;i<10;i++) {
	if ((arr[i]>Second)&&(arr[i]<Greatest)) {
		Second=arr[i];
}
	}
Greatest=Second;
j++;
 }
//Loop to Print numbers
for (int i=9; i>=0;i--) {
	System.out.println(brr[i]);
}
	}
}
