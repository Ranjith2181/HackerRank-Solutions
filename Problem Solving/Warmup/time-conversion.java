import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] str = s.split(":");
        String[] str2;
        String militaryFormat;
        Pattern pattern = Pattern.compile("PM");
        if(pattern.matcher(s).find()) {            
            int i = 12 + Integer.parseInt(str[0]);
            str2 = str[2].split("PM");
            if(Integer.parseInt(str[0]) == 12) {
                militaryFormat = "12" + ":" + str[1] + ":" + str2[0];
            } else {
                militaryFormat = i + ":" + str[1] + ":" + str2[0];
            }
            return militaryFormat;
        } else {
            str2 = str[2].split("AM");
            if(Integer.parseInt(str[0]) == 12) {
                militaryFormat = "00" + ":" + str[1] + ":" + str2[0];
            } else {
                militaryFormat = str[0] + ":" + str[1] + ":" + str2[0];
            }            
            return militaryFormat;
        }
    }
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
