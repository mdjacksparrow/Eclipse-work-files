package awtfiles;

import java.awt.event.*;

import javax.swing.*; 

public class JFramInSwing
{  

	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		JTextField tf = new JTextField();
		JButton btn = new JButton(new ImageIcon("D:\\icon.png"));
		
		tf.setBounds(50,40, 150, 40);
		btn.setBounds(65, 140, 150, 70);
		f.add(btn);
		f.add(tf);
//		
//		ActionListener al = new ActionListener()
//				{
//					@Override
//					public void actionPerformed(ActionEvent e)
//					{
//						tf.setText("You're clicked the button");
//					}
//				};
//		
		
//		Using Lamda Expression
		btn.addActionListener(al -> 
		{
			tf.setText("U r clicked!");
		});
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(300,400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
} 