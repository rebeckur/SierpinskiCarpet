import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiCarpet extends PApplet {

public void setup()
{
	size(950, 950);
}
public void draw()
{
	background(0);
	sierpinski(10, 10, 600);
}
public void sierpinski(int x, int y, int len)
{
	if (len <= 9)
	{
		fill(131, 126, 177);
		noStroke();
		rect(x, y, len, len);
	}
	else
	{
		sierpinski(x, y, len/3); //top left
		sierpinski(x, y+len/3, len/3); //middle left
		sierpinski(x, y+(2*len)/3, len/3); //bottom left
		sierpinski(x+len/3, y, len/3); //top center
		sierpinski(x+len/3, y+(2*len)/3, len/3); //bottom center
		sierpinski(x+(2*len)/3, y, len/3); //top right
		sierpinski(x+(2*len)/3, y+len/3, len/3); //middle right
		sierpinski(x+(2*len)/3, y+(2*len)/3, len/3); //bottom right
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiCarpet" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
