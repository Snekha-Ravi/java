import java.util.Scanner;

public class ValidShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();

        System.out.println("Enter the third string (to check if it's a valid shuffle of the first two):");
        String s3 = sc.nextLine();

        if (isValidShuffle(s1, s2, s3)) {
            System.out.println("The third string is a valid shuffle of the first two strings.");
        } else {
            System.out.println("The third string is not a valid shuffle of the first two strings.");
        }

        sc.close();
    }

    private static boolean isValidShuffle(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }

        boolean[][] dp = new boolean[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                }
                else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
                }
                else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                }
                else {
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || 
                               (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }

        return dp[len1][len2];
    }
}
