package FundamentalJava.scanner;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        int a=200;
        int b=40;
        int c;
        c=a+b;
        System.out.println("The value:"+c);

        Scanner ss= new Scanner(System.in);
        System.out.println("enter the value1:");
        int value1=ss.nextInt();
        System.out.println("Enter the value2");
        int value2=ss.nextInt();

        int result=value1+value2;
        System.out.println("The result is:"+result);


    }
}
