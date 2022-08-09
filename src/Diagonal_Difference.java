import java.util.Scanner;

public class Diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int diag1 = 0;
        int diag2 = 0;

        for (int i = 0; i < n; i++) {
            String str[] = sc.nextLine().split(" ");
            diag1 = diag1 + Integer.parseInt(str[i]);
            diag2 = diag2 + Integer.parseInt(str[n - 1 - i]);
        }

        int diagDiff;
        if (diag1 > diag2) {
            diagDiff = diag1 - diag2;
        } else {
            diagDiff = diag2 - diag1;
        }
        System.out.println(diagDiff);
    }
}