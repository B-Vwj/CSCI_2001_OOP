// Author: Brandon Vue
// Exercise 2.25

import java.util.*;
public class exercise02_25 {

    public static int getRemainder(int n) {
        return n % 2;
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter in an Int: ");
        int n = s.nextInt();

        if (getRemainder(n) == 0) {
            System.out.println("The number " + n + " is an even number!");
        } else {
            System.out.println("The number " + n + " is an odd number!");
        }
        
    }

}