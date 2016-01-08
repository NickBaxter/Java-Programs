
public class SongSorter {
	private static Song[] heap;
	private static int tempCounter = 0;
	
	public static Song[] sortByDuration(Song[] unsortedSongs)
	{		
		int counter = unsortedSongs.length;
		Song[] heap = new Song[unsortedSongs.length];
		while(counter >= 0)
		{
				heap[tempCounter] = unsortedSongs[0];
				if(tempCounter > 0)
				{
					climbDown();
				}
				System.out.println(tempCounter);
				tempCounter++;
				unsortedSongs[0] = unsortedSongs[counter-1];
				unsortedSongs[counter-1] = null;
				counter--;
		}
		return heap;
	}
	public static void climbDown()
	{
		int index = 0;
		while(index*2+1 < tempCounter)//While there is a left child
		{
			//Find smallest sheep
			int smallIndex = index*2+1;
			if(index*2+2 < tempCounter &&
					heap[index*2+1].getSecs() > heap[index*2+2].getSecs()) //Right was bigger than left so change it
			{
				//if the right child is smaller it sets that as the smallest value
				smallIndex = index*2+2;

			}
			//if the value of the smallest value is less then the peek then it swaps em
			System.out.println(heap[0].getSecs());
			if(heap[0].getSecs() > heap[1].getSecs())
			{
				//Swaps the to sheep
				Song temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;
			}
			else
			{
				break;
			}
			index = smallIndex;//Update the index to continue
		}
	}
}