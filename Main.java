import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        // Place non-zero elements first
        for(int i = 0; i < n; i++) {

            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while(index < n) {
            arr[index] = 0;
            index++;
        }

        // Print result
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}