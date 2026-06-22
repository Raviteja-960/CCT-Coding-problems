import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int x = sc.nextInt();

        int fine = 0;
        for (int num : a) {
            if ((d % 2 == 0 && num % 2 != 0) || (d % 2 != 0 && num % 2 == 0)) {
                fine += x;
            }
        }

        System.out.println(fine);
        sc.close();
    }
}
