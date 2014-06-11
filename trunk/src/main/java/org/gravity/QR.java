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

	public static void main(String[] args){
		String message = args[0];
		QRCodeWriter qrWriter = new QRCodeWriter();
		BitMatrix bitmatrix = new BitMatrix(128, 128);
		
		try{
			bitmatrix = qrWriter.encode(message, BarcodeFormat.QR_CODE, 128, 128);
			BufferedImage bufferedImage = new BufferedImage(128, 128, BufferedImage.TYPE_INT_RGB);
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
			
			String path = args[1]+args[2]+".png";
			ImageIO.write(bufferedImage, "png", new File(path));
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
