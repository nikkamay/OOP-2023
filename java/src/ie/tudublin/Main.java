package ie.tudublin;

public class Main
{


	public static void BugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

	public static void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }
	
	 public static void main(String[] args)
	 {
		
		BugZap();
	 }
	
}