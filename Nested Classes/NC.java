class NC
{
	public static void main(String[] args)
	{
		N1 n1 = new N1();
		n1.get();
	}
}
class N1
{
	private class N2
	{
		public void show()
		{
			System.out.println("Oye.......,," + "  I'm inside private class.");
		}
	}
	public void get()
	{
		N2 n2 = new N2();
		n2.show();
	}
}