import java.util.*;

class Exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "abc";
		String s2 = null;
		try {
			try {
				int a = Integer.parseInt(s1);
			}
			catch(NumberFormatException e) {
				System.out.println(e);
			}
			try {
				System.out.println(s2.length());
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
			int b =10/0;
			System.out.println("Code After Exception Will Not Be Executed");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("\n\nroboGOD ::::: This Is finally BLOCK\n\n");
		}
		System.out.println("Enter Age : ");
		int age = sc.nextInt();		
		if(age < 18 ) {
			throw new ArithmeticException("Age Is Less Than 18");
		}
		else {
			System.out.println("Congo Your Age Is Greater Than 18 !!! ");
		}
		//Multiple Exceptions Are Not Supported in Single Try Block
		//It Will Handle First Exception And Ignore The Rest Of The Try Block
		
		System.out.println("\n\nThis Statement Will Execute ");
	}
}
			