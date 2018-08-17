import java.util.Scanner;

class Abstract
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter any two integer numbers :- ");
		a = reader.nextInt();
		b = reader.nextInt();
		a2 a2 = new a2();
		a2.sum(a,b);
		a2.sub(a,b);
		a2.mul(a,b);
		a2.div(a,b);
		a2.print();
	}
}
abstract class a1
{
	abstract public void sum(int x,int y);
	abstract public void sub(int x,int y);
	abstract public void mul(int x,int y);
	abstract public void div(double x,double y);
	public void print()
	{
		System.out.println("Mr. J");
	}
}
class a2 extends a1
{
	public void sum(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("Addition is " + z);
	}
	public void sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Subtraction is " + z);
	}
	public void mul(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("Multiplication is " + z);
	}
	public void div(double x, double y)
	{
		double z;
		z=x/y;
		System.out.println("Division is " + z);
	}
}