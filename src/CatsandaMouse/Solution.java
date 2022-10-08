package CatsandaMouse;

import java.util.Scanner;

public class Solution {

    static String catAndMouse(int x, int y, int z) {

        int distance1 = Math.abs(z - x);
        int distance2 = Math.abs(z - y);

        if (distance1 == distance2){
            return "Mouse C";
        }
        else if (distance1 > distance2){
            return "Cat B";
        }
        else {
            return "Cat A";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            String result = catAndMouse(x,y,z);
            System.out.println(result);
        }
    }

}
