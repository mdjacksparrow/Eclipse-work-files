package awtfiles;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class CheckAge extends JFrame
{
	public CheckAge()
	{
		JTextField tf = new JTextField(10);
		JLabel l = new JLabel("You are ?");
		JButton btn1 = new JButton("Check");
		
		add(tf);
		add(btn1);
		add(l);
		
		btn1.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int num = Integer.parseInt(tf.getText());
				
				if(num >= 18 )
					l.setText("Eligible for VOTE !");
				else
					l.setText("Not Eligible for VOTE !");
			}
		});		
		
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
