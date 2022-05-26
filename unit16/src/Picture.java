import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import java.awt.Color;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      pixelObj.setRed(0);
	      pixelObj.setGreen(0);
	    }
	  }	  
  }
  
  public void keepOnlyRed() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      pixelObj.setBlue(0);
	      pixelObj.setGreen(0);
	    }
	  }	  
  }
  
  public void keepOnlyGreen() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      pixelObj.setRed(0);
	      pixelObj.setBlue(0);
	    }
	  }	  
  }
  
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      pixelObj.setRed(255-pixelObj.getRed());
	      pixelObj.setBlue(255-pixelObj.getBlue());
	      pixelObj.setGreen(255-pixelObj.getGreen());
	    }
	  }	  
  }
  
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      int average = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed())/3;
	      pixelObj.setBlue(average);
	      pixelObj.setGreen(average);
	      pixelObj.setRed(average);
	    }
	  }	  
  }
  
  public void fixUnderwater() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      if (pixelObj.getBlue()>pixelObj.getGreen()) {
	    	  int average = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed())/3;
		      //pixelObj.setBlue(average);
		      //pixelObj.setGreen(230);
		      pixelObj.setRed(average);
	      }
	      /*else {
	    	  pixelObj.setGreen(10);
		      pixelObj.setRed(30);
	      }*/
	    }
	  }	  
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
   
  public void mirrorVerticalRightToLeft() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  for (int row = 0; row < pixels.length; row++)
	  {
	    for (int col = 0; col < width / 2; col++)
	    {
	      leftPixel = pixels[row][col];
	      rightPixel = pixels[row][width - 1 - col];
	      leftPixel.setColor(rightPixel.getColor());
	    }
	  } 
  }
  
  public void mirrorHorizontal() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  for (int row = 0; row < height / 2; row++)
	  {
	    for (int col = 0; col < pixels[row].length; col++)
	    {
	    	topPixel = pixels[row][col];
	    	bottomPixel = pixels[height - 1 - row][col];
	    	bottomPixel.setColor(topPixel.getColor());
	    }
	  } 
  }
  
  public void mirrorHorizonalBotToTop() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  for (int row = 0; row < height / 2; row++)
	  {
	    for (int col = 0; col < pixels[row].length; col++)
	    {
	    	topPixel = pixels[row][col];
	    	bottomPixel = pixels[height - 1 - row][col];
	    	topPixel.setColor(bottomPixel.getColor());
	    }
	  } 
  }
  
  public void mirrorDiagonal() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  for (int row = 0; row < pixels.length; row++)
	  {
	    for (int col = 0; col < row; col++)
	    {
	    	bottomPixel = pixels[row][col];
	    	topPixel = pixels[col][row];
		    topPixel.setColor(bottomPixel.getColor());
	    }
	  } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    //System.out.println(count);
  }
  
  public void mirrorArms()
  {
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    //int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows on the left
    for (int row = 173; row < 197; row++)
    {
      for (int col = 240; col < 300; col++)
      {
        //place the gotten pixel a few units down from where it was
    	  // change the row but not the column and keep the gotten color 
    	  
    	topPixel = pixels[row][col];      
    	bottomPixel = pixels[row+23][col];
    	bottomPixel.setColor(topPixel.getColor());
        //count++;
      }
    }
    
    for (int row = 161; row < 190; row++) {
    	for (int col = 105; col < 167; col++) {
    		topPixel = pixels[row][col];      
        	bottomPixel = pixels[row+28][col+4];
        	bottomPixel.setColor(topPixel.getColor());
    	}
    }
    //System.out.println(count);
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 233;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    //int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 236; row < 347; row++)
    {
      for (int col = 236; col < mirrorPoint + (mirrorPoint - 114); col++)
      {
    	 // how to make water difference less apparant? 
    	topPixel = pixels[row][col];      
    	bottomPixel = pixels[row-11]                       
                         [mirrorPoint - col  + 10 + mirrorPoint];
    	bottomPixel.setColor(topPixel.getColor());
        //count++;
      }
    }
    //System.out.println(count);
  }

  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\Users\\kbei5\\Desktop\\apcsa\\Bei_Karen_apcsa-2022\\unit16\\src\\images\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\kbei5\\Desktop\\apcsa\\Bei_Karen_apcsa-2022\\unit16\\src\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\Users\\kbei5\\Desktop\\apcsa\\Bei_Karen_apcsa-2022\\unit16\\src\\images\\collage.jpg");
  }
  
  public void copy(Picture fromPic, int startRow, int startCol, int endRow, int endCol)
  {
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = 0, toRow = startRow; 
	  fromRow < fromPixels.length &&
	  toRow < endRow; 
	  fromRow++, toRow++)
	{
		for (int fromCol = 0, toCol = startCol; 
		    fromCol < fromPixels[0].length &&
		    toCol < endCol;  
		    fromCol++, toCol++)
		{
		 fromPixel = fromPixels[fromRow][fromCol];
		 toPixel = toPixels[toRow][toCol];
		 toPixel.setColor(fromPixel.getColor());
		}
	}   
  }
  
  public void myCollage()
  {
    Picture flower1 = new Picture("C:\\Users\\kbei5\\Desktop\\apcsa\\Bei_Karen_apcsa-2022\\unit16\\src\\images\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\kbei5\\Desktop\\apcsa\\Bei_Karen_apcsa-2022\\unit16\\src\\images\\flower2.jpg");
    Picture f1 = new Picture(flower1);
    f1.grayscale();
    this.copy(f1,0,0);
    Picture f3 = new Picture(flower1);
    f3.mirrorHorizonalBotToTop();
    this.copy(f3,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    flowerNoBlue.mirrorDiagonal();
    this.copy(flowerNoBlue,300,0);
    Picture f2 = new Picture(flower2);
    f2.keepOnlyBlue();
    this.copy(f2,400,0);
    this.mirrorVertical();
    this.write("C:\\Users\\kbei5\\Desktop\\apcsa\\Bei_Karen_apcsa-2022\\unit16\\src\\images\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel lowerPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    Color lowerColor = null;
   
    
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        lowerPixel = pixels[row + 1][col];
        rightColor = rightPixel.getColor();
        lowerColor = lowerPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist || leftPixel.colorDistance(lowerColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
//    for (int row = 0; row < pixels.length - 1; row++)
//    {
//      for (int col = 0; 
//           col < pixels[0].length; col++)
//      {
//        topPixel = pixels[row][col];
//        bottomPixel = pixels[row+1][col];
//        bottomColor = bottomPixel.getColor();
//        if (topPixel.colorDistance(bottomColor) > 
//            edgeDist)
//          topPixel.setColor(Color.black);
//        else
//          topPixel.setColor(Color.white);
//      }
//    }
  }
  
  /* The encode algorithm sums all the digits of the blue RGB value and if the sum is divisible by 2. 
   * If the pixel on the secret image is black and the sum isn't divisible by 2, then 1 is added to the ones digit until it is. 
   * All the white pixels should have blue RGB digit sums that are odd, so add 1 to the background image ones digit until odd. 
   * To decode, the algorithm iterates through all the pixels to check if the digit sum is divisible by 2. 
   * If so, the pixel is set to black; otherwise, it becomes white. */
  public void encode(Picture secretPic) {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel[][] secretPixels = secretPic.getPixels2D();
	  for (int i = 0; i < pixels.length; i++) {
		  for (int j = 0; j < pixels[i].length; j++) {
			  // secret pixels are white 
			 if (secretPixels[i][j].getBlue() >= 230 && secretPixels[i][j].getRed() >= 230 && secretPixels[i][j].getGreen() >= 230) {
				// digit sum is even but should be odd
				while (((pixels[i][j].getBlue() / 100 + (pixels[i][j].getBlue() / 10) % 10 + pixels[i][j].getBlue() % 10) % 2) == 0) {
					// add one to make it even
					//System.out.println("not black " + i + " " + j);
					// subtract one if it goes past 255 bc creates infinite loop
					if (pixels[i][j].getBlue() == 255) {
						pixels[i][j].setBlue(pixels[i][j].getBlue() - 1);
					}
					else {
						pixels[i][j].setBlue(pixels[i][j].getBlue() + 1);
					}
				}	
			 }		  
			 else  { // secretPixels aren't white
				// digit sum is odd
				while (((pixels[i][j].getBlue() / 100 + (pixels[i][j].getBlue() / 10) % 10 + pixels[i][j].getBlue() % 10) % 2) != 0) {
					// add one to make it even
					// don't have 255 problem because digits sum to 12 so won't even enter loop
					//System.out.println("black " + i + " " + j);
					pixels[i][j].setBlue(pixels[i][j].getBlue() + 1);
				}
			 } 
		  } // end j loop
	  } // end i loop
  } // end method
  
  public Picture decode() {
	  Pixel[][] pixels = this.getPixels2D();
	  Picture messagePicture = new Picture(this.getHeight(), this.getWidth());
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  
	  for (int i = 0; i < pixels.length; i++) {
		  for (int j = 0; j < pixels[i].length; j++) {
			  // have odd digit sum -> should be white
			  if ((pixels[i][j].getBlue() / 100 + pixels[i][j].getBlue() / 10 % 10 + pixels[i][j].getBlue() % 10) % 2 != 0) {
				  messagePixels[i][j].setColor(Color.white);
			  }
			  else { // digit sum is even -> should be black
				  messagePixels[i][j].setColor(Color.black);
			  }
		  }
	  }
	  
	  return messagePicture;
	  
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    //beach.zeroBlue();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
