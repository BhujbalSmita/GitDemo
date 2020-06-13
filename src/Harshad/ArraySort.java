package harshad;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j,Temp;
		int arr[]=new int[5];//declaration and instantiation  
		int brr[]=new int[5];//declaration and instantiation  
		System.out.println("Enter 5 numbers");
		for (i=0;i<5;i++) {
		arr[i] = sc.nextInt();
		}
	
		for (j=0;j<=3;j++) {
		for (i=0;i<=3;i++) {
		if (arr[i] > arr[i+1]) {
			Temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=Temp;
		}
		}
		}
		for (i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
	}
