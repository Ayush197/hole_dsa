import java.util.*;
public class q31 
{
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the two strings");
        String x=au.next(),y=au.next();
        
        int m=x.length(),n=y.length();
        String fin="";
        
        for(int i=0;i<m;i++)
        {
            char a=x.charAt(i);
            for(int j=0;j<n;j++)
            if(a==y.charAt(j))
            fin+=a;
        }
        System.out.println(fin);
        
    }
    
}
