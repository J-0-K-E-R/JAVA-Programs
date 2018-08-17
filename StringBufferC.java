import java.lang.*;

class StringBufferC
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		System.out.println("						 ~_StringBuffer_~");
		System.out.println("Right now we are using StringBuffer class instead of String class \nStringBuffer and StringBuilder classes allow us to edit String and store in the Memory...,,");
		System.out.println("Right now both sb1 and ab2 are empty. I'm inserting something in them...");
		sb1.insert(0,"I am not in Danger, ");
		sb2.insert(0,"I am the Danger...,,");
		System.out.println("Now Strings are :-"+"\n	sb1 = "+sb1+"\n	sb2 = "+sb2);
		System.out.println("Replacing 'I am' with 'I'm' in both strings...");
		sb1.replace(0,4," I'm");
		sb2.replace(0,4," I'm");
		System.out.println("Now Strings are :-"+"\n	sb1 = "+sb1+"\n	sb2 = "+sb2);
		System.out.println("Merging these Strings...");
		sb1.append(sb2);
		System.out.println("Now sb1 is = "+sb1);
		System.out.println("\n\n YO!!! BITCH!!!\n\n");
	}
}