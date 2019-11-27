package awtfiles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginSuccessful  extends JFrame implements ActionListener
{
	JLabel msg;
	JButton back;
	public LoginSuccessful(String s)
	{
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,150);
		setLocationRelativeTo(null);
		setLayout(null);
		

		
		msg = new JLabel(s);
		msg.setBounds(100,0,200,50);
		msg.setForeground(Color.GREEN);
		
		Font labelFont = msg.getFont();
		String labelText = msg.getText();
		
		int stringWidth = msg.getFontMetrics(labelFont).stringWidth(labelText);
		int componentWidth = msg.getWidth();
		
		double widthRatio = (double)componentWidth / (double)stringWidth;
		
		int newFontSize = (int)(labelFont.getSize() * widthRatio);
		int componentHeight = msg.getHeight();
		
		int fontSizeToUse = Math.min(newFontSize, componentHeight);
	
		msg.setFont(new Font(labelFont.getName(), Font.ROMAN_BASELINE,fontSizeToUse));
		add(msg);
		
		
		back = new JButton("Back");
		back.setBounds(150,60,100,40);
		add(back);
		
		back.addActionListener(this);
		

	}
	
//	public static void main(String[] args)
//	{
//		new LoginSuccessful();
//	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == back)
		{
			new ReverseString();
			dispose();
		}
	}
}

