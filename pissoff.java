// Lab17bvst.java
// The student, starting version of the Lab17b assignment.


import java.awt.*;
import java.applet.*;


public class Lab17bvst extends Applet
{

	public void paint (Graphics g)
	{
		drawSquare1( g , 1000, 650);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int midX = maxX/2;
		int midY = maxY/2;
		int startWidth = maxX/4;
		int startHeight = maxY/4;
		int tlX = midX - (startWidth/2);
		int tlY = midY - (startHeight/2);
		g.fillRect(tlX,tlY,startWidth,startHeight);
		drawNorthWest(g, tlX,tlY,startWidth,startHeight);
	}

	public void delay(long n)
	{
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n )
			endDelay = System.nanoTime();
	}
	
	public void drawNorthWest(Graphics g, int x, int y, int w, int h) {
		g.fillRect( x , y , w , h );
		drawNorthWest( g , x - w / 2 , y - h / 2 , w / 2 , h / 2 );
	}
	public void drawSouthWest(Graphics g, int x, int y, int w, int h) {
		
	}
	public void drawSouthEast(Graphics g, int x, int y, int w, int h) {
		
	}

}


