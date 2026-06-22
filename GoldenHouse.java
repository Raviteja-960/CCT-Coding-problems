import java.util.Scanner;

public class GoldenHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int start = -1, end = -1;
        int current = 0;

        for (int i = 0; i < n; i++) {
            current = 0;
            for (int j = i; j < n; j++) {
                current += coins[j];
                if (current == k) {
                    start = i + 1;
                    end = j + 1;
                    break;
                }
            }
            if (start != -1) {
                break;
            }
        }

        if (start == -1) {
            System.out.println("-1");
        } else {
            System.out.println(start + " " + end);
        }

        sc.close();
    }
}
