package BOJ.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1717 {
    static int n, m;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int san = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (san == 0) {
                union(a, b);
            } else if (san == 1) {
                a = find(a);
                b = find(b);
                if (a == b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parents[a] = b;

        }
    }

    static int find(int a) {
        if (parents[a] == a) {
            return a;
        } else {
            return parents[a] = find(parents[a]);
        }

    }
}
