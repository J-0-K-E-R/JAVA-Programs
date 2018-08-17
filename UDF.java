import java.util.Scanner;

class UDF
{
public static void main(String[] args)
{
  int a,b,c;
  double d,e,f;
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter any two integer numbers :- ");
  a = reader.nextInt();
  b = reader.nextInt();
  c = add(a,b);
  System.out.println("Addition is " + c);
  c=sub(a,b);
  System.out.println("Subtraction is " + c);
  c=mul(a,b);
  System.out.println("Multiplication is " + c);
  d=a;
  e=b;
  f=div(d,e);
  System.out.println("Division is " + f);
}
public static int add(int x, int y)
{
 int z;
 z=x+y;
 return z;
}
public static int sub(int x, int y)
{
 int z;
 z=x-y;
 return z;
}
public static int mul(int x, int y)
{
 int z;
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