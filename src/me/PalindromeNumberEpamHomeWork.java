package me;

import static java.lang.System.*;

public class PalindromeNumberEpamHomeWork {

    public void isPalindrome(int x) {

         int originalXNumber = x;
         int reversedNumber = 0;

         while (x != 0) {
             reversedNumber = reversedNumber * 10 + x % 10;
             x = x / 10;
         }
         out.println(originalXNumber == reversedNumber);
    }
}
