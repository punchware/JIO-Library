package org.gravity.window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

	protected void testNull(File file){
		if(file == null){
			System.out.println("null file");
		}
		else{
			System.out.println("not null file");	
		}
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