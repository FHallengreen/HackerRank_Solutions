package problemSolving;

import java.util.Scanner;

public class compareTheTriplets {

        public static String compareTriplets(int[] a, int[] b) {
            int c = 0;
            int d = 0;

            for (int i = 0; i < 3; i++) {
                if (a[i] > b[i]){
                    c++;
                }
                else if (b[i] > a[i]){
                    d++;
                }
            }
            return c + " " + d;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int [] a = new int[3];
            int [] b = new int[3];

            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(compareTriplets(a, b));
        }
    }
