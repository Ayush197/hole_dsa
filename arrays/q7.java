import java.util.*;
public class q7 
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=au.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();

        int start=ar[0];
        int end=ar[n-1];
        ar[0]=end;
        ar[n-1]=ar[n-2];
        for(int i=1;i<n-1;i++)
        {
           ar[i]=start;
           start=i+1;
        }
    
        System.out.println("The rotated array");
        for(int i=0;i<n;i++)
        System.out.println(ar[i]);
    }
    
}
