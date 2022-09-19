package findDigits;

import java.util.Scanner;

public class findDigits {

    public static int findDigits(int n) {
        String nlength = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < nlength.length(); i++) {
            if (nlength.charAt(i) % n == 0) {
                count++;
            }
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
