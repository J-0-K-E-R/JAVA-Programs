import java.util.*;
import java.text.*;

class DT
{
	public static void main(String[] args)
	{
		String l;
		Date date = new Date();
		System.out.println("\n You pressed Enter Key at "+date);
		System.out.println("It's just for practice...,,");
		System.out.println("Hours are "+ date.getHours());
		System.out.println("Minutes are "+ date.getMinutes());
		System.out.println("Seconds are "+ date.getSeconds());
		System.out.println("Day is "+ date.getDay());
		System.out.println("Month is "+(date.getMonth()+1));
		System.out.println("Date is "+ date.getDate());
		System.out.println("Year is "+ (date.getYear()+1900));
		System.out.println("\n\nLet's try it in another Format...,,");
		SimpleDateFormat f1 = new SimpleDateFormat("hh:mm:ss dd/MMM(MM)/yyyy zzzz");
		l=f1.format(date);
		System.out.println("Right now is "+l+".");
		System.out.println("Now that also looks good...,, ;)");
	}
}