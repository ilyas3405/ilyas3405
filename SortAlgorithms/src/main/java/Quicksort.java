import java.util.Random;

/**
 * 
 * @author P2947816 In the quick sort we will first have a sample array to sort
 *         on. Start with 7 random number as below: {1 8 3 9 4 5 7} Step1: Lets
 *         take an element as pivot. It can be any number, first, last, random
 *         or median in our example we take a last element as pivot which is
 *         number 7 Step2 Once we have the pivot number, lets take all elements
 *         lower than the pivot in left array and all elements higher then the
 *         pivot in right array. (this is also called Partitioning) This means
 *         we will have two new arrays leftarray[] = {5,4,3,1} 7 rightarray[] =
 *         {8,9} The pivot number stays between the above two arrays Step3:
 *         Recursively repeat the above method to further sort the leftarray and
 *         the rightarray individually In the leftarray, now we have 1 as pivot
 *         therefore, leftarray = {} rightarray = 1 {5,4,3}
 * 
 *         Step3 is partitioning
 * 
 *         QuickSort is a Divide and Conquer algorithm
 */
public class Quicksort {

	public static void main(String[] args) {
		Random rand = new Random();
	 
		int[] numbers = new int[100];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10000);
		}

		System.out.println("Before sorting");
		printArray(numbers);

		quicksort(numbers);

		System.out.println("\nAfter sorting");
		printArray(numbers);

	}


	private static void quicksort(int[] numbers) {
		quicksort(numbers, 0, numbers.length - 1);
	}
	

	private static void quicksort(int[] array, int lowIndex, int highIndex) {
		// TODO Auto-generated method stub
		if (lowIndex >= highIndex) {
			return;
		}

		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			swap(array, leftPointer, rightPointer);
		}
		swap(array, leftPointer, highIndex);
	//	System.out.println("\nAfter partitioning");
	//	printArray(array);
		quicksort(array, lowIndex, leftPointer - 1);
		quicksort(array, leftPointer + 1, highIndex);
	}

 
	private static void swap(int[] array, int leftPointer, int rightPointer) {
		// TODO Auto-generated method stub
		int tempIntLeft = array[leftPointer];
		array[leftPointer] = array[rightPointer];
		array[rightPointer] = tempIntLeft;
	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
