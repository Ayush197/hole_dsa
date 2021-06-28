import java.io.PrintWriter;
import java.util.Scanner;

class q3 
{

    static int mod=(int)Math.pow(10, 9)+7;
    
   static  int fast_expo(long  a, int b){
        
    int result = 1;

    while (b>0){
      if (b%2==1){
        result=(int)((result%mod)*(a%mod))%mod;
      }
      b=b>>1;
      
      a*=a;
      a%=mod;
      
     // System.out.println("result"+result+" a>>> "+a);
    }
  
    return result;
      }
    public static void main(String[] args) 
    {
        try {
            
            
        Scanner au=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t=au.nextInt();
        
        while(t>0)
        {
            int n=au.nextInt(),m=au.nextInt();
            int sub= fast_expo(2, n)-1;
           // System.out.println("sub >>> "+sub);
            int res=fast_expo(sub, m);
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
