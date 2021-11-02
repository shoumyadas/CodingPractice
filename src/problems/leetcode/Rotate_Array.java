package problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Problem 189
public class Rotate_Array {
    public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
	    int testCases = s.nextInt();
	    List<int[]> resultList = new ArrayList<>();
	    for (int i = 0; i < testCases; i++) {
		int size = s.nextInt();
		int rotations = s.nextInt();
		int[] arr = new int[size];
		for (int j = 0; j < size; j++)
		    arr[j] = s.nextInt();
		// System.out.println(Arrays.toString(arr));
		// Impl1 -- by moving elems by 1
		/*
		 * for (int r = 0; r < rotations % size; r++) { int last = arr[size - 1]; for
		 * (int j = size - 1; j > 0; j--) arr[j] = arr[j - 1]; arr[0] = last; }
		 * resultList.add(arr);
		 */

		// Impl2 -- aux array (leetcode 0ms mem - 56 mb accepted)
		int[] tmp = Arrays.copyOf(arr, size * 2);
		System.arraycopy(arr.clone(), 0, tmp, size, size);
		System.arraycopy(tmp, size - (rotations % size), arr, 0, size);
		resultList.add(arr);

	    }
	    // System.out.println(Arrays.deepToString(resultList.toArray()));
	    resultList.forEach(a -> {
		for (int i = 0; i < a.length; i++)
		    System.out.print(a[i] + " ");
		System.out.println();
	    });
	}
    }
}
