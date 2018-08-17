import java.util.*;
import java.text.*;

class CalendarApp {
	public static void main(String[] args) {
		Calendar C1 = Calendar.getInstance();
		Calendar C2 = Calendar.getInstance();
		String s;
		SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy :: hh:mm:ss"); 
		Scanner reader = new Scanner(System.in);
		System.out.println("\n\n---Calendar Application---");
		System.out.println("\nPlease Choose From Following : ");
		System.out.println(" 1.Internet Packs\n 2.SMS Packs\n 99.Exit");
		int k1 = reader.nextInt();
		switch(k1) {
			case 1 :
				System.out.println("\nPlease Choose From Following : ");
				System.out.println(" 1. 50MB\tAt RC10 Validity 1 Day\n 2. 100MB\tAt RC15 Validity 7 Days\n 3. 500MB\tAt RC50 Validity 28 Days \n 4. 2GB\t\tAt RC150 Validity 28 Days\n99. Exit");
				int k2 = reader.nextInt();
				switch(k2) {
					case 1 :
						C2.add(Calendar.DATE,1);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 2 :
						C2.add(Calendar.DATE,7);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 3 :
						C2.add(Calendar.DATE,28);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 4 :
						C2.add(Calendar.DATE,28);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 99 :
						System.out.println("\nExiting");
						break;
					default :
						System.out.println("\nInvalid Option ");
				}
				break;
			case 2 :
				System.out.println("\nPlease Choose From Following : ");
				System.out.println(" 1. 50 SMS\tAt RC10 Validity 1 Day\n 2. 100 SMS\tAt RC15 Validity 7 Days\n 3. 500 SMS\tAt RC50 Validity 28 Days \n 4. 1000 SMS\tAt RC150 Validity 28 Days\n99. Exit");
				k2 = reader.nextInt();
				switch(k2) {
					case 1 :
						C2.add(Calendar.DATE,1);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 2 :
						C2.add(Calendar.DATE,7);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 3 :
						C2.add(Calendar.DATE,28);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 4 :
						C2.add(Calendar.DATE,28);
						s = F.format(C2.getTime());
						System.out.println("\nThankYou....\nYour Pack Is Valid Till " + s);
						break;
					case 99 :
						System.out.println("\nExiting");
						break;
					default :
						System.out.println("\nInvalid Option ");
				}
				break;
			case 99 :
				System.out.println("\nExiting");
				break;
			default :
				System.out.println("\nInvalid Option");
		}
	}
}	