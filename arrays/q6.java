import java.util.*;
public class q6 {

    public static void main(String[] args) 
    {
        Scanner au= new Scanner(System.in);
        System.out.println("ENter the size of two arrays");
        int n=au.nextInt();
        int m=au.nextInt();

        int max=Math.max(n, m);
        int min=Math.min(n,m);

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();

        

        int arr[]=new int[n];
        for(int i=0;i<m;i++)
        arr[i]=au.nextInt();

        
        int uni=0,inter=0;

        for(int i=0;i<max;i++)
        {

            if(i<min)
            {
            if(arr[i]==ar[i])
            {
            inter+=1;
            uni+=1;
            }
            }
            else 
            uni+=1;


        }
        System.out.println("the union");
        System.out.println(uni);
        System.out.println("the intersection");
        System.out.println(inter);

    }
}
