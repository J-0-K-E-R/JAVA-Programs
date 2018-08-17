import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class DateDifference {
	public static void main(String[] args) {
		Date D1 = new Date();
		Date D2 = new Date();
		Scanner reader = new Scanner(System.in);
		SimpleDateFormat F1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter Two Dates To Find Difference: \n");
		String date1 = reader.nextLine();
		String date2 = reader.nextLine();
		try {
			D1 = F1.parse(date1);
			D2 = F1.parse(date2);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		long sum = 0;
		int k = (D1.getDate() - D2.getDate());
		if(k<0)
			sum+= 0 - k;
		else
			sum+=k;
		k = (D1.getYear() - D2.getYear())*365;
		if(k<0)
			sum+= 0 - k;
		else
			sum+=k;*
		k = (D1.getMonth() - D2.getMonth());
		if(k<0) {
			for( i = D1.getMonth();i<=D2.getMonth();i++) {
				if(i==0||i==2||i==4||i==6||i==7||i==9||i==11) 
					sum += 31;
				else if(i==1)
					sum += (0-k)
		else
			sum+=k;
		System.out.println("\n\nDifference is " + sum + " Days");
	}
}