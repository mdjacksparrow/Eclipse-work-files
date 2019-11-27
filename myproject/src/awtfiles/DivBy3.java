package awtfiles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DivBy3 extends JFrame implements ActionListener
{
	JLabel info,empty1,empty2;
	JButton check;
	JTextField input;
	
	public DivBy3()
	{
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(310,110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("Div By 3 checker");
		setResizable(false);
		
		info = new JLabel("Enter num  :");
		add(info);
	
		input = new JTextField(20);
		add(input);
	
		check = new JButton("Check");
		add(check);
		
		
		check.addActionListener(this);
		
	}

	public static void main(String[] args) 
	{
		new DivBy3();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String error = "";
		int num;
		
		if(error.compareTo(input.getText()) == 0)
		{
			new Error("Field is Missing!");
			dispose();
		}

		else
		{
			try {
				num = Integer.parseInt(input.getText());
				
					if(num%3 == 0)
					{
						new LoginSuccessful("Its Divisible by 3");
						dispose();
					}
					else {
						new Error("Not Divisible by 3");
						dispose();
						}
				
				
			}
			catch(Exception ae)
			{
				new Error("Give Proper Input!");
				dispose();
			}
		}
		
	}

}
