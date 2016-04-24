package org.gravity.window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends java.awt.Frame{
	
	public Window()
	{
		initializeWithCommonBehavior();
		draw();

	}

	public void initializeWithCommonBehavior(){
		this.addWindowListener(new JIOWindowAdapter());
	}

	public void draw(){

	}

	public static void Main(String[] args)
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