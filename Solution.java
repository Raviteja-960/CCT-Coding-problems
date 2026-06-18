import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int bits = Integer.toBinaryString(n).length();
        int mask = (1 << bits) - 1;

        int result = n ^ mask;

        System.out.println(result);

        sc.close();
    }
}