package hw_3;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeWorkTest {

    @Test
    public void testCorrectIsPalindrome() {
        int x = 125521;
        Palindrome palindrome = new PalindromeWork();
        Assert.assertEquals(true, palindrome.isPalindrome(x));
    }

  
    @Test
    public void testValidReversUserNum() {
        int x = 3456543;
        PalindromeWork palindrome = new PalindromeWork();
        palindrome.isPalindrome(x);
        Assert.assertEquals(x, palindrome.getReversNum());
    }

    @Test
    public void testIsNotPalindrome() {
        int x = 3434534;
        Palindrome palindrome = new PalindromeWork();
        Assert.assertEquals(false, palindrome.isPalindrome(x));
    }

    @Test
    public void testNoValidReversUserNum() {
        int x = 34635334;
        PalindromeWork palindrome = new PalindromeWork();
        palindrome.isPalindrome(x);
        assert (x != palindrome.getReversNum());
    }


}
