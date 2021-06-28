import java.util.*;

public class q9 
{
    static int gcd(int a,int b)
    {
        if(b==0)
        return a;

        return gcd(b, a%b);

    }

    public static void main(String[] args)
     {
         try {
             
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            while(t>0)
            {
                int k=au.nextInt();
                
                long res=0;
               
                for(int i=1;i<2*k+1;i++)
                {
                
                    res+=gcd(k+(int)Math.pow(i,2), k+(int)Math.pow(i+1,2));
                }
                System.out.println(res);


                t--;
            }
            au.close();
         } catch (Exception e) {
             //TODO: handle exception
         }
        
    }
    
}
