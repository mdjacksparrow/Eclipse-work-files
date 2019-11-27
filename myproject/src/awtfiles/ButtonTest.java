package awtfiles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonTest 
{
	public static void main(String[] args)
	{
		new Test();
	}
}

class Test extends JFrame
{
	public Test() 
	{
		JRadioButton rb1 = new JRadioButton("Yes");
		JRadioButton rb2 = new JRadioButton("No");
		JLabel l1 = new JLabel("You are above 18 or not ?");
		JButton btn = new JButton("Next");
		JLabel l2 = new JLabel("Click to proceed !");
		
		ButtonGroup g = new ButtonGroup();
		g.add(rb1);
		g.add(rb2);
		
		add(l1);
		add(rb1);
		add(rb2);
		add(btn);
		add(l2);
		
		btn.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(rb1.isSelected())
				{
					new CheckAge();
					dispose();
				}
				else
					l2.setText("Click Close Button");
			}
		});
		
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}