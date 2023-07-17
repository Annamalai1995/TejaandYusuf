package FundamentalJava.oops.inheritance;
class college
{
    public void courseofferd()
    {
        System.out.println("Engineering And Arts and science");
    }
}
class EStudents extends  college
{
    public void degree(){
    String cname="MTEch cse";
    System.out.println("Teja Degree:"+cname);

}


}
class AStudents extends EStudents
{
    public void Degree()
    {
        String cname="BSc.CS";
        System.out.println("Yusuf Degree:"+cname);
    }
}




public class Multilevel {
    public static void main(String[] args) {
        AStudents aa = new AStudents();
        aa.Degree();
        aa.degree();
        aa.courseofferd();
    }
}
