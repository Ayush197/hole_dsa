import java.util.Scanner;

public class q4
{
    public static void main(String[] args) {
        try {
            Scanner au=new Scanner(System.in);
        long t=au.nextLong();
        
        while(t>0)
        {
            long n=au.nextLong();

            int ar[]={60,20,36,51};
            int r[]={44,16,28,39};
            long res=0;
            boolean flag=true;
            if(n>4)
            {
              res=60;
              n=n-4;
              if(n>0&&flag)
              {
                  
                  res+=(n/4)*r[0];
                  
                      if(n%4!=0)
                      {
                      int rem=(int)n%4;
                      res+=r[rem];
                      n=n-4;
                      }
                  
              }
              
            }
            else if(n<=4)
            {
            
                int rem=(int)n%4;
                res+=ar[rem];
                flag=false;
            }
             
            System.out.println(res);
            t--;
        }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
