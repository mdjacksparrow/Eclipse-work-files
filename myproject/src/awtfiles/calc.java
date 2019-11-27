package awtfiles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calc 
{

	public static void main(String[] args) 
	{
		Operation obj = new Operation();
	}

}

class Operation extends JFrame implements ActionListener
{
//	Declaring components
	JButton b1,b2;
	JTextField t1,t2;
	JLabel result;
	
	public Operation()
	{
	
//		Instantiate components
		b1 = new JButton("Add");
		b2 = new JButton("Sub");
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		
		result = new JLabel("Result");		
		
//		Adding Components
		add(t1);
		add(t2);
		add(result);
		add(b1);
		add(b2);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,400);
	
//		Adding action listener to buttons
		
		b1.addActionListener(this);	
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		int result;
		
		if(ae.getSource() == b1)
			result = num1 + num2;
		else
			result = num1 - num2;
		
		this.result.setText("" + result);
		
	}
	
}
