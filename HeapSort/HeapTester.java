import java.util.Scanner;

public class HeapTester {

	public static void main(String[] args) {
		int size = 15;
		Heap aHeap = new Heap(size);
		System.out.println("----WELCOME TO THE SHEEP HEAP TESTER----");
		System.out.println("Adding Sheep now");
			aHeap.addSheep("Marvin", 87);
			aHeap.addSheep("Rhonda", 94);
			aHeap.addSheep("Peter", 76);
			aHeap.addSheep("Larry", 64);
			aHeap.addSheep("Maurice", 104);
			aHeap.addSheep("Giggity", 69);
			aHeap.addSheep("George", 81);
			aHeap.addSheep("Becky", 91);
			aHeap.addSheep("Richard", 52);
			aHeap.addSheep("Sheepy", 49);
			aHeap.addSheep("Fluffy", 107);
			aHeap.addSheep("Lenny", 95);
			aHeap.addSheep("Kevin", 14);
			aHeap.addSheep("Frank", 77);
			aHeap.addSheep("Nick", 86);
		System.out.println("\nRemoving the five smallest sheep.");
			aHeap.removeSheep();
			aHeap.removeSheep();
			aHeap.removeSheep();
			aHeap.removeSheep();
			aHeap.removeSheep();
		System.out.println("\nPrinting Sheap in breadth order");
			aHeap.sheepRollCall();
		System.out.println("\nSorting Sheap Now");
			Heap.sheepHeapSort(aHeap);

	}

}
