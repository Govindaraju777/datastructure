package com.friends.sorting;

/*
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
 * There are many different versions of quickSort that pick pivot in different ways.
 * 
 * Always pick first element as pivot.
	Always pick last element as pivot (implemented below)
	Pick a random element as pivot.
	Pick median as pivot.
	
	https://www.geeksforgeeks.org/quick-sort/
	
 */
public class QuickSort {

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be
	 * sorted, low --> Starting index, high --> Ending index
	 */
	static void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	/*
	 * This function takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places all smaller (smaller
	 * than pivot) to left of pivot and all greater elements to right of pivot
	 */
	static int partition(int arr[], int low, int high) {
		
		int pivot = arr[high]; // Selecting last element as PIVOT
		
		int i = (low - 1); // index of smaller element. // Initially i=0-1 = -1
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };

		sort(arr, 0, arr.length - 1);

		System.out.println("sorted array");
		printArray(arr);
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
