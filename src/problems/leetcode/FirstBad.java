package problems.leetcode;

import java.util.HashMap;
import java.util.Map;

// Problem 278
public class FirstBad {
    static Map<Integer, Boolean> m = new HashMap<>();

    public static void main(String[] args) {
	m.put(1, false);
	m.put(2, false);
	m.put(3, true);
	m.put(4, true);
	m.put(5, true);
	m.put(6, true);
	FirstBad cl = new FirstBad();
	System.out.println(cl.firstBadVersion(6));
    }

    public int firstBadVersion(int n) {
	int l = 1, r = n;
	while (l < r) {
	    int mid = l + (r - l) / 2;
	    if (isBadVersion(mid)) {
		r = mid;
	    } else
		l = mid + 1;
	}
	return l;
    }

    boolean isBadVersion(int version) {
	return m.get(version);
    }
}
