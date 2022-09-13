package MigratoryBirds;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    public static int migratoryBirds(int[] arr) {
        int max = 0;
        int id = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                id = i + 1;
            }
        }
        return id;
    }

    public class Solution {

        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[sc.nextInt()-1]++;
            }

            System.out.println(Result.migratoryBirds(arr));

        }

    }
}

