import java.util.Scanner;
import java.io.PrintStream;

class SWF
{
	public static void main(String[] args)
	{
		double a,b,c;
		int d;
		System.out.println("Enter any two numbers :- ");
		Scanner reader = new Scanner(System.in);
		System.out.print("	A = ");
		a=reader.nextDouble();
		System.out.print("	B = ");
		b=reader.nextDouble();
		System.out.println("Enter your choice :- ");
		System.out.println("(1) Addition");
		System.out.println("(2) Subtraction");
		System.out.println("(3) Multiplication");
		System.out.println("(4) Division");
		System.out.println("(5) All");
		System.out.print("Your Choice :- ");
		d=reader.nextInt();
		System.out.println();
		switch (d)
		{
			case 1:
				c = add(a,b);
				System.out.println("Addition (A+B) is " + c);
			break;
			case 2:
				c = sub(a,b);
				System.out.println("Subtraction (A-B) is " + c);
			break;
			case 3:
				c = mul(a,b);
				System.out.println("Multiplication (AxB) is " + c);
			break;
			case 4:
				c = div(a,b);
				System.out.println("Division (A/B) is " + c);
			break;
			case 5:
				c = add(a,b);
				System.out.println("Addition (A+B) is " + c);
				c = sub(a,b);
				System.out.println("Subtraction (A-B) is " + c);
				c = mul(a,b);
				System.out.println("Multiplication (AxB) is " + c);
				c = div(a,b);
				System.out.println("Division is (A/B) " + c);
			break;
			default:
				System.out.println("Please enter valid value...");
		}
	}
	public static double add(double x, double y)
	{
		double z;
		z=x+y;
		return z;
	}
	public static double sub(double x, double y)
	{
		double z;
		z=x-y;
		return z;
	}
	public static double mul(double x, double y)
	{
		double z;
		z=x*y;
		return z;
	}
	public static double div(double x, double y)
	{
		double z;
		z=x/y;
		return z;
	}
}