package problems.leetcode;

import java.util.Arrays;

// Problem 167
public class Two_Sum2 {
    public static void main(String[] args) {
	Two_Sum2 ts = new Two_Sum2();
	int[] nums = { 2, 7, 11, 15 };
	int target = 9;
	System.out.println(Arrays.toString(ts.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
	int p1 = 0, p2 = nums.length - 1;
	while (p1 < p2) {
	    int needed = target - nums[p1];
	    if (needed == nums[p2])
		return new int[] { p1 + 1, p2 + 1 };
	    else if (needed < nums[p2])
		p2--;
	    else
		p1++;
	}
	return null;
    }

}
