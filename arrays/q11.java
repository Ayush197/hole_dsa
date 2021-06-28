import java.util.*;
public class q11
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=au.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();
        Arrays.sort(ar);
        
        int store=0;

        for(int i=0;i<n;i++)
        {
            if(ar[i]==ar[i+1])
            {
                store=ar[i];
                break;
            }
        }
        System.out.println(store);

    }
}

