/**
 * 
 */
package com.gs.smi;

/**
 * @author govind
 * 
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] array = new int[] { 1 };
		int index = binarySearch(array, 1, 0, array.length - 1);
		System.out.println(array[index]);
	}

	/**
	 * @param array
	 * @param key
	 * @param low
	 * @param high
	 * @return
	 */
	private static int binarySearch(int[] array, int key, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (array[mid] == key) {
			return mid;
		} else if (array[mid] < key) {
			return binarySearch(array, key, mid + 1, high);
		} else {
			return binarySearch(array, key, low, mid - 1);
		}
	}
}
