import java.util.Scanner;

class Interfaces
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter any two integer numbers :- ");
		a = reader.nextInt();
		b = reader.nextInt();
		i3 i3 = new i3();
		i3.sum(a,b);
		i3.sub(a,b);
		i3.mul(a,b);
		i3.div(a,b);
		System.out.println(i3.getClass());
		i3.print();
	}
}
interface i1
{
	public void sum(int x,int y);
	public void sub(int x,int y);
}
interface i2
{
	public void mul(int x,int y);
	public void div(double x,double y);
}
class i3 implements i1,i2
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
	public void print()
	{
		System.out.println("Mr. J");
	}
}