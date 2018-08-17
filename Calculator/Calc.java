import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calc_class {
	private JFrame F;
	private JTextField tx1;
	private JTextField tx2;
	private JPanel controlPanel;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	
	public calc_class() {
		prepareGUI();
	}
	public static void main(String[] args) {
		calc_class C1 = new calc_class();
		C1.runCalc();
	}
	
	private void prepareGUI() {
		F = new JFrame("##roboGOD----Calculator----##");
		F.setBounds(500,100,400,500);
		F.setLayout(new GridLayout(8,1));
		F.setResizable(true);
		
		F.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent wE) {
				System.exit(0);
			}
		});
		
		l1 = new JLabel("" , JLabel.CENTER);
		l2 = new JLabel("" , JLabel.CENTER);
		l3 = new JLabel("" , JLabel.CENTER);
		l4 = new JLabel("Click Me!!!!" , JLabel.CENTER);
		tx1 = new JTextField();
		tx2 = new JTextField();
		
		/*l1.setBounds(20,20,100,20);
		tx1.setBounds(140,20,100,20);
		l2.setBounds(20,90,100,20);
		tx2.setBounds(140,90,100,20);*/
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		F.add(l1);
		F.add(tx1);
		F.add(l2);
		F.add(tx2);
		F.add(l3);
		F.add(controlPanel);
		F.add(l4);
		F.setVisible(true);
	}
	private void runCalc() {
		JButton clearB = new JButton("Clear");
		JButton addB = new JButton("Add");
		JButton subB = new JButton("Subtract");
		JButton mulB = new JButton("Multiply");
		JButton divB = new JButton("Divide");
		JButton NB = new JButton("HA! HA! HA!");
		
		l1.setText("Enter First Number : ");
		l2.setText("Enter Second Number : ");
		l3.setText("Press Any Of The Following ,,,,, Answer Will Be Shown Here : ");
		tx1.setText(null);
		tx2.setText(null);
		
		clearB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tx1.setText(null);
				tx2.setText(null);
				F.add(NB);
				l3.setText("Press Any Of The Following ,,,,, Answer Will Be Shown Here : ");
			}
		});
		addB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(tx1.getText());
				double b = Double.parseDouble(tx2.getText());
				double c = a + b;
				l3.setText("Addition Is : " + c);
			}
		});
		subB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(tx1.getText());
				double b = Double.parseDouble(tx2.getText());
				double c = a - b;
				l3.setText("Subtraction Is : " + c);
			}
		});
		mulB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(tx1.getText());
				double b = Double.parseDouble(tx2.getText());
				double c = a * b;
				l3.setText("Multiplication Is : " + c);
			}
		});
		divB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(tx1.getText());
				double b = Double.parseDouble(tx2.getText());
				double c = a / b;
				l3.setText("Division Is : " + c);
			}
		});
		NB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tx1.setText("KILL!!!!!");
				tx2.setText("KILL!!!!!");
				l1.setText("I AM NOT IN DANGER .......");
				l2.setText("I AM THE DANGER!!!!!!!!!!!");
				l3.setText("YOU ARE ABOUT TO DIE !!!!!!! ");
			}
		});		
		controlPanel.add(clearB);
		controlPanel.add(addB);
		controlPanel.add(subB);
		controlPanel.add(mulB);
		controlPanel.add(divB);
	}
}