package snakegame;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Snake extends JFrame
{
	Image icon;

    public Snake()
    {
    	setTitle("Snake");
    	ImageIcon iii = new ImageIcon("C:\\Users\\ELCOT\\workspace\\myproject\\src\\snakegame\\snake.png");
        icon = iii.getImage();
        initUI();
      
    }
    
    private void initUI() {
        
    	add(new Game());
        
        setResizable(false);
        pack();
       
        setLocationRelativeTo(null);
        setIconImage(icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}