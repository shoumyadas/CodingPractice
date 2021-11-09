package problems.leetcode;

import java.util.Arrays;

// Problem 344
public class Reverse_String {

    public static void main(String[] args) {
	Reverse_String ob = new Reverse_String();
	char[] s = { 'h', 'e', 'l', 'l', 'o' };
	ob.reverseString(s);
	System.out.println(Arrays.toString(s));

    }

    public void reverseString(char[] s) {
	int p1 = 0, p2 = s.length - 1;
	while (p1 < p2) {
	    char tmp = s[p1];
	    s[p1] = s[p2];
	    s[p2] = tmp;
	    p1++;
	    p2--;
	}
    }
}
