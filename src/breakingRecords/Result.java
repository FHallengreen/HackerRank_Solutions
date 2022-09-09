package breakingRecords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Result {

/*   20
100 45 41 60 17 41 45 43 100 40 89 92 34 6 64 7 37 81 32 50
*/

/*    20
            17 45 41 60 17 41 76 43 51 40 89 92 34 6 64 7 37 81 32 50*/

    public static void breakingRecords(ArrayList<Integer> scores) {
        int[] returnList = new int[2];

        int max = 0;
        int min = 0;

        for (int x : scores) {
            if (x == scores.get(0)) {
                min = x;
                max = x;
            }
            if (x < min) {
                min = x;
                returnList[1] += 1;
            }
            if (x > max) {
                max = x;
                returnList[0] += 1;
            }
        }
        System.out.println(returnList[0] + " " + returnList[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            scores.add(x);
        }

        Result.breakingRecords(scores);

    }
}


