package ie.tudublin;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		Dog penny = new Dog();
		penny.setName("Penny");
		penny.speak();

		Cat ginger = new Cat();
		ginger.setName("Ginger");
		ginger.kill();

		for(int i = 0; i < 10; i++)
		{
			ginger.kill();
		}
	}
	
	
}