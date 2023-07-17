package FundamentalJava.variables;

public class Demovariable {
    static String collegename="Sona College";
    static String collegename1="VIT";
    int age =20;
    int age1=17;

    public void yusuf()
    {
        String crushname="Samantha";
        String mycrushname="Priya";
        System.out.println("Your crushname:"+crushname);
        System.out.println("My crushnName:"+mycrushname);
        System.out.println("Enter the age of Yusuf:"+age);
        System.out.println("Enter the age of Teja:"+age1 );
    }
    public static void main(String[] args) {
        int data=200;   //instance variable
        String name="Teja and yusuf";
        float data1=10.5f;
        System.out.println("ENter the data value:"+data);
        System.out.println("Enter the Name"+name);
        System.out.println("FLoat value is"+data1);
        System.out.println("Enter collegename of yusuf:"+collegename);
        System.out.println("Enter collegename of Teja:"+collegename1);

        //Object Creation
        //Syntax: classname objectname=new classname();
        Demovariable Dv=new Demovariable();
        Dv.yusuf();




    }

}
