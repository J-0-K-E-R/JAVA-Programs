import java.util.Scanner;


class FO1
{
	public void sum(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("[In FO1] Addition is " + z);
	}
}
class FO2 extends FO1
{
	public void sum(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("[in FO2] Addition is " + z);
	}
}
class FORT
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter any two integer numbers :- ");
		a = reader.nextInt();
		b = reader.nextInt();
		FO1 f1;
		f1 = new FO1();
		f1.sum(a,b);
		f1 = new FO2();
		f1.sum(a,b);
	}
}