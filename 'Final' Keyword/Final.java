import java.util.*;
import java.lang.*;

class Final
{
	public static void main(String[] args)
	{
		final int i=90;
		i=900;
	}
}
final class c1
{
	final void show()
	{
		System.out.println("c1");
	}
}
class c2 extends c1
{
	void show()
	{
		System.out.println("c2");
	}
}