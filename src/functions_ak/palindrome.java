package functions_ak;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        //Write a function to find if a number is a palindrome or not. Take number as parameter
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int number = in.nextInt();
        boolean result= palin(number);
        System.out.println(result);
    }

    static boolean palin(int n) {
        int orig=n;
        int plus=0;
        while(n>0)
        {
            int d=n%10;
            plus= plus*10+ d;
            n=n/10;
        }
        return orig == plus;
    }
}
