import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class PictureTester extends ImageUtils {

	public static void main(String[] args) {
	
		
			System.out.println("This program will allow you to see the original photo, as well as the 3 modified photos.");
			
			System.out.println("The modified photos are the original picture with a shade of one of the 3 primary colors on the ROYGBIV spectrum (Red, Green, or Blue).");
		
			ImageUtils imgUtl = new ImageUtils();
		
	
			Color[][] firstImg = imgUtl.loadImage("src/LennaCV.png");    
		
			
			//src/LennaCV.png
			
			
			imgUtl.addImage(firstImg, "Original PIcture");
		
			
		
			Color[][] greenShade = change1(firstImg);
			
				imgUtl.addImage(greenShade, "Green Shade" );
			
			Color[][] redShade = change2(firstImg);
			
				imgUtl.addImage(redShade, "Red Shade" );
			
			Color[][] blueShade = change3(firstImg);
			
				imgUtl.addImage(blueShade, "Blue Shade" );
			
					imgUtl.display();
	}
	
			
		public static Color[][] change1(Color[][] img){    // changes to green
			Color[][] pic= ImageUtils.cloneArray(img);
			for(int a=0; a < pic.length; a++) {
				for(int b=0;b< pic[a].length; b++) {
					Color pix = img[a][b];
					int red = pix.getRed();
					int green = pix.getGreen();
					int blue = pix.getBlue();
					int red1=red-(red-4);
					
					int green1=green;
					int blue1=blue-(blue-4);
				
			pic[a][b]=new Color(red1,green1,blue1);
				
			}
				}
			return pic;
			}

		
		
		
			public static Color[][] change2(Color[][] img){    // changes to red
				Color[][] pic= ImageUtils.cloneArray(img);
				for( int a=0; a < pic.length; a++) {
					for( int b=0;b< pic[a].length; b++) {
						Color pix = img[a][b];
						int red = pix.getRed();
						int green = pix.getGreen();
						int blue = pix.getBlue();
						
						int red1=red;
						int green1=green-(green-4);
						int blue1=blue-(blue-4);
					
						pic[a] [b]=new Color(red1,green1,blue1);
					
				}
					}
				return pic;
				}

			
			
			public static Color[][] change3(Color[][] img){    // changes to blue
				Color[][] pic= ImageUtils.cloneArray(img);
				for(int a=0; a < pic.length; a++) {
					for(int b=0; b< pic[a].length; b++) {
						Color pix = img[a][b];
					int red = pix.getRed();
					int green = pix.getGreen();
					int blue = pix.getBlue();
						int red1=red-(red-4);
						int green1=green-(green-4);
						int blue1=blue;
		
						
						pic[a][b]= new Color(red1,green1,blue1);
					
				}
					}
				return pic;
				}
			
			
			
			
			
			
			
}
