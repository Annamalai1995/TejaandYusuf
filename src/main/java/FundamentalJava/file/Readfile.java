package FundamentalJava.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args) throws IOException {
        File f = new File("F:\\Hello.txt");
        FileInputStream fis= new FileInputStream(f);
        int size=fis.available();
        byte [] gettingAndvalues= new byte[fis.available()];
        fis.read(gettingAndvalues);

        String obj= new String(gettingAndvalues);
        System.out.println(obj);

    }
}
