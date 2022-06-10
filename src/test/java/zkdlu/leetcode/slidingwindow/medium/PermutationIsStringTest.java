package zkdlu.leetcode.slidingwindow.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationIsStringTest {

    private PermutationIsString sut;

    @BeforeEach
    void setUp() {
        sut = new PermutationIsString();
    }

    @Test
    void case1() {
        boolean result = sut.checkInclusion("ab", "eidbaooo");

        assertEquals(true, result);
    }

    @Test
    void case2() {
        boolean result = sut.checkInclusion("ab", "eidboaoo");

        assertEquals(false, result);
    }

    @Test
    void case3() {
        boolean result = sut.checkInclusion("adc", "dcda");

        assertEquals(true, result);
    }
}