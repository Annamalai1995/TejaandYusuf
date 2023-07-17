package FundamentalJava.oops.inheritance.Encapsulation;
class Details
{
    public int Rollno;

    public  String name;
    public  String collegename;
    public  String Dept;
    public   long phno;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }
}
public class Encap  extends Details {
    public static void main(String[] args) {
        Encap ee = new Encap();
        ee.setRollno(1234);
        ee.setName("Yusuf and Teja");
        ee.setCollegename("SONA and VIT");
        ee.setDept("BSC CS and M.Tech Cs ");
        ee.setPhno(78945456123L);
        System.out.println(ee.getRollno()+"\n"+ee.getName()+"\n"+ee.getCollegename()+"\n"+ee.getDept()+"\n"+ee.getPhno());


    }
}
