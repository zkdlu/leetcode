package zkdlu.leetcode.binarysearch.easy;

import zkdlu.leetcode.Problem;

public class FirstBadVersion extends Problem {
    private boolean isBadVersion(int version) {
        if (version == 3) return false;
        if (version == 4) return true;
        if (version == 5) return true;
        return false;
    }

    public int firstBadVersion(int n) {
        int l = 1;
        int h = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (isBadVersion(mid)) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    @Override
    public void run() {
        int input = 5;
        print(firstBadVersion(5));
    }
}
