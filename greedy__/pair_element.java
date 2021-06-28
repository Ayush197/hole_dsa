import java.util.Arrays;
import java.util.Scanner;

public class pair_element
{
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("enter the size of two arrays n");
        int n=au.nextInt();

        int x[]=new int[n];
        int y[]=new int[n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        for(int i=0;i<n;i++)
        y[i]=au.nextInt();

        Arrays.sort(x);
        Arrays.sort(y);

        int diff=0;
        for(int i=0;i<n;i++)
        diff+=Math.abs(x[i]-y[i]);

        System.out.println(diff);
        au.close();
    }
    
}
