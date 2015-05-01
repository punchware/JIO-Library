package org.gravity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.encoder.QRCode;

public class QR {

	private String message = null;
	private String path = null;
	private String filename = null;
	
	public QR(String message, String path, String filename){
		this.message = message;
		this.path = path;
		this.filename = filename;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getPath(){
		return path;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getFilename(){
		return filename;
	}

	public void setFilename(String filename){
		this.filename = filename;
	}

	public BufferedImage encodeQR()
	{
		QRCodeWriter qrWriter = new QRCodeWriter();
		BitMatrix bitmatrix = new BitMatrix(128, 128);
		BufferedImage bufferedImage = new BufferedImage(128, 128, BufferedImage.TYPE_INT_RGB);
		
		try{
			bitmatrix = qrWriter.encode(message, BarcodeFormat.QR_CODE, 128, 128);
			bufferedImage.createGraphics();
			
			Graphics2D graphics2d = (Graphics2D) bufferedImage.getGraphics();
			graphics2d.setColor(Color.WHITE);
			graphics2d.fillRect(0, 0, 128, 128);
			graphics2d.setColor(Color.BLACK);
			for (int i = 0; i < 128; i++) {
	            for (int j = 0; j < 128; j++) {
	                if (bitmatrix.get(i, j)) {
	                    graphics2d.fillRect(i, j, 1, 1);
	                }
	            }
	        }
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return bufferedImage;

	}

	public void generateQR(BufferedImage bufferedImage)
	{
		
		try{
			
			String filePath = path+filename+".png";
			ImageIO.write(bufferedImage, "png", new File(filePath));
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static void main(String[] args){
		QR qrCode = new QR(args[0],args[1],args[2]);	
		qrCode.generateQR(qrCode.encodeQR());
	}


	
}
