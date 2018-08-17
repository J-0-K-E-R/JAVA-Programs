import java.util.*;
import java.lang.String;
import java.lang.Integer;
import javax.swing.*;

class Order
{
	public static void main(String[] args)
	{
		int i=0,j=0,n=0,b=0,h=0;
		int sel;
		String a,v="0";
		for(i=0;i<1;i++)
		{
			a = JOptionPane.showInputDialog("Type"+ "\n'1' for Vegetarian" + "\n'2' for Non-Veg");
			h=Integer.parseInt(a);
			if(h==1)
			{
				n=0;
				for(j=0;j<1;j++)
				{
				v=JOptionPane.showInputDialog(null, "Enter your choice please..."+"\n1. Item 1"+"\n2. Item 2"+"\n3. Item 3"+"\n4. Item 4"+"\n5. Item 5"+"\n\n e.g. 4");
				b=Integer.parseInt(v);
				switch(b)
				{
					case 1:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 2:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 3:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 4:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 5:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					default:
					JOptionPane.showMessageDialog(null, "The item you've entered is not available."+"\nPlease enter a valid choice from list.");
					sel = JOptionPane.showConfirmDialog(null, "Do you want to enter again?");
					if(sel == JOptionPane.YES_OPTION)
					{
						j=0;
						n=1;
					}
					else
					{
						j=1;
						n=1;
					}
				}
				if(n==0)
				{
					sel = JOptionPane.showConfirmDialog(null, "Do you want to enter again?");
					if(sel == JOptionPane.YES_OPTION)
					{
						j=-1;
					}
					else
					{
						j=1;
					}
				}
				}
				i=1;
			}
			else if (h==2)
			{
				n=0;
				for(j=0;j<1;j++)
				{
				n=0;
				v=JOptionPane.showInputDialog(null, "Enter your choice please..."+"\n1. Item 1"+"\n2. Item 2"+"\n3. Item 3"+"\n4. Item 4"+"\n5. Item 5"+"\n\n e.g. 4");
				b=Integer.parseInt(v);
				switch(b)
				{
					case 1:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 2:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 3:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 4:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					case 5:
						sel = JOptionPane.showConfirmDialog(null, "Please confirm your order :-");
						if(sel == JOptionPane.YES_OPTION)
						{
							JOptionPane.showMessageDialog(null, "Thanks for Order."+"\nYour order will arrive soon...");
							n=1;
						}
						break;
					default:
					JOptionPane.showMessageDialog(null, "The item you've entered is not available."+"\nPlease enter a valid choice from list.");
					sel = JOptionPane.showConfirmDialog(null, "Do you want to enter again?");
					if(sel == JOptionPane.YES_OPTION)
					{
						j=-1;
						n=1;
					}
					else
					{
						j=1;
						n=1;
					}
				}
				if(n==0)
				{
					sel = JOptionPane.showConfirmDialog(null, "Do you want to enter again?");
					if(sel == JOptionPane.YES_OPTION)
					{
						j=-1;
					}
					else
					{
						j=1;
					}
				}
				}
				i=1;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please enter valid option.");
				sel = JOptionPane.showConfirmDialog(null, "Do you want to enter again?");
				if(sel == JOptionPane.YES_OPTION)
				{
					i=-1;
				}
				else
				{
					i=1;
				}
			}
		}
	}
}