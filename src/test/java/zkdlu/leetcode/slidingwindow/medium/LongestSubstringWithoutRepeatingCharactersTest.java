package zkdlu.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters sut;

    @BeforeEach
    void setUp() {
        sut = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void case1() {
        int result = sut.lengthOfLongestSubstring("abcabcbb");

        assertEquals( 3, result);
    }

    @Test
    void case2() {
        int result = sut.lengthOfLongestSubstring("bbbbb");

        assertEquals( 1, result);
    }

    @Test
    void case3() {
        int result = sut.lengthOfLongestSubstring("pwwkew");

        assertEquals( 3, result);
    }


    @Test
    void case4() {
        int result = sut.lengthOfLongestSubstring("");

        assertEquals( 0, result);
    }
}