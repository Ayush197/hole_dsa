import java.util.*;
public class q9
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);

        System.out.println("Enter the size of array and K");
        int n=au.nextInt();
        int k=au.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();

        for(int i=0;i<n;i++)
        {
            if(ar[i]-k>=0)
            {
                ar[i]=ar[i]-k;
            }
            else
            ar[i]=ar[i]+k;
        }

        for(int i=0;i<n;i++)
        System.out.print(ar[i]+" ");
    }
}
