package awtfiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FibGUI extends JFrame implements ActionListener, KeyListener
{
	private static final long serialVersionUID = 1L;

	JLabel description, output,empty;
	JTextField input;	
	JButton generate;

	public FibGUI()
	{
		description = new JLabel("Enter No.of Fibonnaci series  :");
		output = new JLabel("Output : ");
		input = new JTextField(20);
		generate = new JButton("Generate");
		empty = new JLabel("");
		
		add(description);
		description.setBounds(20,20,200,40);
	
		add(input);
		input.addKeyListener(this);
		
		input.setBounds(240,25,50,30);
		
		add(output);
		output.setBounds(40, 100, 280, 150);
		
		add(generate);
		generate.setBounds(190,65,150,30);
		
		add(empty);
		empty.setBounds(50, 130, 10, 50);
		
		generate.addActionListener(this);
		
		setTitle("Fibonacci Series");
		setResizable(false);
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
	}
	
	public static void main(String[] args) 
	{
		new FibGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int n, b1 = 0 , b2 = 1, b3;
		String series = "";
		
		if(e.getSource() == this.generate)
		{
			n = Integer.parseInt(input.getText());
			
			series = String.valueOf(b1);
			series += String.valueOf(" > ");
			
			series = String.valueOf(b2);
			series += String.valueOf(" > ");
			
			for(int i = 0; i <= n;i++)
			{
				b3 = b1 + b2;
				b1 = b2;
				b2 = b3;
				series += String.valueOf(b3);
				series += String.valueOf(" > ");
			}
			output.setText(series);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int n, b1 = 0, b2 = 1, b3;
		String series;
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER) 
		{
			n = Integer.parseInt(input.getText());
			
			series = String.valueOf(b1);
			series += String.valueOf(" > ");
			
			series = String.valueOf(b2);
			series += String.valueOf(" > ");
			
			for(int i = 0; i <= n;i++)
			{
				b3 = b1 + b2;
				b1 = b2;
				b2 = b3;
				series += String.valueOf(b3);
				series += String.valueOf(" > ");
			}
			output.setText(series);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
