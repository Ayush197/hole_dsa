import java.util.*;
public class q18 
{

    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=au.nextInt();

    String st[]=new String[n];

     for(int i=0;i<n;i++)
     st[i]=au.next();

     System.out.println("Enter the string to be formed");
     String x=au.next();
     String store="";
     
     String flag="can't be formed";
     for(int i=0;i<n;i++)
     {
       store+=st[i];
       if(store.trim().equals(x))
       {
           flag="Can be formed";
           break;
       }
     }
     System.out.println(flag);
        
    }
    
}
