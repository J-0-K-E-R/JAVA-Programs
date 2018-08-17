import java.util.*;
import java.lang.*;

class Vowels
{
	public static void main(String[] args)
	{
		int n=0,i,j=0;
		System.out.print("Enter any string :- ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		n = s.length();
		char c[] = new char[n];
		s.getChars(0,n,c,0);
		for(i=0;i<n;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'||c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
			{
				System.out.println("Vowel is "+c[i]+" and location in the string is "+i);
				j++;
			}
		}
		System.out.println("Total number of Vowels are = "+ j);
	}
}