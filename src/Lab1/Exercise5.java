package Lab1;

import java.util.Scanner;
public class Exercise5 {
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum = sum+i;
			}
	    }
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		Exercise5 e = new Exercise5();
		int res = e.calculateSum(n);
		System.out.println("sum of natural numbers which are divisible by 3 or 5 is : " + res);
		
		
		sc.close();
	}
	
	
}
