import java.util.*;
public class q24
 {
     public static void main(String[] args) {
         
        Scanner au=new Scanner (System.in);
        System.out.println("Enter the size");
        int n=au.nextInt();

        int x[]=new int[n];
        
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Arrays.sort(x);

        int count=0;
        for(int i=1;i<n;i++)
        {
            if(x[i]-x[i-1]==1)
            {
            count+=1;
            System.out.println(x[i-1]+"  "+x[i]);
            }

        }
        System.out.println("The longest consecutive sequence >> "+ (count+1);
        au.close();
     }

}