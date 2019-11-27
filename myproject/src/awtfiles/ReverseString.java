package awtfiles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReverseString extends JFrame implements ActionListener
{
	JLabel info;
	JTextField input;
	JButton check;
	
	public ReverseString()
	{
		setVisible(true);
		setSize(299,140);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("Reverse String!");
		setResizable(false);
		
		info = new JLabel("Enter String  :");
		add(info);
	
		input = new JTextField(20);
		add(input);
	
		check = new JButton("Reverse");
		add(check);
		
		
		check.addActionListener(this);
	}
	
	public static void main(String[] args) 
	{
		new ReverseString();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String empty = "";
		if(input.getText().compareTo(empty) == 0)
		{
			new Error("Field is Empty!");
			dispose();
		}
		else
		{
			String s = input.getText();
			String rs = "";
			
			StringBuilder s1 = new StringBuilder(s);
			rs = s1.reverse().toString();
			new LoginSuccessful(rs);
			dispose();
		}
	}

}
