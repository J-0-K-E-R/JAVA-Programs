import java.util.*;
import java.lang.*;

class ArrayL
{
	public static void main(String[] args)
	{
		int i=0,a,n=-1,t,x,y,j;
		String s,l;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> al1 = new ArrayList<String>();
		boolean b=true,c=true;
		System.out.println("							~_ArrayList_~");
		while(b==true)
		{
			System.out.println();
			for(i=0;i<=n;i++)
			{
				System.out.println("At location "+(i+1)+" , String is "+al1.get(i)+".");
			}
			x=al1.size();
			System.out.println();
			System.out.println("Size of List is "+x+".");
			System.out.println();
			System.out.println("Options are :-"+"\n 1. Add String"+"\n 2. Update String"+"\n 3. Delete String"+"\n 4. Get String"+"\n 5. Search any String"+"\n 6. Clear ArrayList"+"\n 7. Convertion to HashSet"+"\n 8. Conversion from Array to ArrayList (Add items through Array)"+"\n 9. Exit");
			System.out.print("		Your Option :- ");
			a=scan.nextInt();
			switch(a)
			{
				case 1:
					System.out.println();
					System.out.print("Enter your string :- ");
					l=scans();
					al1.add(l);
					System.out.print("String Added !!!");
					n++;
					System.out.println();
					System.out.println();
				break;
				case 2:
					System.out.println();
					System.out.print("Enter the location of String that you want to Update :- ");
					t=scan.nextInt();
					t=t-1;
					System.out.print("Enter new String :- ");
					l = scans();
					al1.set(t,l);
					System.out.print("String Updated !!!");
					System.out.println();
					System.out.println();
				break;
				case 3:
					System.out.println();
					System.out.print("Enter the location of String that you want to Delete :- ");
					t=scan.nextInt();
					t=t-1;
					al1.remove(t);
					n--;
					System.out.print("String Removed !!!");
					System.out.println();
					System.out.println();
				break;
				case 4:
					System.out.println();
					System.out.print("Enter the location of String that you want to view :- ");
					t=scan.nextInt();
					t=t-1;
					l=al1.get(t);
					System.out.print("String at location "+(t+1)+" is "+l);
					System.out.println();
					System.out.println();
				break;
				case 5:
					System.out.println();
					System.out.print("Enter the String that you want to Search :- ");
					l=scans();
					c=al1.contains(l);
					if(c==true)
					{
						t=al1.indexOf(l);
						System.out.print("List contains the string at location "+(t+1)+".");
					}
					else
					{
						System.out.print("List don't contain this String.\nPlease check your String.");
					}
					System.out.println();
					System.out.println();
				break;
				case 6:
					System.out.println();
					al1.clear();
					System.out.print("List has been Deleted !!!");
					n=-1;
					System.out.println();
				break;
				case 7:
					System.out.println();
					System.out.println("Converting ArrayList to HashSet...");
					HashSet<String> hs1=new HashSet<String> (al1);
					System.out.println();
					Iterator I1 = hs1.iterator();
					System.out.println();
					while(I1.hasNext())
					{
						System.out.println(I1.next());
					}
					x=hs1.size();
					System.out.println();
					System.out.println("Size of List is "+x+".");
					System.out.println();
				break;
				case 8:
					System.out.println();
					System.out.print("Enter the size of the Array :- ");
					y=scan.nextInt();
					String u[]=new String[y];
					System.out.println("Enter the elements :-");
					for(i=0;i<y;i++)
					{
						System.out.print("Element " + (i+1) + " :- ");
						u[i] = scans();
					}
					System.out.println("Your array is :- ");
					for(j=0;j<y;j++)
					{
						System.out.print("  " + u[j]);
					}
					System.out.println("\n Converting this Array to ArrayList...");
					for(i=0;i<y;i++)
					{
						l=u[i];
						al1.add(l);
						n++;
					}
					System.out.println();
				break;
				case 9:
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