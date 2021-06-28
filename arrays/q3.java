import java.util.*;
public class q3 
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the n and the k");
        int n=au.nextInt();
        int k=au.nextInt();

        if(k>n)
        System.out.println("its not accepted ");
        else{
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();

        Arrays.sort(ar);
        System.out.println("The k smallest value is +>>> "+ar[k-1]);
    }
    au.close();

    }
    
}
