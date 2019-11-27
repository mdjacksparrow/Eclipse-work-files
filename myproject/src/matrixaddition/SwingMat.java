package matrixaddition;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingMat extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton add;
	JLabel mat1, mat2,result;
	
	public SwingMat()
	{
		setSize(275,180);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Mat Addition");
		setLocationRelativeTo(null);
		setLayout(null);
		
		mat1 = new JLabel("Mat-1");
		mat1.setBounds(10, 10, 50, 20);
		add(mat1);
		
		t1 = new JTextField(20);
		t1.setBounds(10, 30, 20,20);
		add(t1);
		
		t2 = new JTextField(20);
		t2.setBounds(30, 30, 20,20);
		add(t2);

		t3 = new JTextField(20);
		t3.setBounds(10, 50, 20,20);
		add(t3);
		
		t4 = new JTextField(20);
		t4.setBounds(30, 50, 20,20);
		add(t4);
		
		mat2 = new JLabel("Mat-2");
		mat2.setBounds(100, 10, 50, 20);
		add(mat2);
		
		t5 = new JTextField(20);
		t5.setBounds(100, 30, 20,20);
		add(t5);
		
		t6 = new JTextField(20);
		t6.setBounds(120, 30, 20,20);
		add(t6);

		t7 = new JTextField(20);
		t7.setBounds(100, 50, 20,20);
		add(t7);
		
		t8 = new JTextField(20);
		t8.setBounds(120, 50, 20,20);
		add(t8);
		
		result = new JLabel("Result");
		result.setBounds(180, 10, 50, 20);
		add(result);
		
		t9 = new JTextField(20);
		t9.setBounds(180, 30, 20,20);
		add(t9);
		
		t10 = new JTextField(20);
		t10.setBounds(200, 30, 20,20);
		add(t10);

		t11 = new JTextField(20);
		t11.setBounds(180, 50, 20,20);
		add(t11);
		
		t12 = new JTextField(20);
		t12.setBounds(200, 50, 20,20);
		add(t12);
		
		add = new JButton("Add");
		add.setBounds(90,80, 80, 50);
		add(add);
		
		add.addActionListener(this);
	}

	public static void main(String[] args)
	{
		new SwingMat();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int i1,j1,i2,j2,i3,j3,i4,j4,i5,j5,i6,j6;
		
		try 
		{
			i1 = Integer.parseInt(t1.getText());
			j1 = Integer.parseInt(t2.getText());
			i2 = Integer.parseInt(t3.getText());
			j2 = Integer.parseInt(t4.getText());
			i3 = Integer.parseInt(t5.getText());
			j3 = Integer.parseInt(t6.getText());
			i4 = Integer.parseInt(t7.getText());
			j4 = Integer.parseInt(t8.getText());

			
			i5 = i1 + i2;
			i6 = i3 + i4;
			
			j5 = j1 + j2;
			j6 = j3 + j4;
			
			t9.setText(String.valueOf(i5));
			t10.setText(String.valueOf(j5));
			t11.setText(String.valueOf(i6));
			t12.setText(String.valueOf(j6));
			
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
		
	}

}
