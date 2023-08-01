package FundamentalJava.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class Secureread {
    public static void main(String[] args) throws IOException {
        File file= new File("F:\\Data.txt");
        FileInputStream fis= new FileInputStream(file);
        InflaterInputStream ifs= new InflaterInputStream(fis);
        int size1=fis.available();
        byte ss[]= new byte[size1];
        ifs.read(ss);
        System.out.println(new String(ss));
        ifs.close();
        fis.close();

    }
}
