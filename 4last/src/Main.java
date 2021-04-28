
import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args){

                String filename = "C:\\SomeDir\\notes.txt";
        try {
            ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:\\SomeDir\\output.zip"));
            FileInputStream fis= new FileInputStream(filename);
            ZipEntry entry1=new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            System.out.println(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
class Comp implements Comparator{
    public Comp() {
    }

    @Override
    public int compare(Object ar0, Object ar1) {
        int arg0=(Integer) ar0;
        int arg1=(Integer) ar1;
        int a = arg0 % 10 + arg0 / 10;
        int b = arg1 % 10 + arg1 / 10;
        return a-b;
    }
}