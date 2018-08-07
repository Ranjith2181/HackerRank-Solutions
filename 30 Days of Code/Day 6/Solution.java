import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] str = new String[n];
        
        for(int i = 0; i < str.length; i++) {            
            str[i] = scan.next();
            char[] words = str[i].toCharArray();
            for(int j = 0; j < words.length; j++) {
                if(j == 0 || j % 2 == 0) {
                    System.out.print(words[j]);
                }
            }
            System.out.print(" ");
            for(int j = 0; j < words.length; j++) {
                if(j % 2 != 0) {
                    System.out.print(words[j]);
                }
            }
            System.out.println();            
        }        
    }
}