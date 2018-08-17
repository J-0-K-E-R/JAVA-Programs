import java.util.*;
import java.lang.*;

class TreeS
{
	public static void main(String[] args)
	{
		int i,a,n=-1,t,x;
		String s,l;
		Scanner scan = new Scanner(System.in);
		TreeSet<String> ts1 = new TreeSet<String>();
		boolean b=true,c=true;
		System.out.println("							~_Tree.Set_~");
		while(b==true)
		{
			System.out.println();
			Iterator I1 = ts1.iterator();
			System.out.println();
			while(I1.hasNext())
			{
				System.out.println(I1.next());
			}
			x=ts1.size();
			System.out.println();
			System.out.println("Size of List is "+x+".");
			System.out.println();
			System.out.println("Options are :-"+"\n 1. Add String"+"\n 2. Clear HashList"+"\n 3. Exit");
			System.out.print("		Your Option :- ");
			a=scan.nextInt();
			switch(a)
			{
				case 1:
					System.out.println();
					System.out.print("Enter your string :- ");
					l=scans();
					ts1.add(l);
					System.out.print("String Added !!!");
					n++;
					System.out.println();
					System.out.println();
				break;
				case 2:
					System.out.println();
					ts1.clear();
					System.out.print("List has been Deleted !!!");
					n=-1;
					System.out.println();
				break;
				case 3:
					System.out.println();
					System.out.println();
					System.exit(0);
				break;
				default:
					System.out.println("Invalid choice !!!  Please enter a valid choice");
			}
			
		}
	}
	public static String scans()
	{
		String y;
		Scanner reader = new Scanner(System.in);
		y=reader.nextLine();
		return y;
	}
}