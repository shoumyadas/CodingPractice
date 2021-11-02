package problems.leetcode;

// Problem 704
public class Binary_Search {
    public static void main(String[] args) {
	Binary_Search cl = new Binary_Search();
	int[] nums = { -1, 0, 3, 5, 9, 12 };
	int target = 9;
	System.out.println(cl.search(nums, target));

    }

    public int search(int[] nums, int target) {
	int size = nums.length;
	int l = 0, h = size - 1;
	while (l <= h) {
	    int mid = l + (h - l) / 2;
	    if (nums[mid] == target)
		return mid;
	    else if (nums[mid] > target)
		h = mid - 1;
	    else if (nums[mid] < target)
		l = mid + 1;
	}
	return -1;

    }
}
