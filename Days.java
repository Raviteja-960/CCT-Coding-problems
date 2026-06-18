import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next().toLowerCase();
        int n = sc.nextInt();

        String[] days = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};

        int start = 0;
        for (int i = 0; i < 7; i++) {
            if (days[i].equals(day)) {
                start = i;
                break;
            }
        }

        int firstSunday;

        if (start == 0)
            firstSunday = 1;
        else
            firstSunday = 8 - start;

        if (firstSunday > n) {
            System.out.println(0);
        } else {
            System.out.println(1 + (n - firstSunday) / 7);
        }

        sc.close();
    }
}