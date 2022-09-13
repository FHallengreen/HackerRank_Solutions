package DivisibleSumPairs;

import java.util.ArrayList;
import java.util.Scanner;

public class Result {

/*    STDIN           Function
-----           --------
        6 3             n = 6, k = 3
            1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
    */
    public static int divisibleSumPairs(int n, int k, ArrayList<Integer> ar) {
        int result = 0;

        for (int i = 0; i < n -1; i++) {
            for (int j = i; j < n; j++) {
                if (ar.get(i) + ar.get(j) == k){
                        result +=1;
                    }
                if ((ar.get(i) + ar.get(j)) / k == k){
                    result+=1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> intArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            intArr.add(x);
        }

        System.out.println(divisibleSumPairs(n, k,intArr));

    }
}
