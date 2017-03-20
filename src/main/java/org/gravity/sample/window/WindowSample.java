package org.gravity.sample.window;

import org.gravity.window.Window;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.gravity.QR;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;


public class WindowSample extends Window{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override 
	public void configureFrame(){
		final JPanel panel = new JPanel();
		final TextField textField1 = new TextField();
		textField1.setText("Set message here:");
		this.add(textField1);
		final QR qr = new QR("","","");
		Button button1 = new Button();
		button1.setLabel("Click here!");	
		button1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				try{
					ByteArrayOutputStream bos = new ByteArrayOutputStream(255);
					qr.setMessage(textField1.getText());
					//ImageIcon newImageIcon = new ImageIcon(byteArray);
					Image image = ImageIO.read(new File("C:\\Users\\fazreil\\test.png"));
					BufferedImage bImage = (BufferedImage)image;
					ImageIcon newImageIcon = new ImageIcon(bImage);
					textField1.setText("Set message here");

					QRWindow qrWindow = new QRWindow(newImageIcon);
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}		
		});
		panel.add(textField1);
		panel.add(button1);
		panel.setBackground(Color.GREEN);
		this.add(panel);
	}

	public class QRWindow extends Window{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private ImageIcon imageIcon;

		public QRWindow(ImageIcon imageIcon){
			this.imageIcon = imageIcon;
			System.out.println(imageIcon.toString());
		}

		@Override 
		public void configureFrame(){
			try{
				
				BufferedImage picture = ImageIO.read(new File("C:\\Users\\fazreil\\test.png"));
				JLabel label = new JLabel(new ImageIcon(picture));
				this.add(label);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	public static void main(String args[])
	{
		WindowSample sampleApp = new WindowSample();


	}


}