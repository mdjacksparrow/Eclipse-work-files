package awtfiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeExample extends JFrame implements ActionListener
{
	
	private int num;
	
	private int MAX = 10;
	private JLabel l;
	
	Timer t = new Timer(3000,this);
	public TimeExample()
	{
		l = new JLabel("hello", l.CENTER);
		
		add(l);
		

		t.start();
//		count();
//		setLayout(null);
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		l.setText("1");
		t.stop();
		Timer s = new Timer(2000, this);
		s.start();
		l.setText("21");
		
		
	}
	
	public static void main(String[] args)
	{
		new TimeExample();
	}
}
