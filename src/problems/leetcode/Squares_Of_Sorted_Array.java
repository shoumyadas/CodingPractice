package problems.leetcode;

import java.util.Arrays;

// Problem 977
public class Squares_Of_Sorted_Array {
    public static void main(String[] args) {
	Squares_Of_Sorted_Array cl = new Squares_Of_Sorted_Array();
	int[] nums = { -3, 0, 1 };
	System.out.println(Arrays.toString(cl.sortedSquares(nums)));
	System.out.println(Arrays.toString(cl.sortedSquares1(nums)));
    }

    // Impl1 - Brute force
    public int[] sortedSquares(int[] nums) {
	int[] res = new int[nums.length];
	for (int i = 0; i < nums.length; i++) {
	    res[i] = nums[i] * nums[i];
	}
	Arrays.sort(res);
	return res;
    }

    // Impl2 - 2 pointer
    public int[] sortedSquares1(int[] nums) {
	int[] res = new int[nums.length];
	int n = 0, p = nums.length - 1;
	for (int i = nums.length - 1; i >= 0; i--) {
	    if (nums[p] <= Math.abs(nums[n])) {
		res[i] = nums[n] * nums[n];
		n++;
	    } else if (nums[p] > Math.abs(nums[n])) {
		res[i] = nums[p] * nums[p];
		p--;
	    }
	}
	return res;
    }
}
