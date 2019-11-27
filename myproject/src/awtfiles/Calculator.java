package awtfiles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener
{
	
	//Declaring Components
	JTextField showcase;
	JLabel result;
	JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, cross, div, equalto,plusorminus, clear, delete;
	
	Calculator()
	{

		
//		component instantiate
		showcase = new JTextField(20);
		result = new JLabel("Result");
		
//		zero = new JButton("0");
//		zero.setBounds(10,50,50, 40);
		
		one = new JButton("1");
		one.setBounds(10,50,50, 40);
		
		two = new JButton("2");
		two.setBounds(70,50,50, 40);
		
		three = new JButton("3");
		three.setBounds(130,50,50, 40);
		
		plus = new JButton("+");
//		zero.setBounds(10,10,50, 40);
		
		four = new JButton("4");
//		zero.setBounds(10,10,50, 40);
		
		five = new JButton("5");
//		zero.setBounds(10,10,50, 40);
		
		six = new JButton("6");
//		zero.setBounds(10,10,50, 40);
		
		seven = new JButton("7");
//		zero.setBounds(10,10,50, 40);
		
		eight = new JButton("8");
//		zero.setBounds(10,10,50, 40);
		
		nine = new JButton("9");
//		zero.setBounds(10,10,50, 40);
		

		
		minus = new JButton("-");
//		zero.setBounds(10,10,50, 40);
		
		cross = new JButton("x");
//		zero.setBounds(10,10,50, 40);
		
		div = new JButton("/");
//		zero.setBounds(10,10,50, 40);
		
		equalto = new JButton("=");
//		zero.setBounds(10,10,50, 40);
		
		plusorminus = new JButton("+/-");
//		zero.setBounds(10,10,50, 40);
		
		clear = new JButton("Clear");
//		clear.setBounds();
		
		delete = new JButton("Delete");
//		clear.setBounds();

		
		delete = new JButton("Delete");

	
//	adding components to jframe	
		add(zero);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		
		add(plus);
		add(minus);
		add(cross);
		add(div);
	    add(plusorminus);
		add(equalto);
		
		add(clear);
		add(delete);
		
//		Frame Setting
		setVisible(true);
		setLayout(null);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
}
		
	public static void main(String[] args)
	{
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}

}
