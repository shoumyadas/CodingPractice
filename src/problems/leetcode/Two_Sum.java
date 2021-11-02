package problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Problem 1
public class Two_Sum {
    public static void main(String[] args) {
	Two_Sum ts = new Two_Sum();
	int[] nums = { 2, 7, 11, 15 };
	int target = 9;
	System.out.println(Arrays.toString(ts.twoSum2(nums, target)));
    }

    // Brute force approach O(n2)
    public int[] twoSum1(int[] nums, int target) {
	for (int i = 0; i < nums.length; i++)
	    for (int j = i + 1; j < nums.length; j++)
		if ((nums[i] + nums[j] == target))
		    return new int[] { i, j };
	return null;
    }
    // Using hash table O(n)
    public int[] twoSum2(int[] nums, int target) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 0; i < nums.length; i++) {
	    int n2 = target - nums[i];
	    if (map.containsKey(n2) && map.get(n2) != i)
		return new int[] { i, map.get(n2) };
	    map.put(nums[i], i);
	}
	return null;
    }

}
