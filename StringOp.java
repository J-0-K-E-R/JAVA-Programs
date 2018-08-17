import java.util.*;
import java.lang.*;

class StringOp
{
	public static void main(String[] args)
	{
		int n=0,i,j=0,k=0;
		System.out.print("Enter any string :- ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		n = s.length();
		char c[] = new char[n];
		s.getChars(0,n,c,0);
		char c1[] = new char[n];
		System.out.print("\n Your String is :- "+s+"\n\n");
		for(i=n-1;i>=0;i--)
		{
			c1[k]=c[i];
			k++;
		}
		String s1 = new String(c1);
		System.out.print("Reverse of your String is :- "+s1+"\n\n");
		for(i=0;i<n;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'||c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
			{
				System.out.println("Vowel is "+c[i]+" and location in the string is "+i);
				j++;
			}
		}
		System.out.println("\nTotal number of Vowels are = "+ j+"\n\n");
		for(i=0;i<n;i++)
		{
			if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u'&&c[i]!='A' && c[i]!='E' && c[i]!='I' && c[i]!='O' && c[i]!='U')
			{
				System.out.println("Consonent is "+c[i]+" and location in the string is "+i);
				j++;
			}
		}
		System.out.println("\nTotal number of Consonenets are = "+ j+"\n\n");
	}
}