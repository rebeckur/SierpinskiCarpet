int col;

public void setup()
{
	size(790, 790);
	col = color(131, 126, 177);
}
public void draw()
{
	background(0);
	sierpinski(20, 20, 750);
}
public void mousePressed()
{
	col*=15;
}
public void sierpinski(int x, int y, int len)
{
	if (len <= 9)
	{
		fill(col);
		stroke(col);
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