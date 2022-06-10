package zkdlu.leetcode.slidingwindow.medium;

import java.util.List;

import static zkdlu.utils.PermutationUtils.nPr;

public class PermutationIsString {
    public boolean checkInclusion(String s1, String s2) {
        List<String> permutations = getPermutations(s1);

        return permutations.stream()
                .anyMatch(s2::contains);
    }

    private List<String> getPermutations(String s1) {
        return nPr(s1, s1.length(), s1.length());
    }
}
