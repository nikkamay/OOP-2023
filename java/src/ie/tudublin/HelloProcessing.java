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
		background(255,0,0);
		
		
	}


	public void draw()
	{	
		


		fill(255,233,0);
		circle(250,250,400); // cx, cy,d
		
		noStroke();
		//noFill();
		//strokeWeight(1);
		fill(135,206,250);
		triangle(0,400,500,400,255,0); // the order of vertices does not matter

		fill(255,255,255);
		ellipse(250, 250, 250, 100);

		fill(0,0,0);
		ellipse(250, 250, 50, 50);
		//ellipse(ALPHA, AMBIENT, ARC, ADD);
		// The origin is the top left corner, top to bottom as you increase you go down the screen
		//background(0);
		//circle(mouseX, mouseY, 100);
		//fill(mouseX,0,mouseY);
		//circle(mouseX, mouseY, mouseY);
		
	}

}
