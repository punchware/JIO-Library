package org.gravity.sample.window;

import org.gravity.window.Window;
import org.gravity.window.Window.JIOWindowAdapter;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.gravity.QR;
import java.awt.Image;
import javax.imageio.ImageIO;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WindowSampleRGB extends Window{
	
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
					File file = new File("test.png");
					file = createFile(file);
					byte[] byteArray = qr.generateQR(qr.encodeRGBQR(),ImageIO.createImageOutputStream(bos), file);
					Image image = ImageIO.read(file);
					BufferedImage bImage = (BufferedImage)image;
					ImageIcon newImageIcon = new ImageIcon(bImage);
					textField1.setText("Set message here");
					QRWindow qrWindow = new QRWindow(newImageIcon,file);
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
	
	private File createFile(File file){
		BufferedWriter bw = null;
		FileWriter fw = null;
		try{
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.close();
			fw.close();
		}
		catch(IOException ioEx){
			ioEx.printStackTrace();
		}
		return file;
	}

	public class QRWindow extends java.awt.Frame{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private ImageIcon imageIcon;
		private File file = null;
		private QR qrReader = new QR("","","");
		
		public QRWindow(ImageIcon imageIcon, File file){
			this.imageIcon = imageIcon;
			this.file = file;
			initializeWithCommonBehavior();
			this.configureFrame();
			fillFrame();
			draw();
		}
		
		public void initializeWithCommonBehavior(){
			this.addWindowListener(new JIOWindowAdapter());
			this.setSize(320,240);
		}

		public void configureFrame(){
			try{
				if(file != null){
					BufferedImage picture = ImageIO.read(this.file);
					JLabel label = new JLabel(new ImageIcon(picture));
					this.add(label);
				}
				else{
					throw new NullPointerException();
				}
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		public void fillFrame(){}

		public void draw(){
			this.setVisible(true);
			new javax.swing.JOptionPane().showMessageDialog(null, qrReader.readRGBQR(file), "QR result", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}

	public static void main(String args[])
	{
		WindowSampleRGB sampleApp = new WindowSampleRGB();
	}


}