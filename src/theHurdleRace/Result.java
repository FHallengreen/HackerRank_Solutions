package theHurdleRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result {

    public static int hurdleRace(int k, List<Integer> height) {

        int maxHeight = 0;

        for (int x : height) {
            if (x > maxHeight) {
                maxHeight = x;
            }
        }
        if (maxHeight < k){
            return 0;
        }
        else {
            return maxHeight - k;
        }
    }

        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            int result = hurdleRace(k, arr);
            System.out.println(result);
        }
    }
