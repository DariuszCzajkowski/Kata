import org.junit.Test;

import static org.junit.Assert.*;

public class ChallengeTests {
    @Test
    public void test1() {
        assertTrue(Challenge.checkPalindrome("mom mom"));
    }

    @Test
    public void test2() {
        assertTrue(Challenge.checkPalindrome("kamil ślimak"));
    }

    @Test
    public void test3() {
        assertTrue(Challenge.checkPalindrome("reviver"));
    }

    @Test
    public void test4() {
        assertFalse(Challenge.checkPalindrome("stressed"));
    }

    @Test
    public void test5() {
        assertFalse(Challenge.checkPalindrome("good"));
    }

    @Test
    public void test6() {
        assertTrue(Challenge.checkPalindrome("refer"));
    }

    @Test
    public void test7() {
        assertFalse(Challenge.checkPalindrome("something"));
    }

    @Test
    public void test8() {
        assertTrue(Challenge.checkPalindrome("redder"));
    }

    @Test
    public void test9() {
        assertTrue(Challenge.checkPalindrome("civic"));
    }
}