
package com.java2novice.algos;
public class MyBinarySearch {
	public int binarySearch(int[] inputArr, int key) {
		
        int star = 0;
        int end = inputArr.length - 1;
        while (star <= end) {
            int mid = (star + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
            	end = mid - 1;
            } else {
            	star = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    	MyBinarySearch mbs = new MyBinarySearch();
    	int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
    	System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
    	int[] arr1 = {6,34,78,123,432,900};
    	System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
    }
}
