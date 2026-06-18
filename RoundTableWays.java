import java.util.Scanner;

public class RoundTableWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ways = 2L * factorial(n - 1);
        System.out.println(ways);

        sc.close();
    }

    private static long factorial(int x) {
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
