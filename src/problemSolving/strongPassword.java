package problemSolving;

import java.util.Scanner;

public class strongPassword {

    public static int minimumNumber(int n, String password) {
        int count = 0;
        char[] charArr = password.toCharArray();

        boolean digit = false;
        boolean lowercase = false;
        boolean uppercase = false;
        boolean specialChar = false;


        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String password = sc.nextLine();

        System.out.println(minimumNumber(n,password));

    }
}
