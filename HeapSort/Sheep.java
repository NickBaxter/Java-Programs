
public class Sheep {
	private String name;
	private int weight;
	public Sheep()
	{
		this.name = "no name";
		this.weight = 0;
	}
	public Sheep(String aName, int aWeight)
	{
		this.name = aName;
		this.weight = aWeight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getInfo()
	{
		return getName() + " " + getWeight();
	}
	
}
