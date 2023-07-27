package FundamentalJava.Array;

import java.util.Arrays;

public class PassingArray {
    public void PassingArray(double[] salary1)
    {
        salary1[3]=12222.7;
        salary1[0]=999999.9;
        System.out.println(Arrays.toString(salary1));
    }
    public void PassingArray2(String name1)
    {

        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        int a=100;
        String name="Gaja";
        double[] salary= {12.3,5.6,4.3,3.2,2.4};
        PassingArray pass=new PassingArray();
        pass.PassingArray(salary);
       pass.PassingArray2("kumar");
        System.out.println(name);

    }
}
