package CountingValleys2;

import java.util.Scanner;

public class Result {

    public static int countingValleys(int steps, String path) {

        char[] arr = path.toCharArray();
        int count = 0;
        for (int i = 0; i < steps; i++) {
            if (arr[i] == 'D'){
                count-=1;
            }
            else if (arr[i] == 'U'){
                count+=1;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        sc.nextLine();
        String path = sc.nextLine();

        System.out.println(countingValleys(steps,path));

    }
}
