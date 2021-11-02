package problems.leetcode;

// Problem 9
public class Palimdrome_Number {
    public static void main(String[] args) {
	Palimdrome_Number cl = new Palimdrome_Number();
	int x = 12121;
	System.out.println(cl.isPalindrome2(x));

    }

    // Basic
    public boolean isPalindrome1(int x) {
	if (x < 0 || (x % 10 == 0 && x != 0))
	    return false;
	return String.valueOf(x).equals(new StringBuilder(x + "").reverse().toString());
    }

    // No String conversion
    public boolean isPalindrome2(int x) {
	if (x < 0 || (x % 10 == 0 && x != 0))
	    return false;
	int n = x;
	int r = 0;
	while (n > 0) {
	    r = r * 10 + (n % 10);
	    n /= 10;
	}
	return r == x;
    }

    public boolean isPalindrome3(int x) {
	if (x < 0 || (x % 10 == 0 && x != 0))
	    return false;
	int n = x;
	int r = 0;
	while (n > 0) {
	    r = r * 10 + (n % 10);
	    n /= 10;
	}
	return r == x;
    }
}
