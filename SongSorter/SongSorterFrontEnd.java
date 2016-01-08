/**
 * 
 * @author JJ Shepherd
 *
 */
public class SongSorterFrontEnd {
	public static void main(String[] args)
	{
		Song[] songs = {new Song("Dog Police","Dog Police",176),
						new Song("Gimme Dat Nut","EAZY-E",199),
						new Song("I Ran","Flock of Seagulls",313),
						new Song("Rock N' Roll McDonalds","Wesley Willis",149),
						new Song("Spanish Flea","Herb Alpert",126),
						new Song("Number of the Beast","Iron Maiden",291),
						new Song("The Jim Carroll Band","People Who Died",218),
						new Song("Curtis Mayfield","Move on Up",528),
						new Song("Pegboard Nerds","Hero",331)};
		System.out.println("Unsorted song collection");
		for(Song song : songs)
		{
			System.out.println(song.toString());
		}
		
		Song[] sortedSongs = SongSorter.sortByDuration(songs);
		System.out.println("\n\n\nSorted Song Collection by duration");
		for(Song song : sortedSongs)
		{
			System.out.println(song.toString());
		}
	}
}
