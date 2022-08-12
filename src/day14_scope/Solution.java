package day14_scope;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }



        Arrays.sort(x);
        int max = Math.abs(x[n-1]-x[0]);

        System.out.println(max);
    }
}
