package awtfiles;

import java.awt.Button;

import javax.swing.JApplet;


@SuppressWarnings("deprecation" )
class LayoutExercise extends JApplet
{
	@Override
	public  void init()
	{
		for(int i = 1; i < 6; i++)
		{
			add(new Button("Button" + 1));
		}
	}
}

