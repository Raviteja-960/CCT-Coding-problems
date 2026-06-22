import java.util.Scanner;

public class KhoKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int wrong = 0;
        for (int i = 1; i < n; i++) {
            if (d[i] != d[i - 1]) {
                wrong++;
            }
        }

        System.out.println(wrong);
        sc.close();
    }
}
