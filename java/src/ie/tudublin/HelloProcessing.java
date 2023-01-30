package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);
		
		
	}


	public void draw()
	{	
		stroke(100);
		line(10,10,100,100); // x1,y1,x2,y2

		fill(1255, 234, 0);
		circle (300,250,70); // cx, cy,d

		fill(255,192,203); //rgb
		rect(10,300,20,100); //t1x, t1y, w, h
		stroke(127);
		
		//noStroke();
		//noFill();
		//strokeWeight(1);
		fill(135,206,250);
		triangle(40,90,300,20,80,70); // the order of vertices does not matter
		// The origin is the top left corner, top to bottom as you increase you go down the screen
	}
}
