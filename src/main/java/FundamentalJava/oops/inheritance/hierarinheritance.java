package FundamentalJava.oops.inheritance;

class father
{
    String fname="Teja";
    public void Mother() {
        String Mname="Swetha";
        System.out.println("Mother Name is:"+Mname);
        System.out.println("Father Name is :"+fname);
    }

}

class Brother extends father
{
    public void brother()
    {
        String BNAME="yusuf";
        System.out.println("Brother Name is :"+BNAME);
    }
}
class yusuf extends  father
{
    public  void Lname()
    {
        String Lname="Sara";
        System.out.println("Yusuf Friend name is :"+Lname);
    }





}

public class hierarinheritance {
    public static void main(String[] args) {
        yusuf yy = new yusuf();
        yy.Lname();
        yy.Mother();
        Brother bb = new Brother();
        bb.brother();

    }
}
