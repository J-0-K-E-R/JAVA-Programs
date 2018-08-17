import java.util.*;

class OTP {
	public static void main(String[] args) {
		int k=5;
		Calendar CC = Calendar.getInstance();
		Calendar C1 = Calendar.getInstance();
		C1.add(Calendar.SECOND , 1);
		while(k!=0) {
			CC = Calendar.getInstance();
			if(CC.getTime().equals(C1.getTime())){
				C1.add(Calendar.SECOND ,1);
				System.out.println(k--);
			}
		}
	}
}