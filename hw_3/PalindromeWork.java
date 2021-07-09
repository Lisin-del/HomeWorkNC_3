package hw_3;

public class PalindromeWork implements Palindrome {
    private int palindrome;
    private int reversNum = 0;

    @Override
    public boolean isPalindrome(int x) {
        if(x < 0) {
            x = Math.abs(x);
            palindrome = x;
        }
        else {
            palindrome = x;
        }

        while(palindrome > 0) {
            int vr = palindrome % 10;
            reversNum = reversNum * 10 + vr;
            palindrome = palindrome / 10;
        }

        if(reversNum == x) {
            System.out.format("Your number %d is palindrome", x);
            return true;
        }
        else {
            System.out.format("Your number %d is not palindrome", x);
            return false;
        }
    }

    public int getReversNum() {
        return reversNum;
    }
}
