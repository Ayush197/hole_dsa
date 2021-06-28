import java.util.*;

public class q5 
{
 
    public static void main(String[] args)
    {
        try {
            
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            
            
            while(t>0)
            {
                

                int n=au.nextInt();
                int m=au.nextInt();
            
                int ar[]=new int[n+1];
                Arrays.fill(ar,1);

                long res=0;
                for(int i=2;i<=n;i++)
                {
                    int a=m%i;
                    res+=ar[a];
                    for(int j=a;j<=n;j+=i)
                    {
                        ar[j]++;
                    }
                    
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
