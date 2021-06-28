import java.util.*;
public class q5 {

    public static void main(String[] args) 
    {
        Scanner au= new Scanner(System.in);
        System.out.println("ENter the size");
        int n=au.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();
        
        int low=0,high=n-1;
        int mid=0;

        while(mid<=high)
        {
            if(ar[mid]<0)
            {
                int temp=ar[low];
                ar[low]=ar[mid];
                ar[mid]=temp;
                low+=1;
                mid+=1;
            }
            else 
            mid+=1;
        }
        
        for(int i=0;i<n;i++)
        System.out.println(ar[i]);

    }
}
