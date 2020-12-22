import java.io.*;
import java.net.URL;


public class Main {
    public static String CompareSimbols(File file1,File file2) throws FileNotFoundException{
        FileReader f1 =new FileReader(file1);
        FileReader f2 =new FileReader(file2);
        String difstr="";
        long len;
        if(file1.length()<file2.length()){
            len=file1.length();
        }else{
            len=file2.length();
        }
        try {
            char a1;
            char a2;
            for (int i = 0; i < len ; i++) {
                a1=(char)f1.read();
                a2=(char)f2.read();
                if(a1!=a2){
                    difstr+="//"+(i+1)+": ("+a1+", "+a2+")";
                }

            }
            f1.close();
            f2.close();
        }catch (IOException e){
            e.getStackTrace();
        }

        return difstr;
    }
    public static String CompareSimbolsURL(URL url1,URL url2) throws IOException{

        BufferedReader readu1 = new BufferedReader(new InputStreamReader(url1.openStream()));
        BufferedReader readu2 = new BufferedReader(new InputStreamReader(url2.openStream()));

        String difstr="";
        boolean dif=false;
        try {
            char a1;
            char a2;

            a1=(char)readu1.read();
            a2=(char)readu2.read();
            int i=0;
            while((i!=255)){
                if(a1!=a2){
                    difstr+="//"+(i+1)+": ("+a1+", "+a2+")";
                    dif=true;
                }
                a1=(char)readu1.read();
                a2=(char)readu2.read();
                i++;
            }
            readu1.close();
            readu2.close();
        }catch (Exception e){
            e.getStackTrace();
        }finally{
                readu1.close();
                readu2.close();
        }
        if(!dif){
            difstr="Sites do not have a difference!";
        }
        return difstr;
    } //dont work for https
    public static void main(String[] args) {
        try{
            File file1 = new File("a.txt");
            File file2 = new File("b.txt");
            File file3 = new File("c.txt");
            URL url1 = new URL("http://www.pravex.com.ua/rus/services/personal/currency-converter");
            URL url2 = new URL("http://www.pravex.com.ua/rus/services/personal/currency-converter");
            PrintWriter writer = new PrintWriter(file3);
            writer.print(CompareSimbolsURL(url1,url2));
            writer.close();
        }catch (IOException e){
            e.getStackTrace();
        }catch (Exception e1){
            e1.getStackTrace();
        }
    }
}
