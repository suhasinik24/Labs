package Lab1;

import java.util.Scanner;

public class Exercise2 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your choice : Red, Yellow or Green ");
			
		String light = sc.next();	
		
		switch(light) {
		case "Red":
			System.out.println("STOP");	
			break;
		case "Yellow":
			System.out.println("READY");	
			break;
		case "Green":
			System.out.println("GO");			
			break;		
		}
		sc.close();		
	}


}
