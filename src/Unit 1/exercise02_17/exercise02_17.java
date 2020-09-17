// Author: Brandon Vue
// Exercise 2.17

import java.util.*;
public class exercise02_17 {

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int getAvg(int a, int b, int c) {
        return (a + b + c) / 3; // Hard coding in 3 since we're expecting 3 Int inputs only.
    }

    public static int getProd(int a, int b, int c) {
        return a * b * c;
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first int: ");
        int a = s.nextInt();

        System.out.println("Next, enter the second int: ");
        int b = s.nextInt();

        System.out.println("Finally, the final third int: ");
        int c = s.nextInt();

        int sum = getSum(a, b, c);
        int avg = getAvg(a, b, c);
        int prod = getProd(a, b, c);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Product: " + prod);

        if (a > b && a > c) {
            System.out.println("The biggest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The biggest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("The biggest number is: " + c);
        } else {
            System.out.println("There isn't ONE number that is greater than the rest.");
        }

        if (a < b && a < c) {
            System.out.println("The smallest number is: " + a);
        } else if (b < a && b < c) {
            System.out.println("The smallest number is: " + b);
        } else if (c < a && c < b) {
            System.out.println("The smallest number is: " + c);
        } else {
            System.out.println("There isn't ONE number that is smaller than the rest.");
        }

    }
}