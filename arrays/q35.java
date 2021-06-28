import java.util.*;
public class q35 
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the size of arrray");

        int n=au.nextInt();

        int x[]=new int[n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        Arrays.sort(x);

        if(n%2==1)
        System.out.println(x[n/2]);
        else
        {
            n=n-1;
        System.out.println(((x[n/2]+x[(n/2)+1])/2));
        au.close();
        }

    }
    
}
