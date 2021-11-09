package problems.leetcode;

import java.util.Arrays;

// Problem 283
public class Move_Zeroes {

    public static void main(String[] args) {
	Move_Zeroes cl = new Move_Zeroes();
	int[] nums = { -3, 0, 1, 0, 5 };
	cl.moveZeroes1(nums);
	System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
	int j = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 0)
		nums[j++] = nums[i];
	}
	while (j < nums.length) {
	    nums[j++] = 0;
	}
    }

    public void moveZeroes1(int[] nums) {
	int j = 0, tmp;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 0) {
		tmp = nums[j];
		nums[j] = nums[i];
		nums[i] = tmp;
		j++;
	    }
	}
    }
}
