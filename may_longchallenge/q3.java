import java.util.Scanner;

public class q3
 {
     static long res(long n)
     {
         int mod=(int)Math.pow(10,9)+7;

         long r=(n-1)%mod;
         long x=2,temp=1;
         while(r>0)
         {
             if(r%2!=0)
             temp=(temp*x)%mod;

             
             x=(x*x)%mod;
             r/=2;

         }
         return temp;
     }

    public static void main(String[] args) 
    {
        try {
            
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            while(t>0)
            {
                long n=au.nextLong();
                System.out.println(res(n));
                t--;
            }
            au.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
}
