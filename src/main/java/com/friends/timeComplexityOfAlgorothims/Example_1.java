package com.friends.timeComplexityOfAlgorothims;

/* 
 * Time Complexity measures the time taken for running an algorithm 
 * and it is commonly used to count the number of elementary operations performed by the algorithm to improve the performance.
 */

/*
 * 
 	Lets understand the Big O Notation thoroughly by taking the java examples on common orders of growth like,
	O(1) – Constant
	O(log n) – Logarithmic
	O(n log n) – n log n
	O(n) – Linear
	O(n2) – Quadratic
	O(2n) – exponential
 */

public class Example_1 {

	static int y = 3;
	static int z = 5;

	public static void main(String[] args) {
		//1
		//Constant();
		
		//2 O(log n)
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
        
        //
        
    } 
		
	/*
	 * 1. O(1) The O(1) is also called as constant time, it will always execute
	 * in the same time regardless of the input size. For example if the input
	 * array could be 1 item or 100 items, but this method required only one
	 * step.
	 * 
	 * Note:O(1) is best Time Complexity method.
	 * 
	 */
	public static void Constant() {
		int x = y + z; // O(1) complexity
		System.out.println(x);
	}

	/*
	 * 		In O(log n) function the complexity increases as the size of input
	 * increases. It scale up very well i.e increases the number of steps to
	 * handle large size of inputs. 
	 * 		
	 * 	For example in the Binary search program it
	 * uses divide and conquer technique (breaking down a problem into two or
	 * more sub-problems of the same type, until it become simple to be solved
	 * directly) for searching elements in large sized array.
	 * 
	 * 	Note: In O(log n) number of steps increases as the Size of elements increases.
	 * 
	 * Here the repetation is n/2, n/4/ , n/8 .. 
	 * 	i.e n/2^x
	 * 	can be represetnted as log(n)
	 * 
	 */
	public static int binarySearch(int arr[], int l, int r, int item) {
		 if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (arr[mid] == item) 
	                return mid; 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (arr[mid] > item) 
	                return binarySearch(arr, l, mid - 1, item); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(arr, mid + 1, r, item); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1; 
	    } 
}
