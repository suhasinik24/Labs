package Lab1;

import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if(Exercise7.checkNumber(num)) {
			System.out.println("Number is in increasing order");
		}
		else {
			System.out.println("Number is not in increasing order");
		}
		
		scan.close();
	}
	
	public static boolean checkNumber(int num) {
		int num1;
		int num2;
		
		boolean value = false;
		while(num!=0) {
			num1 = num%10;
			num=num/10;
			num2=num%10;
			num=num/10;
			
			if(num1>=num2) {
				value = true;
			}
			else {
				value = false;
				break;
			}
		}
		
		return value;
		

	}

}
