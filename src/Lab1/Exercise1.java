package Lab1;

import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt() ;
		
		double sum = Math.pow(n*(n+1)/2, 2);
		System.out.println("The sum of the cubes of digits of an " + n + " digit number is :"+ sum);
		
		sc.close();
	}

}