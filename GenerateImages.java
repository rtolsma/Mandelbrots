import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;


public class GenerateImages implements Runnable{
	int[][] data;
	final static String fileName="/home/Mandelbrot";
	public GenerateImages(int[][] p) {
		data=p;
	}
	public void run() {
		BufferedImage img=new BufferedImage(data.length, data[0].length, BufferedImage.TYPE_INT_ARGB);
		try {
			for(int i=0; i<data.length; i++) {
				for(int j=0; j<data[0].length; j++) {
					img.setRGB(i, j, data[i][j]);
				}
			}
			
			ImageIO.write(img, "png", new File(fileName+System.currentTimeMillis()+".png"));
		} catch(IOException e ) {
			e.printStackTrace();
		}
		
	}
	static BufferedImage toImage(int[][] p) {
		BufferedImage img=new BufferedImage(p.length, p[0].length, BufferedImage.TYPE_INT_ARGB);
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p[0].length; j++) {
				img.setRGB(i, j, p[i][j]);
			}
		}
		
		return img;
		
	}
	

	
}
