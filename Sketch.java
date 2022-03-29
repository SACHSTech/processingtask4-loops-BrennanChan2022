import processing.core.PApplet;

  /**
  * A program Sketch.java that uses loop patterns to draw sequences of object, split up into 4 evenly-sized quadrants. It draws a 10 x 10 grid, a 5 x grid of evenly spaced circles, a horizontal grayscale gradient, and an 8 petal flower.
  * @author: B. Chan
  */

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // Size call
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // White background
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    float variableX = 0;
    
    // Quadrant 1, 10 x 10 Grid
    stroke(0);
    for (int x = 0; x < width/2; x += width/2/10){
      line(x, 0, x, height/2);
    }
    for (int lineY = 0; lineY < height/2; lineY += height/2/10){
      line(0, lineY, width/2, lineY);
    }
    
    // Quadrant 2, 5 x grid of evenly spaced circles
    for (int circleX = width/2 + width/16; circleX < (width - width/16); circleX += width/10.6){
      for (int circleY = width/16; circleY < (width/2 - width/16); circleY += width/10.6){
        fill(189, 55, 99);
        ellipse(circleX, circleY, height/16, height/16);
      }
    }
    
    // Quadrant 3, horizontal grayscale gradient
    for (int grayscale = 0; grayscale != 255; grayscale++){
      stroke(grayscale, grayscale, grayscale);
      strokeWeight(2);
      variableX += (float)(width/2) / 255;
      if (variableX < width/2){
        line(variableX, height/2, variableX, height);
      }
    }
    
    // Quadrant 4, 8 petal flower
    // Flower Petals
    stroke(0);
    translate(width/2 + width /4, height/2 + height/4);
    for (int petal = 0; petal != 8; petal++) {
      rotate(radians(45));
      fill(204, 75, 24);
      ellipse(0, 0, width/20, height/2.5f);  
    }
    
    // Flower Center
    noStroke();
    fill(45, 99, 46);
    ellipse(0, 0, width/8.5f, height/8.5f);
    
  }

}