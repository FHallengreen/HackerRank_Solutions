import java.util.Arrays;
import java.util.Scanner;

public class miniMaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        long minVal = 0;
        long maxVal = 0;

        for (int i = 0; i < 4; i++) {
            minVal += arr[i];
        }
        for (int i = 1; i < 5; i++) {
            maxVal += arr[i];
        }
        System.out.println(minVal + " " + maxVal);
    }
}
