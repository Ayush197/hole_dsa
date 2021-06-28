import java.util.*;
public class q21
 {
     public static void main(String[] args) {
         
        Scanner au=new Scanner (System.in);
        System.out.println("Enter the size");
        int n=au.nextInt();

        int x[]=new int[n];
        
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Set <Integer> has=new HashSet<Integer>();


        int sum=x[0];
        
        String flag="No";
        for(int i=1;i<n;i++)
        {
            
            if(sum==0||has.contains(sum)||x[i]==0)
            {
                flag="Yes";
                break;
            }

            has.add(sum);
            sum+=x[i];
        }
        System.out.print(flag);

        au.close();
     }
    
}
