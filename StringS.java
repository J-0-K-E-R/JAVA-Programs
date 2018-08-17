import java.lang.*;

class StringS
{
	public static void main(String[] args)
	{
		String S1,S2,S3,S4;
		boolean b;
		System.out.println("						 ~_Strings_~");
		S1 = "Joker";
		S2="joker";
		S3="Aman is ";
		System.out.println("Strings Are :-\n"+" 	S1 = "+S1+"\n	S2 = "+S2+"\n	S3 = "+S3);
		System.out.println("Comparing Strings S1 & S2 without Ignore Case....");
		b=S1.equals(S2);
		System.out.println("Answer is "+b);
		System.out.println("Comparing Strings S1 & S2 with Ignore Case....");
		b=S1.equalsIgnoreCase(S2);
		System.out.println("Answer is "+b);
		System.out.println("Merging S1 and S3...");
		S4 = S3.concat(S1);
		System.out.println("New merged String is "+S4);
		System.out.println("\n\nCheck other functions from notes...,,\n");
	}
}