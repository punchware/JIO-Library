package org.gravity.sample.window;

import org.gravity.window.Window;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class WindowSample extends Window{
	
	@Override 
	public void configureFrame(){
		TextField textField1 = new TextField();
		textField1.setText("Set message here:");
		this.add(textField1);
		Button button1 = new Button();
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e)
			{
				new JOptionPane().showMessageDialog(null,"alert","alert",JOptionPane.INFORMATION_MESSAGE);	
			}		
		});
		this.add(button1);
	}

	public static void main(String args[])
	{
		WindowSample sampleApp = new WindowSample();


	}


}