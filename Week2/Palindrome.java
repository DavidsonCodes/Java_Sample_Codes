package Online_Code_Samples.Week2;

import java.util.Scanner;

public class Palindrome {

    private static String isPalindrome(String s){
        String compare = "";
        for( int i = s.length()-1; i >= 0; i--){
            compare += s.charAt(i);
        }
        return s.equalsIgnoreCase(compare) ? "It is a palindrome" : "It is not a palindrome";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string to check: ");
        String toCheck = scanner.nextLine();
        String isPalindrome = isPalindrome(toCheck);//madaM and Madam
        System.out.println(isPalindrome);

    }
}
