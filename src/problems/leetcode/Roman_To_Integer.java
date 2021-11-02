package problems.leetcode;

import java.util.HashMap;
import java.util.Map;

// Problem 13
public class Roman_To_Integer {
    public static void main(String[] args) {
	Roman_To_Integer cl = new Roman_To_Integer();
	String s = "IX";
	System.out.println(cl.romanToInt(s));
    }

    // Basic O(n)
    public int romanToInt(String s) {
	int num = 0;
	Map<Character, Integer> m = new HashMap<>();
	m.put('I', 1);
	m.put('V', 5);
	m.put('X', 10);
	m.put('L', 50);
	m.put('C', 100);
	m.put('D', 500);
	m.put('M', 1000);
	for (int i = 0; i < s.length(); i++) {
	    int v = m.get(s.charAt(i));
	    if (i + 1 < s.length()) {
		int v1 = m.get(s.charAt(i + 1));
		if (v >= v1) {
		    num += v;
		} else {
		    num += v1 - v;
		    i++;
		}
	    } else
		num += v;

	}
	return num;
    }
}
