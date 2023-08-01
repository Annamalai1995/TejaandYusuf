package FundamentalJava.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Securewrite {
    public static void main(String[] args) throws IOException {
        File file= new File("F:\\Data.txt");
        FileOutputStream fos=new FileOutputStream(file);
        DeflaterOutputStream dos= new DeflaterOutputStream(fos);

        Scanner scan = new Scanner(System.in);
        System.out.println("which data you want");
        String bio=scan.nextLine();

        dos.write(bio.getBytes());
        System.out.println(file.getName()+"has written success");
        dos.close();
        fos.close();


    }
}
