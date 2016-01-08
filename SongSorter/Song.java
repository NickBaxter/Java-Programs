
public class Song {
	//instance variables
	private String name;
	private String artist;
	private int secs;
	//constructors
	public Song()
	{
		this.name = "no name";
		this.artist = "no artist";
		this.secs = 0;
	}
	public Song(String aName, String anArtist, int aSecs)
	{
		this.name = aName;
		this.artist = anArtist;
		this.secs = aSecs;
	}
	//accessors and mutators
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getSecs() {
		return secs;
	}
	public void setSecs(int secs) {
		if(secs > 0)
			this.secs = secs;
	}
	//other methods
	public String toString()
	{
		String string = (this.name + ", " + this.artist + ", " + this.secs);
		return string;
	}
	
	

}
