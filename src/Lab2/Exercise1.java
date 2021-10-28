package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	
	public  int secondSmallest(int[] arr) {
		
		Arrays.sort(arr);
		for(int i : arr);{
			return arr[1];
	    }
	}

public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the length of array: ");
	int[] arr = new int[sc.nextInt()];
	
	System.out.println("Enter the numbers: " );
	for(int i =0; i<arr.length;i++) {
		arr[i] = sc.nextInt();		
	}
	
	Exercise1 ex = new Exercise1();
	System.out.println("Second Smallest number is : " + ex.secondSmallest(arr));	
	sc.close();
}
	
}
