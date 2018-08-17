import java.lang.String;
import javax.swing.JOptionPane;

public class E1
{
	private String name;
	private int age;
	public void setn(String n)
	{
		name = n;
	}
	public void seta(int a)
	{
		age = a;
	}
	public String outn()
	{
		int sel;
		JOptionPane.showMessageDialog(null, "Why the hell did you want to know the name that you'd just entered." );
		JOptionPane.showMessageDialog(null, "You seems like a crazy one." + " Look again you just entered the name.  sucker!!!" );
		sel = JOptionPane.showConfirmDialog(null, " Do you still wanna know the information ?");
		if (sel == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Ok, I'm gonna let you know it..." + " Go to hell with it...,,");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "What the FUCK man !!!" + " You jus proved you're an asshole !!!");
			System.exit(0);
		}
		return name;
	}
	public int outa()
	{
		return age;
	}
}