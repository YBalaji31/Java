// A Dynamic Programming based Java program for LPS problem
// Returns the length of the longest palindromic subsequence
import java.io.*;
import java.util.*;

class test {
    public static int longestPalinSubseq(String S)
    {
        String R
            = new StringBuilder(S).reverse().toString();

        // dp[i][j] will store the length of the longest
        // palindromic subsequence for the substring
        // starting at index i and ending at index j
        int dp[][]
            = new int[S.length() + 1][R.length() + 1];

        // Filling up DP table based on conditions discussed
        // in above approach
		int i,j;
        for (i = 1; i <= S.length(); i++) {
            for (j = 1; j <= R.length(); j++) {
				System.out.println(S.charAt(i - 1)+"  "+ R.charAt(j - 1));
                if (S.charAt(i - 1) == R.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1],
                                        dp[i - 1][j]);
            }
			System.out.println();
			System.out.println();
        }

		for (i = 0; i <= S.length(); i++) {
		for (j = 0; j <= R.length(); j++) {
		System.out.print(dp[i][j]+" ");	
		}
		System.out.println();
		}
		
		
        // At the end DP table will contain the LPS
        // So just return the length of LPS
        return dp[S.length()][R.length()];
    }
  
    // Driver code
    public static void main(String[] args)
    {
        String s = "GEEKSFORGEEKS";
        System.out.println("The length of the LPS is "
                           + longestPalinSubseq(s));
    }
}
