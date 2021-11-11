package Lab5;

class MyException2 extends Exception {
	
	private static final long serialVersionUID = 1L;

	MyException2(String s) {
		super(s);
	}
}

public class NameException {
	public static void validate(String s1, String s2) throws MyException2 {
		if (s1.isBlank() || s2.isBlank()) {
			throw new MyException2(" You must enter First name and Last Name.!");
		} else {
			System.out.println(" You are Welcome...!!");
		}
	}

	public static void main(String[] args) {
		String fName = "Suhasini";
		String lName = "Suhasini";
		try {
			validate(fName, lName);
		} catch (MyException2 me) {
			System.out.println("Exception Occured " + me.getMessage());
		}
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}












//import java.util.Scanner;
//
//class Employee{
//	String fistName;
//	String lastName;
//	
//	public Employee(String firstName, String lastname) {
//		this.fistName = firstName;
//		this.lastName = lastname;	
//		
//	}	
//}
//public class NameException extends Exception {
//	public NameException(String str) {
//		System.out.println(str);
//}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter firstName: ");
//		String s1 = sc.nextLine();
//		System.out.println("Enter LastName: ");
//		String s2 = sc.nextLine();
//		String s3 = s1.concat(s2);
//		
//		try {
//			
//		}
//		
//	}
//	
//}
//	
