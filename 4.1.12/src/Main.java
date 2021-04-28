import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i,j,n,t;
        int [] code;
        int [] score;
        n=inp.nextInt();
        code=new int[n];
        score=new int[n];
        for(i=0; i<n; i++)
        {
            code[i]=inp.nextInt();
            score[i]=inp.nextInt();
        }
        for (i=0; i<n-1; i++)
            for (j=i+1; j<n; j++)
                if (score[i]<score[j])
                {
                    t=score[i];
                    score[i]=score[j];
                    score[j]=t;
                    t=code[i];
                    code[i]=code[j];
                    code[j]=t;
                }
        for (i=0; i<n-1; i++)
            for (j=i+1; j<n; j++)
                if (score[i]==score[j]) {
                    if(code[i]>code[j]){
                        t=code[i];
                        code[i]=code[j];
                        code[j]=t;
                    }
                }

        for (i=0; i<n; i++)
            System.out.println(code[i]+" "+score[i]);
    }

}