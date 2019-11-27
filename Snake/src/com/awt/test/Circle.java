package com.awt.test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Shapes extends JFrame 
{
	static final long serialVersionUID = 1L;

	Shapes()
	{
		setVisible(true);
		setTitle("shape");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(320,320);
		
		JPanel p = new JPanel()
		{
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			Shape line = new Line2D.Double(3,3,30,30);
			Shape rect = new Rectangle(30,30,30,30);
			Shape circle = new Ellipse2D.Double(100,100,100,100);	
			
			g2.draw(circle);
			g2.draw(rect);
			g2.draw(line);
		}
		};
		
		this.getContentPane().add(p);
	}	
}

public class Circle
{

	public static void main(String[] args) 
	{
		new Shapes();	
	}

}
