import java.util.*;
public class q19 
{
    public static void main(String[] args)
     {
         //Scanner au=new Scanner(System.in);
        // System.out.println("Enter the string");

        // String st=au.nextLine().trim();

        // au.nextLine();

         //System.out.println("Enter the string to be searched");
         //String x=au.next();

         String st="This is test case";
         String x="test";

         
         int n=st.length();

         
         

         int h=1,d= 256;
         int p=0,q=0;
         int t=101;

        int i,j;
         int m=x.length();

         for(i=0;i<m-1;i++)
             h=(h*d)%t;

        for( i=0;i<m;i++)
        {
           p=((p*d)+x.charAt(i))%t;
           q=((q*d)+st.charAt(i))%t;
           
        }
        
        for(i=0;i<=n-m;i++)
        {
            if(p==q)
            {
                
                for(j=0;j<m;j++)
                {
                    if(st.charAt(i+j)!=x.charAt(j))
                    break;
                }
                if(j==m)
                System.out.println("Pattern found at "+i);
                System.out.println(j);

            }
            if(i<n-m)
            {
              q=(d*(q-st.charAt(i)*h)+st.charAt(i+m))%t;
              if(q<0)
              q=(q+t);
        
            }

        }

          
        

        
    }
    
}
