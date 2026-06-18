import java.util.Scanner;

public class CollectionOfCurtains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int L = sc.nextInt();

        int maxA = 0;

        for (int i = 0; i < str.length(); i += L) {
            int countA = 0;
            int end = Math.min(i + L, str.length());

            for (int j = i; j < end; j++) {
                if (str.charAt(j) == 'a') {
                    countA++;
                }
            }

            if (countA > maxA) {
                maxA = countA;
            }
        }

        System.out.println(maxA);
        sc.close();
    }
}
