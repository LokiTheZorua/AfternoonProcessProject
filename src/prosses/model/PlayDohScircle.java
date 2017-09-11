package prosses.model;

public class PlayDohScircle
{
	//Decloration Section
	//Data member section
	private int size;
	
		public PlayDohScircle()
		{
			this.size = 5;
		}
		
		public PlayDohScircle (int size)
		{
			this.size = size;
		}
		
		public String toString()
		{
			String description = "I am a circle, my se is " + size;
			return description;
		}
}