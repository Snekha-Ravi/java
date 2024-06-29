

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String a = sc.nextLine();
        System.out.println(isPalindrome(a));
    }

    static boolean isPalindrome(String a) {
        if (a.length() == 0) {
            return true;
        }
        a = a.toLowerCase();
        for (int i = 0; i < a.length() / 2; i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
