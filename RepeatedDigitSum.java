import java.util.Scanner;

public class RepeatedDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int r = sc.nextInt();

        if (r == 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        int digitSum = 0;
        for (int i = 0; i < n.length(); i++) {
            digitSum += n.charAt(i) - '0';
        }

        int result = digitSum * r;

        int finalDigit = 0;
        while (result > 0) {
            finalDigit += result % 10;
            result /= 10;
        }

        System.out.println(finalDigit);
        sc.close();
    }
}
