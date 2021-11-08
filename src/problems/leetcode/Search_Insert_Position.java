package problems.leetcode;

// Problem 35
public class Search_Insert_Position {
    public static void main(String[] args) {
	Search_Insert_Position cl = new Search_Insert_Position();
	int[] nums = { -1, 3, 5, 6 };
	int target = 8;
	System.out.println(cl.searchInsert(nums, target));

    }

    public int searchInsert(int[] nums, int target) {
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
	return l;
    }
}
