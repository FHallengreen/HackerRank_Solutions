package problemSolving;

import java.util.Scanner;

public class camelCase {

    public static int camelCase(String s){
        int count = 0;
        char[] chararr = s.toCharArray();
        for (int i = 0; i < chararr.length; i++) {
            if (Character.isUpperCase(chararr[i])){
                count++;
            }
        }
        count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(camelCase(s));

    }
}
