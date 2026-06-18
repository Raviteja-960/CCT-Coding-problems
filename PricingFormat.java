import java.util.Scanner;

public class PricingFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int product = 1;
        for (int i = 0; i < s.length(); i++) {
            product *= (s.charAt(i) - '0');
        }

        System.out.println(product);
        sc.close();
    }
}
