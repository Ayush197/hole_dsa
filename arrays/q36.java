import java.util.*;
public class q36
{
    public static void main(String[] args)
     {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the size of arrray of two arrays n and m");
        
        int n=au.nextInt();
        int m=au.nextInt();

        int x[]=new int[n];
        int y[]=new int[m];

        int z[]=new int[m+n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();
         
        for(int i=0;i<m;i++)
        y[i]=au.nextInt();

        int i=0;

        for(i=0;i<n;i++)
        z[i]=x[i];

        for(int j=i,p=0;j<m+n;j++,p++)
        z[j]=y[p];

        
        Arrays.sort(z);
        for(int j=0;j<m+n;j++)
        System.out.println(z[j]);

        int t=n+m;
        if(t%2==1)
        System.out.println(z[t/2]);
        else
        {
            t=n-1;
        System.out.println(((z[t/2]+z[(t/2)+1])/2));
        }
        au.close();
        

    }
    
}
