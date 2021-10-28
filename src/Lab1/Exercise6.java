package Lab1;

import java.util.Scanner;

class Difference{
	public int calculateDiff(int n) {
		int sumSquareN = (n*(n+1)*(2*n+1))/6;
		int sumN = (n*(n+1))/2;
		int squareSumN = sumN * sumN;
		return Math.abs(sumSquareN - squareSumN);
	}	
			
}

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		Difference d = new Difference();
		int res = d.calculateDiff(n);
		System.out.print(res);
		
		sc.close();
		

	}

}
