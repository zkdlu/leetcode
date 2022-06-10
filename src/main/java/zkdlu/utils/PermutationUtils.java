package zkdlu.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static zkdlu.utils.PrintUtils.print;

public class PermutationUtils {

    public static List<String> nPr(String src, int n, int r) {
        if (src.length() != n || n <= 0 || r <= 0) {
            throw new IllegalArgumentException();
        }

        List<String> result = new ArrayList<>();

        Queue<String> qs = new LinkedList<>();
        Queue<Integer> qn = new LinkedList<>();
        Queue<boolean[]> visiteds = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            qs.add(src.charAt(i) + "");
            qn.add(i);

            boolean[] visited = new boolean[n];
            visited[i] = true;
            visiteds.add(visited);
        }

        while (!qn.isEmpty()) {
            String s = qs.poll();
            int num = qn.poll();
            boolean[] visited = visiteds.poll();

            if (s.length() == r) {
                print(s);
                result.add(s);
            } else {
                for (int i = 0; i < n; i++) {
                    if (i == num) {
                        continue;
                    }

                    if (!visited[i]) {
                        String newS = new String(s);
                        boolean[] newVisited = visited.clone();
                        newVisited[i] = true;
                        newS += src.charAt(i);

                        qn.add(i);
                        qs.add(newS);
                        visiteds.add(newVisited);
                    }
                }
            }
        }

        return result;
    }
}
