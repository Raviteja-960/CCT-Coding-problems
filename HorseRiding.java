import java.util.Scanner;

public class HorseRiding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int best = 0;
        int current = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            current += price[right];
            while (current >= k && left <= right) {
                current -= price[left];
                left++;
            }
            if (right - left + 1 > best) {
                best = right - left + 1;
            }
        }

        System.out.println(best);
        sc.close();
    }
}
