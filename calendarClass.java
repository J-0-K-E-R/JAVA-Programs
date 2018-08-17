import java.util.*;
import java.text.*;

class CalendarClass {
	public static void main(String args[]) {
		Calendar C1 = Calendar.getInstance();
		Calendar CC = Calendar.getInstance();
		System.out.println("\nCurrent Date And Time : " + C1.getTime());
		
		System.out.println("\nCurrent Date : " + C1.get(Calendar.DATE));
		System.out.println("Current Month : " + C1.get(Calendar.MONTH));
		System.out.println("Current Year : " + C1.get(Calendar.YEAR));
		
		System.out.println("\nCurrent Hour : " + C1.get(Calendar.HOUR));
		System.out.println("Current Minute : " + C1.get(Calendar.MINUTE));
		
		C1.add(Calendar.DATE,-100);
		System.out.println("\nManipulated Date : " + C1.getTime());
		C1.add(Calendar.MONTH,5);
		System.out.println("Manipulated Month : " + C1.getTime());
		C1.add(Calendar.YEAR,2);
		System.out.println("Manipulated Year : " + C1.getTime());
		
		Scanner reader = new Scanner(System.in);
		SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy :: hh:mm:ss");
		Date d1 = new Date();
		Date d2 = new Date();
		Date d = new Date();
		String s1 = F.format(CC.getTime());
		System.out.println("\nPlease Enter A Date (Eg. dd/MM/yyyy) : ");
		String s2 = "12/12/2017 :: 00:00:00";
		String s ="31/12/1969 :: 16:00:00";
		try {
			d1 = F.parse(s1);
			d2 = F.parse(s2);
			d = F.parse(s);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		if(d1.before(d2))
			System.out.println("\nWe Ain't There Yet......");
		else if(d2.before(d1))
			System.out.println("\nIt's Passed......");
		else if(d1.equals(d2))
			System.out.println("\nIt's Today!!!!");
		System.out.println("Subtraction is : " + ((d2.getTime() - d1.getTime())/(24*60*60*1000)));
		System.out.println("\n Date in getTime : " + d1.getTime() + "\n Date Created : " + d.getTime());
		}
}