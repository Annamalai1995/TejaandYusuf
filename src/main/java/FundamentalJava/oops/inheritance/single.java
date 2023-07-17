package FundamentalJava.oops.inheritance;

class Dog
{
    public void barking()
    {
        System.out.println("dog is barking");
    }
}
class cat extends Dog
{
    public void  memow(){

        System.out.println("Memow the cats");
    }
}


public class single {
    public static void main(String[] args) {
        //single s = new single();
        cat c = new cat();
        c.memow();
        c.barking();

    }
}
