package Lab1;

import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0 , b=1, sum, n;
		System.out.print("Enter the value of n : ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum = a+b;
			System.out.println(b);
			a=b;
			b=sum;
		
		}
		
		sc.close();		

	}

}

