import java.util.Scanner;
import java.lang.String;
import javax.swing.JOptionPane;

class encap
{
	public static void main(String[] args)
	{
		String n="0",g="0";
		int a,b,sel;
		Scanner scan =  new Scanner(System.in);
		n = JOptionPane.showInputDialog("What is your name ?");
		g = JOptionPane.showInputDialog("What is your age ?");
		a=Integer.parseInt(g);
		System.out.println();;
		String e;
		E1 e1 = new E1();
		e1.setn(n);
		e1.seta(a);
		sel = JOptionPane.showConfirmDialog(null, " Do you wanna know the information ?");
		if (sel == JOptionPane.YES_OPTION)
		{
			e=e1.outn();
			b=e1.outa();
			JOptionPane.showMessageDialog(null, "Name is " + e + ". Age is " + b +".");
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You're data has been deleted." + " Don't bother to look, asshole !!!");
			System.exit(0);
		}
	}
}