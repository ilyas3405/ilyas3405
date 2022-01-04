import java.util.Random;

/*
 * Mergesort - also known as Divide and Conquor 
 * step1 - divide the array from center
 * step2 - Call the left side recursevely
 * 	call the right array recursevely
 * continue to call till there is only one element in the array
 * step3 - compare and merge, small comes on the left and large number come on right
 */
public class Mergesort {

	static int stepNumber = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int numberOfElements = 11;
		int[] numbers = new int[numberOfElements];

		for (int x = 0; x < numberOfElements; x++) {
			numbers[x] = random.nextInt(25);
		}
		System.out.println("Print full array before sorting " + stepNumber++);
		printArray(numbers);

		mergeSort(numbers);

		 System.out.println("\nPrint arrays after sorting");
		 printArray(numbers);

	}

	private static void mergeSort(int[] numbers) {
		// TODO Auto-generated method stub
		int arrayLength = numbers.length;
		if (arrayLength < 2)
			return;

		int midIndex = arrayLength / 2;
		int leftHalf[] = new int[midIndex];
		int rightHalf[] = new int[arrayLength - midIndex];

		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = numbers[i];
		}
		System.out.println("\n Printing the left half array " + stepNumber++);
		printArray(leftHalf);

		for (int i = 0; i < arrayLength - midIndex; i++) {
			rightHalf[i] = numbers[i + midIndex];
		}
		System.out.println("\n Printing the right half array " + stepNumber++);
		printArray(rightHalf);

		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(numbers, leftHalf, rightHalf);
	}

	private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
		int leftHalfLength = leftHalf.length;
		int rightHalfLength = rightHalf.length;

		int i = 0; // leftHalf iteration
		int j = 0; // rigtHalf iteration
		int k = 0; // merge array iteration
		while (i < leftHalfLength && j < rightHalfLength) {
			if (leftHalf[i] <= rightHalf[j]) {
				numbers[k] = leftHalf[i];
				i++;
			} else {
				numbers[k] = rightHalf[j];

				j++;
			}
			k++;

		}
		while (i < leftHalfLength) {
			numbers[k] = leftHalf[i];
			k++;
			i++;
		}

		while (j < rightHalfLength) {
			numbers[k] = rightHalf[j];
			k++;
			j++;
		}

	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}

}
