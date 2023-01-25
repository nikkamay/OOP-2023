package ie.tudublin;

public class Cat
{
	String name;
    private int numLives = 9;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Cat()
	{
	}
	
	public Cat(String name)
	{
	}
	
	public void speak()
	{
		System.out.println("Meow");
	}

    public void kill()
    {
        
        numLives -= 1;

        if (numLives > 0)
        {
            System.out.println("Ouch");
        }
        else if(numLives == 0)
        {
            System.out.println("Dead");
        }
    }
}