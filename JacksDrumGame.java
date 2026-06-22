import java.util.Scanner;

public class JacksDrumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] board = new int[n];

        for (int i = 0; i < n; i++) {
            board[i] = sc.nextInt();
        }

        int ans = 1;
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                int len = 0;
                int cur = i;
                while (!visited[cur]) {
                    visited[cur] = true;
                    cur = board[cur - 1];
                    len++;
                }
                ans = lcm(ans, len);
            }
        }

        System.out.println(ans);
        sc.close();
    }

    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
