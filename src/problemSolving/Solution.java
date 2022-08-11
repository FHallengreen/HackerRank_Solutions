package problemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void gradingStudents(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            int a = arr.get(i);
            if (a >= 38 && a % 5 >= 3) {
                while (a % 5 != 0) {
                    a++;
                }
            }
            System.out.println(a);
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            gradingStudents(arr);

        }
    }
