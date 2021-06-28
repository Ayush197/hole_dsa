package june_challenge;
import java.util.Scanner;

class q1
{
    public static void main(String[] args) 
    {
     try {
         
        Scanner au=new Scanner(System.in);
        int t=au.nextInt();
        while(t>0)
        {
            int a=au.nextInt(),b=au.nextInt(),x=au.nextInt(),y=au.nextInt();
            int res=(x/a)+(y/b);
            System.out.println(res);
            t--;

        }
        au.close();
     } catch (Exception e) {
         //TODO: handle exception
     }
        
    }
}