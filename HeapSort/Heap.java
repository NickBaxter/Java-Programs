
public class Heap {
	private Sheep[] heap;
	private static int size;
	private int counter;
	
	//constructors
	public Heap(int aSize)
	{
		this.heap = new Sheep[aSize];
		this.size = aSize;
	}
	public Heap(Sheep[] aHeap, int aSize)
	{
		this.heap = aHeap;
		this.size = aSize;
	}
	public void addSheep(String aName, int aWeight)
	{
		//takes in the info from the driver
		Sheep newSheep = new Sheep();
		newSheep.setName(aName);
		newSheep.setWeight(aWeight);
		addSheep(newSheep);
	}
	public void addSheep(Sheep aSheep)
	{
		//adds the sheep to the last index
		if(counter >= this.size)
		{
			System.out.println("The max size of the heap has been reached");
			return;
		}
		heap[counter] = aSheep;
		climbUp();
		this.counter++;
	}
	public void climbUp()
	{
		int index = this.counter;
		while(index>0 && 
				heap[index].getWeight()<heap[(index-1)/2].getWeight())//And the value of the child is less than the parent
		{
			//SWAP
			Sheep temp = heap[(index-1)/2];
			heap[(index-1)/2] = heap[index];
			heap[index] = temp;
			index = (index-1)/2;
		}
	}
	public Sheep removeSheep()
	{	
		//removes the lightest sheep from the heap and replaces it with the last one
		Sheep retVal = heap[0];
		if(size >= 1)
		{
			heap[0] = heap[size-1];
			heap[size-1] = null;
			size--;
			//starts the climb down to make sure the lightest sheep is up top
			climbDown();
		}
		else
		{
			heap = null;
		}
		return retVal;
	}
	public void climbDown()
	{
		int index = 0;
		while(index*2+1 < size)//While there is a left child
		{
			//Find smallest sheep
			int smallIndex = index*2+1;
			if(index*2+2 < size &&
					heap[index*2+1].getWeight() > heap[index*2+2].getWeight()) //Right was bigger than left so change it
			{
				//if the right child is smaller it sets that as the smallest value
				smallIndex = index*2+2;
			}
			//if the value of the smallest value is less then the peek then it swaps em
			if(heap[index].getWeight() > heap[smallIndex].getWeight())
			{
				//Swaps the to sheep
				Sheep temp = heap[index];
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
	//returns the sorted sheap heap
	public static void sheepHeapSort(Heap aheap)
	{	
		Heap tempHeap = aheap;
		for(int i=size;i>0;i--)
		{
			//returns the peak of the temporary heap then removes it and returns another one
			System.out.println("-" + tempHeap.removeSheep().getInfo() + " ");
		}
	}
	//returns the beardth order of the heap
	public void sheepRollCall()
	{
		for(Sheep x : heap)
		{
			if(x == null)
			{
				break;
			}
			System.out.println("-" + x.getName() + " " + x.getWeight());
		}
	}
}
