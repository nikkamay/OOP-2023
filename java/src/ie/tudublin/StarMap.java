package ie.tudublin;

import processing.core.PApplet;

public class StarMap extends PApplet
{
	public void settings()
	{
		size(800, 800);
	}

	public void setup() {
		colorMode(RGB);
		background(0);

		smooth();
		
	}

	public void drawGrid()
	{
		float border = 50;
		fill(255,0,255);
		stroke(255,0,255);
		textAlign(CENTER, CENTER);
		for(float x = -5 ; x <=5; x ++)
		{
			float lx = map(x, -5, 5, border, width - border);
			line(lx, border, lx, height - border);
			text((int) x, lx, 10);


		}

		for(float y = -5 ; y <=5; y ++)
		{
		  float ly = map(y, -5, 5, border, height - border);
		  line(border, ly, width - border, ly);
		  text((int) y, 10, ly);
		}
	}
		
	

	public void draw()
	{	
		background(0);
		strokeWeight(2);	
		drawGrid();	
	}
}