import java.util.Scanner;

public class AyushStringTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        if (!A.equals(B) && A.length() == B.length()) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(0);
            } else {
                // A simple valid approach for this problem's intended behavior:
                // count the number of positions where characters differ.
                System.out.println(count);
            }
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
