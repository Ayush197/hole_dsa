import java.io.*;
import java.util.Scanner;

public class q4
 {
     public static void main(String[] args) 
     {
         try {

           
            InputStreamReader r=new InputStreamReader(System.in);    
            BufferedReader br=new BufferedReader(r); 
            int t=Integer.parseInt(br.readLine());
            PrintWriter out=new PrintWriter(System.out);
            //PrintWriter out=new PrintWriter(System.out);
            while(t>0)
            {
                String a=br.readLine(),b=br.readLine(),c=br.readLine();
                
                int count_x=0,count_o=0,count_space=0;
                for(int i=0;i<a.length();i++)
                {
                    char ch=a.charAt(i);
                    if(ch=='X')
                    count_x+=1;
                    else if(ch=='O')
                    count_o+=1;
                    else if(ch=='_')
                    count_space+=1;
                }
                for(int i=0;i<b.length();i++)
                {
                    char ch=b.charAt(i);
                    if(ch=='X')
                    count_x+=1;
                    else if(ch=='O')
                    count_o+=1;
                    else if(ch=='_')
                    count_space+=1;
                }
                for(int i=0;i<c.length();i++)
                {
                    char ch=c.charAt(i);
                    if(ch=='X')
                    count_x+=1;
                    else if(ch=='O')
                    count_o+=1;
                    else if(ch=='_')
                    count_space+=1;
                }
                boolean flag=(a.charAt(0)==a.charAt(1)&&a.charAt(1)==a.charAt(2)&&a.charAt(0)=='X')||(b.charAt(0)==b.charAt(1)&&b.charAt(1)==b.charAt(2)&&b.charAt(0)=='X')||(c.charAt(0)==c.charAt(1)&&c.charAt(1)==c.charAt(2)&&c.charAt(0)=='X');
               boolean flag1=(a.charAt(0)==b.charAt(0)&&b.charAt(0)==c.charAt(0)&&a.charAt(0)=='X')||(a.charAt(1)==b.charAt(1)&&b.charAt(1)==c.charAt(1)&&a.charAt(1)=='X')||(a.charAt(2)==b.charAt(2)&&b.charAt(2)==c.charAt(2)&&a.charAt(2)=='X');
               boolean flag2=(a.charAt(0)==b.charAt(1)&&b.charAt(1)==c.charAt(2)&&a.charAt(0)=='X')||(a.charAt(2)==b.charAt(1)&&b.charAt(1)==c.charAt(0)&&a.charAt(2)=='X');
               int m=0,n=0;
               boolean flag3=(a.charAt(0)==a.charAt(1)&&a.charAt(1)==a.charAt(2)&&a.charAt(0)=='O')||(b.charAt(0)==b.charAt(1)&&b.charAt(1)==b.charAt(2)&&b.charAt(0)=='O')||(c.charAt(0)==c.charAt(1)&&c.charAt(1)==c.charAt(2)&&c.charAt(0)=='O');
               boolean flag4=(a.charAt(0)==b.charAt(0)&&b.charAt(0)==c.charAt(0)&&a.charAt(0)=='O')||(a.charAt(1)==b.charAt(1)&&b.charAt(1)==c.charAt(1)&&a.charAt(1)=='O')||(a.charAt(2)==b.charAt(2)&&b.charAt(2)==c.charAt(2)&&a.charAt(2)=='O');
               boolean flag5=(a.charAt(0)==b.charAt(1)&&b.charAt(1)==c.charAt(2)&&a.charAt(0)=='O')||(a.charAt(2)==b.charAt(1)&&b.charAt(1)==c.charAt(0)&&a.charAt(2)=='O');

               if(flag||flag1||flag2)
               m=1;
               else if(flag3||flag4||flag5)
               n=1;

               String res;

               if((m==1&&n==1)||(count_x-count_o<0)||count_x-count_o>1)
               res="3";
               else if(count_o==0&&count_x==0&&count_space==9)
               res="2";
               else if(m==1&&n==0&&count_x>count_o)
               res="1";
               else if(n==1&&m==0&&count_x==count_o)
               res="1";
               else if(m==0&&n==0&&count_space==0)
               res="1";
               else if(m==0&&n==0&&count_space>0)
               res="2";
               else
               res="3";

                out.println(res);
                out.flush();
                 



                t--;
            }
        
             
         } catch (Exception e) {
             //TODO: handle exception
         }
         
     }
    
}
