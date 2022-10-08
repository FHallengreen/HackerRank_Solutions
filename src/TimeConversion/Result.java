package TimeConversion;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Result {

    public static String timeConversion(String s) throws ParseException {
        if (s.endsWith("PM")) {
            try {
                SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
                SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
                Date date = parseFormat.parse(s);
                s = displayFormat.format(date);
                return s;
            } catch (ParseException e) {
                System.out.println(e);
            }
        } else {
            try {
                SimpleDateFormat displayFormat = new SimpleDateFormat("hh:mm:ssa");
                SimpleDateFormat parseFormat = new SimpleDateFormat("HH:mm:ss");
                Date date = parseFormat.parse(s);
                s = displayFormat.format(date);
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
        return s;
    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = Result.timeConversion(s);

        System.out.println(result);
    }

}
