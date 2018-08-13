import java.util.Scanner;

// Source: https://www.geeksforgeeks.org/length-longest-consecutive-1s-binary-representation/

public class Solution {
    private static int maxConsecutiveOnes(int x) {
        // Initialize result
        int count = 0;

        // Count the number of iterations to
        // reach x = 0.
        while (x!=0)
        {
            // This operation reduces length
            // of every sequence of 1s by one.
            x = (x & (x << 1));

            count++;
        }
        return count;
    }

    public static void main(String strings[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println(maxConsecutiveOnes(n));        
    }
}
