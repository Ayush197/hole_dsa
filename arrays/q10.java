import java.util.*;
public class q10
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=au.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();
        
        int max_jump=0;

        int cur=ar[0];
        while(true)
        {
        max_jump+=1;
        
         if(cur>=n-cur)
         break;
        

        cur+=ar[cur];
        }
        System.out.println(max_jump);

        au.close();
    }
}
