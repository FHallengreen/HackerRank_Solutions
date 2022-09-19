package findDigits;

import java.util.Scanner;

public class findDigits {

    public static int findDigits(int n) {
        int r = n;
        int count = 0;
        while (r > 0) {
            if (r % 10 != 0 && n % (r % 10) == 0) {
                count++;
                r /= 10;
            }
            else r/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }

    }
}
