package Lab5;

import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String str) {
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = s.nextInt();
		
		try {
			if(age < 15) {
				throw new AgeException("Not Elgible");
			}
			else {
				System.out.println("Elgible");
			}		
			
		}
		catch (AgeException e) {
			System.out.println(e);
			
		}
		
	}
}
