package Lab1;

import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if(Exercise8.checkNumber(num)) {
			System.out.println("Number is in powers of two");
		}
		else {
			System.out.println("Number is not in powers of two");
		}
		
		scan.close();

	}
	public static boolean checkNumber(int num) {
		while(num%2==0) {
			num=num/2;
		}
		if(num==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
