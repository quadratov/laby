package lab1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(isPalindrome(line));
        scanner.close();
    }

    public static boolean isPalindrome(String inputString) {
        int pointer1 = 0;
        int pointer2 = inputString.length() - 1;
        while (pointer1 < pointer2) {
            if (inputString.charAt(pointer1) != inputString.charAt(pointer2)){
                return false;
            }
            pointer1++;
            pointer2--;
        }
        return true;
    }
}