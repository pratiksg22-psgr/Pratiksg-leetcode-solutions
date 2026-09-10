class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are never palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending in 0 are not palindromes,
        // except 0 itself
        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int reversed = 0;

        // Reverse only half of the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        // Even number of digits
        if (x == reversed) {
            return true;
        }

        // Odd number of digits
        // Ignore the middle digit using reversed / 10
        return x == reversed / 10;
    }
}

