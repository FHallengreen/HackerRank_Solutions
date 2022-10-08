package CountingValleys;

import java.util.Scanner;

public class Result {

    public static int countingValleys(int steps, String path) {

        char[] arr = path.toCharArray();
        int count = 0;
        int valley = 0;
        int tmp = 0;

        for (int i = 0; i < steps; i++) {
            if (arr[i] == 'D'){
                count-=1;
            }
            else if (arr[i] == 'U'){
                count+=1;
            }

            if (count < 0){
            tmp = 1;
            }
            if (count == 0 && tmp == 1){
                valley++;
                tmp = 0;
            }
        }
        return valley;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        sc.nextLine();
        String path = sc.nextLine();

        int result = countingValleys(steps,path);
        System.out.println(result);
    }
}
