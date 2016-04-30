package org.gravity.window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends java.awt.Frame{
	
	public Window()
	{
		initializeWithCommonBehavior();
		configureFrame();
		fillFrame();
		draw();

	}

	public void initializeWithCommonBehavior(){
		this.addWindowListener(new JIOWindowAdapter());
		this.setSize(320,240);
	}

	public void configureFrame(){}

	public void fillFrame(){}

	public void draw(){
		this.setVisible(true);
	}

	public static void main(String[] args)
	{
		Window win = new Window();
	}

	public class JIOWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
}