package FundamentalJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Bhuvaneshwari");


        Scanner ss = new Scanner(System.in);
        System.out.println("enter first value");
        int a = ss.nextInt();
        System.out.println("enter second value");
        int b=ss.nextInt();
        int c=a+b;

        System.out.println("The result:"+c);
    }
}