package FundamentalJava.scanner;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        String name="Teja and Yusuf";
        System.out.println(name);
        Scanner ss= new Scanner(System.in);

        System.out.println("enter the name:");
        String name1=ss.nextLine();
        System.out.println("My name is :"+name1);


        System.out.println("Enter the age ");
        int age=ss.nextInt();
        System.out.println("Samantha Age is:"+age);
        System.out.println("Enter the phone number");
        Long phnnumber=ss.nextLong();
        System.out.println("Samantha Number:"+phnnumber);


    }
}
