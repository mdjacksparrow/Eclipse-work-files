package awtfiles;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;   
public class MouseAdapterExample extends MouseAdapter{   
    JFrame f;   
    MouseAdapterExample(){   
        f=new JFrame("Mouse Adapter");   
        f.addMouseListener(this);   
        f.setSize(300,300);  
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);   
        f.setVisible(true);   
    }   
    public void mouseClicked(MouseEvent e) {   
        Graphics g=f.getGraphics();   
        g.setColor(Color.BLUE);   
        g.fillOval(e.getX(),e.getY(),30,30);   
    }   
      public static void main(String[] args) {   
    new MouseAdapterExample();   
}  }   
