package FundamentalJava.StringMethods;

public class String2 {
    public static void main(String[] args) {
        String a="Kishore";
        String a1="Kishore";//literal
        String a2=new String("Kishore");// non literal
        String a3="kumar";
        System.out.println(a.equals(a1));
        System.out.println(a2.equals(a1));
        System.out.println(a.equalsIgnoreCase(a1));
        System.out.println(a==a1);
        System.out.println(a.compareTo(a1));

    }
}
