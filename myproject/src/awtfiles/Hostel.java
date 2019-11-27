package awtfiles;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Hostel extends JFrame implements ActionListener
{
	JLabel name,phone_number,department,year,address,dob,n;
   public Hostel()
	{
		JTextField namef,phone_numberf,departmentf,yearf,addressf,dobf;
		setVisible(true);
		setSize(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		
		
		n=new JLabel("Welcome To Hostel  ");					
		n.setBounds(130,10,150,50);
		
		Font labelFont = n.getFont();
		String labelText = n.getText();
		
		int stringWidth = n.getFontMetrics(labelFont).stringWidth(labelText);
		int componentWidth = n.getWidth();
		
		double widthRatio = (double)componentWidth / (double)stringWidth;
		
		int newFontSize = (int)(labelFont.getSize() * widthRatio);
		int componentHeight = n.getHeight();
		
		int fontSizeToUse = Math.min(newFontSize, componentHeight);
		n.setFont(new Font(labelFont.getName(), Font.BOLD,fontSizeToUse));
		
		add(n);
		name=new JLabel("Enter your name");					
		name.setBounds(40,70,100,30);
		add(name);
		namef=new JTextField(50);
		namef.setBounds(170,70,150,30);
		add(namef);
		year=new JLabel("Year");					
		year.setBounds(40,210,100,30);
		add(year);
		yearf=new JTextField();
		yearf.setBounds(170,210,150,30);
		add(yearf);
		phone_number=new JLabel("Phone Number");					
		phone_number.setBounds(40,280,100,30);
		add(phone_number);
		phone_numberf=new JTextField();
		phone_numberf.setBounds(170,280,150,30);
		add(phone_numberf);
		department=new JLabel("Department");					
		department.setBounds(40,140,100,30);
		add(department);
		departmentf=new JTextField();
		departmentf.setBounds(170,140,150,30);
		add(departmentf);
		dob=new JLabel("Date of Birth");					
		dob.setBounds(40,350,100,30);
		add(dob);
		dobf=new JTextField();
		dobf.setBounds(170,350,150,30);
		add(dobf);
		JButton register=new JButton("Register");
		register.setBounds(140,400,100,40);
		add(register);
		
		register.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e){
			String empty = "";
			
			if(namef.getText().compareTo(empty) == 0 || yearf.getText().compareTo(empty) == 0 )
			{
			//	JOptionPane.showMessageDialog(this,"Field is Missing","Error",JOptionPane.ERROR_MESSAGE);
			new Error("");
			dispose();
			}
			else
			{
				new LoginSuccessful("");
				
			}
			
			
		}
			
		});
	}
	public static void main(String args[])
	{
		new Hostel();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
