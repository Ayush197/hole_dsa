import java.util.Scanner;
import java.io.*;
class q2
{
    public static void main(String[] args) {
        
        try {
            
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            PrintWriter out=new PrintWriter(System.out);
            while(t>0)
            {
                int D=au.nextInt(),d=au.nextInt(),p=au.nextInt(),q=au.nextInt();
                int fact=D/d;
                int res=d*((fact*p)+((q*(fact-1)*fact)/2));

                if(D%d!=0)
                res+=(D%d)*(p+fact*q);
                out.println(res);
                out.flush();

                t--;
            }
            au.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}