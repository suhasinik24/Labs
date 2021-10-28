package Lab3;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		
		int n, sum=0, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to b calculated:  ");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the numbers: ");	
			z = sc.nextInt();
			sum = sum + z;				
		}
		
		sc.close();
		System.out.println( sum );
	}

}
