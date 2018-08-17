import java.util.*;

class Array
{
	public static void main(String[] args)
	{
		int n,i,j,k=0,x=0,p=0,c,temp;
		boolean b=true;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements do you want to enter in an array :- ");
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements :-");
		for(i=0;i<n;i++)
		{
			System.out.print("Element " + (i+1) + " :- ");
			a[i] = scan.nextInt();
		}
		System.out.println("Your array is :- ");
		for(j=0;j<n;j++)
		{
			System.out.print("  " + a[j]);
		}
		while(b==true)
		{
			System.out.println();
			System.out.println();
			System.out.println("These operations can be performed on your array :-\n 1. Sorting\n 2. Search of an element\n 3. Sum of all elements of your array\n 4. Reverse the array\n 5. Exit");
			System.out.print("	Your choice = ");
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					System.out.println();
					System.out.println();
					for(i=0;i<n;i++)
					{
						for(j=0;j<n-1;j++)
						{
							if(a[j]>a[j+1])
							{
								temp=a[j];
								a[j]=a[j+1];
								a[j+1]=temp;
							}
						}
					}
					System.out.println("Sorted array is :- ");
					for(j=0;j<n;j++)
					{
						System.out.print("  " + a[j]);
					}
				break;
				case 2:
					System.out.println();
					System.out.println();
					System.out.print("Enter the element that you want to search :- ");
					x = scan.nextInt();
					for(i=0;i<n;i++)
					{
						if(a[i]==x)
						{
							System.out.println("Location of the element is " + (i+1)+".");
							p=1;
						}
					}
					if(p==0)
					{
						System.out.println("Your element is not present in the array.");
					}
				break;
				case 3:
					System.out.println();
					System.out.println();
					for(i=0;i<n;i++)
					{
						x=x+a[i];
					}
					System.out.println("Sum of the all elements of the Array is "+x+".");
				break;
				case 4:
					System.out.println("Your array in reversed formation is as follows :-");
					for(i=n-1;i>=0;i--)
					{
						System.out.print("	"+a[i]);
					}
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Given option is not valid.\n Please enter a valid option.");
		}
		}
	}
}