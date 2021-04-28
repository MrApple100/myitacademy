import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TreeMap<String,String> files = new TreeMap<String,String>();
        int N=in.nextInt();
        in.nextLine();
        for (int i=0;i<N;i++) {
            String all =in.nextLine();
            String name = all.split(" ")[0];
            int j=all.split(" ").length;
            String operations=new String();
            for(int k=1;k<j;k++)
                operations+=all.split(" ")[k];
            if (j < 4) {
                if(j==3)
                    operations+="_";
                else{
                    operations+="__";
                }
            }
            files.put(name, operations);
        }
        N=in.nextInt();
        in.nextLine();
        for (int i=0;i< N;i++){
            String all=in.nextLine();
            String operation = all.split(" ")[0];
            String name = all.split(" ")[1];
            if (operation.equals("read")) {
                if ((files.get(name).substring(0,1).equals("R")) || (files.get(name).substring(1,2).equals("R")) || (files.get(name).substring(2,3).equals("R")))
                    System.out.println("OK");
                else
                    System.out.println("Access denied");
            }
            else if (operation.equals("write")) {
                if ((files.get(name).substring(0,1).equals("W"))|| (files.get(name).substring(1,2).equals("W"))|| (files.get(name).substring(2,3).equals("W")))
                    System.out.println("OK");
                else {
                    System.out.println("Access denied");
                }
            }
            else if (operation.equals("execute")){
                if ((files.get(name).substring(0,1).equals("X")) || (files.get(name).substring(1,2).equals("X")) || (files.get(name).substring(2,3).equals("X")))
                    System.out.println("OK");
                else {
                    System.out.println("Access denied");
                }
            }
        }
    }
}
