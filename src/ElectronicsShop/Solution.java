package ElectronicsShop;

import java.util.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int value = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > value) {
                    value = keyboards[i] + drives[j];

                }
            }
        }
        if (value <= b && value != 0) {
            return value;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] keyboards = new int[n];

        for (int i = 0; i < n; i++) {
            keyboards[i] = sc.nextInt();
        }

        int[] drives = new int[m];
        for (int i = 0; i < m; i++) {
            drives[i] = sc.nextInt();
        }

        System.out.println(getMoneySpent(keyboards, drives, b));

    }
/*    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        *//*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     *//*

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }*/
}

