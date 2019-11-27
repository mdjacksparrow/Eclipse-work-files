package awtfiles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstGUI 
{
	public static void main(String[] args)
	{
		Addition obj = new Addition();
	}
}


class Addition extends JFrame implements ActionListener
{
	JTextField text_1, text_2;
	JButton btn;
	JLabel result;
	
	public Addition()
	{
//		create instance of object 
		JFrame frame = new JFrame();
		
//		Create components		
		text_1 = new JTextField(20);		
		text_2 = new JTextField(20);
		btn = new JButton("Add");
		result = new JLabel("Result");
		
//		Add element to the frame
		frame.add(text_1);
		frame.add(text_2);
		frame.add(btn);
		frame.add(result);
		
//		Add actionLisner to button
		btn.addActionListener(this);	//ActionListener is an interface
		
//		Set visibility, layoutmanager, size of windows and closing operation
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.setSize(250,400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			int num1 = Integer.parseInt(text_1.getText());
			int num2 = Integer.parseInt(text_2.getText());
			result.setText(" " + (num1 + num2));
		}
	
		catch(Exception s)
		{
			this.result.setText("Give proper Input !");
		}

	}
}