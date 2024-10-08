
public class critter {
	private String name;
	private String mood;
	
	public critter()
	{
		name="";
	}
	
	public critter(String printName, String printMood)
	{
		name=printName;
		mood=printMood;
	}
	
	
	public String toString()
	{
		return name;
	}

}
