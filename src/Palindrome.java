import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not a palindrome");

    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
           return true;
        }
            if (s.charAt(0) != s.charAt(s.length()-1)) {
                return false;
            }
            return isPalindrome(s.substring(1,s.length()-1));
        }
    }

