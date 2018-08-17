import java.util.Scanner;

class CR
{
	static public void main(String[] args)
	{
		CR c1 = new CR();
	}
	CR()
	{
		this(37);
		int a=14,b=45,c;
		System.out.println();
		System.out.println("a = " + a + ", b = " +b);
		c=a+b;
		System.out.println();
		System.out.println("Sum is = " + c+".");
		System.out.println();
		System.out.println("[Inside constructor without any argument]");
	}
	CR(int x)
	{
		this(12,23);
		int y;
		y=x;
		System.out.println();
		System.out.println("Given argument is " + y+".");
		System.out.println();
		System.out.println("[Inside constructor with one argument]");
	}
	CR(int u,int v)
	{
		int s,t;
		s=u;
		t=v;
		System.out.println();
		System.out.println("Given arguments are " + s +","+t+".");
		System.out.println();
		System.out.println("[Inside constructor with two arguments]");
	}
}