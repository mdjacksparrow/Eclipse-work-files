package com.awt.test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice extends JFrame
{
	private static final long serialVersionUID = 1L;

	Practice()
	{
		setVisible(true);
		setSize(320,320);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		

		JPanel p = new JPanel()
		{
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g)
			{
				Graphics2D g2 = (Graphics2D) g;
				
				Shape line = new Line2D.Double(10,10,40,40);
				Shape rect = new Rectangle(40,40,40,40);	
				Shape circle = new Ellipse2D.Double(40,40,100,100);
				
				g2.draw(circle);
				g2.draw(line);
				g2.draw(rect);
				
			}
		};
		
		this.getContentPane().add(p);		
	}
	
	public static void main(String[] args) 
	{
		new Practice();
	}

}
