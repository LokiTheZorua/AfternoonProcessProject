package prosses.model;

public class PlayDohRoll
{
	private int mass;
	
	public PlayDohRoll()
	{
		this.mass = 10;
		
	}
	
	public PlayDohRoll(int mass)
	{
		this.mass = mass;
	}
	public String toString()
	{
		String description = "I am a roll, my size is " + mass;
		return description;
	}
}
