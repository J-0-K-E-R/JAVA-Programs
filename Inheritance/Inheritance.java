import java.util.Scanner;
class Inheritance extends sum
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter any two integer numbers :- ");
		a = reader.nextInt();
		b = reader.nextInt();
		add(a,b);
	}
}
class sum extends sub
{
	public static void add(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("Addition is " + z);
		sub(x,y);
	}
}
class sub extends mul
{ 
	public static void sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Subtraction is " + z);
		mul(x,y);
	}
}
class mul extends div
{ 
	public static void mul(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("Multiplication is " + z);
		div(x,y);
	}
}
class div
{
	public static void div(double x, double y)
	{
		double z;
		z=x/y;
		System.out.println("Division is " + z);
	}
}
