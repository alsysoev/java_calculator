import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	int i,k;
	String a,b;
	eHandler handler = new eHandler();
	
	public Reader(String s) {
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("0");
		b2 = new JButton("1");
		b3 = new JButton("2");
		b4 = new JButton("3");
		b5 = new JButton("4");
		b6 = new JButton("5");
		b7 = new JButton("6");
		b8 = new JButton("7");
		b9 = new JButton("8");
		b10 = new JButton("9");
		b11 = new JButton("+");
		b12 = new JButton("-");
		b13 = new JButton("*");
		b14 = new JButton("/");
		b15 = new JButton("+/-");
		b16 = new JButton("=");
		b17 = new JButton("C");
		t1 = new JTextField(10);
		l1 = new JLabel("Введите первое число");
		l2 = new JLabel("Введите второе число");
		l3 = new JLabel("");
		l4 = new JLabel("");
		
		t2 = new JTextField(10);
		
		add(t1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b1);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		
		b2.addActionListener(handler);
		b1.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b10.addActionListener(handler);
		b11.addActionListener(handler);
		b12.addActionListener(handler);
		b13.addActionListener(handler);
		b14.addActionListener(handler);
		b15.addActionListener(handler);
		b16.addActionListener(handler);
		b17.addActionListener(handler);
		
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
			if (e.getSource()==b2)	{
				t1.setText(t1.getText() +"1");
			}
			if (e.getSource()==b3)	{
				t1.setText(t1.getText()+"2");
			}
			if (e.getSource()==b4)	{
				t1.setText(t1.getText()+"3");
			}
			if (e.getSource()==b5)	{
				t1.setText(t1.getText()+"4");
			}
			if (e.getSource()==b6)	{
				t1.setText(t1.getText()+"5");
			}
			if (e.getSource()==b7)	{
				t1.setText(t1.getText()+"6");
			}
			if (e.getSource()==b8)	{
				t1.setText(t1.getText()+"7");
			}
			if (e.getSource()==b9)	{
				t1.setText(t1.getText()+"8");
			}
			if (e.getSource()==b10)	{
				t1.setText(t1.getText()+"9");
			}
			if (e.getSource()==b1)	{
				t1.setText(t1.getText()+"0");
			}
			if (e.getSource()==b11)	{
				a=t1.getText();
				t1.setText(null);
				i=1;
			}
			if (e.getSource()==b12)	{
				a=t1.getText();
				t1.setText(null);
				i=2;
			}
			if (e.getSource()==b13)	{
				a=t1.getText();
				t1.setText(null);
				i=3;
			}
			if (e.getSource()==b14)	{
				a=t1.getText();
				t1.setText(null);
				i=4;
			}
			if (e.getSource()==b15)	{
				i=Integer.parseInt(t1.getText());
				i=-i;
				b=Integer.toString(i);
				t1.setText(b);
			}
			if(e.getSource() == b16) {
				if(i==1) {
					k=Integer.parseInt(t1.getText())+Integer.parseInt(a);
				}
				if(i==2) {
					k=Integer.parseInt(a)-Integer.parseInt(t1.getText());
				}
				if(i==3) {
					k=Integer.parseInt(t1.getText())*Integer.parseInt(a);
				}
				if(i==4) {
					k=Integer.parseInt(a)/Integer.parseInt(t1.getText());
				}
				b=Integer.toString(k);
				t1.setText(b);
				
			}
			
			if (e.getSource()==b17)	{
				t1.setText(null);
			}
			
			}catch (Exception ex) { JOptionPane.showMessageDialog(null,"Введите в поле число"); }
			
		}
		
	}
}
