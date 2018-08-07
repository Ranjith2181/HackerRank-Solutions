import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int numberOfPlus = 0;
        int numberOfMinus = 0;
        int numberOfZero = 0;
        for(int i : arr) {
            if(i > 0) {
                numberOfPlus += 1;
            } else if(i < 0) {
                numberOfMinus += 1;
            } else {
                numberOfZero += 1;
            }
        }
        double length = arr.length;
        double plusNumberRatio = numberOfPlus / length;
        double minusNumberRatio = numberOfMinus / length;
        double zeroNumberRatio = numberOfZero / length;
        String pattern = "#0.000000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        System.out.println(decimalFormat.format(plusNumberRatio) + "\n" + decimalFormat.format(minusNumberRatio) + "\n" + decimalFormat.format(zeroNumberRatio));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
