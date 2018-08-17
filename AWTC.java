import java.awt.*;
import java.awt.event.*;
import java.lang.*;

class AWTC
{
	public static void main(String[] args)
	{
		Frame f1 = new Frame("WTF!!!");
		f1.setLayout(null);
		f1.setBounds(100,100,500,500);						//Setting boundary of main frame
		MenuBar mb1 = new MenuBar();
		Menu m1 = new Menu("Joker");
		Menu m2 = new Menu("Extra");
		MenuItem i1 = new MenuItem("_V_");
		MenuItem i2 = new MenuItem("No, Yeah!");
		MenuItem i3 = new MenuItem("Scream!");
		MenuItem i4 = new MenuItem("Kill!");
		MenuItem i5 = new MenuItem("F...");
		MenuItem i6 = new MenuItem("Why?");
		MenuItem i7 = new MenuItem("Got anything ???");
		MenuItem i8 = new MenuItem("HA! HA! HA! HA! HA! HA! HA! HA! HA!");
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		m1.add(i6);
		m2.add(i7);
		m2.add(i8);
		m1.add(m2);
		mb1.add(m1);
		f1.setMenuBar(mb1);
		Label l1 = new Label("Enter anything :- ");		//Label		
		f1.add(l1);
		l1.setBounds(30,60,100,40);
		Label l2 = new Label("Sum is :- ");
		f1.add(l2);
		l2.setBounds(180,280,100,40);
		Label l3 = new Label();
		f1.add(l3);
		l3.setBounds(300,280,100,40);
		TextField tf1 = new TextField(); 					//TextField
		f1.add(tf1);
		tf1.setBounds(150,60,100,40);
		TextField tf2 = new TextField();
		f1.add(tf2);
		tf2.setBounds(300,60,100,40);
		Checkbox cb1 = new Checkbox("Check this...,,"); 					//Checkbox
		Checkbox cb2 = new Checkbox("Check that...,,");
		cb1.setBounds(20,120,200,30);
		cb2.setBounds(20,150,200,30);
		f1.add(cb1);
		f1.add(cb2);
		CheckboxGroup rb1 = new CheckboxGroup();  					   //CheckboxGroup is used for Radio Button.
		Checkbox cb3 = new Checkbox("Check only this...,,",rb1,true); 				//Checkbox
		Checkbox cb4 = new Checkbox("Check only that...,,",rb1,false);
		cb3.setBounds(20,180,200,30);
		cb4.setBounds(20,210,200,30);
		f1.add(cb3);
		f1.add(cb4);
		Label l4 = new Label();
		f1.add(l4);
		l4.setBounds(60,350,150,50);
		cb3.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				l4.setText("Check only this selected");
			}
		}
		);
		cb4.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				l4.setText("Check only that selected");
			}
		}
		);
		Button b1 = new Button("Klik Here...,,");
		f1.add(b1);
		b1.setBounds(60,280,90,50);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double d1 = Double.parseDouble(tf1.getText());
				double d2 = Double.parseDouble(tf2.getText());
				double d3 = d1+d2;
				l3.setText(""+d3);
			}
		}
		);
		f1.setVisible(true);
	}
}