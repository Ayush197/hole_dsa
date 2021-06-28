import java.util.*;
class q2
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);
        System.out.println("Enter the size n and k");
        int n=au.nextInt();

       int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        //int x[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };


        for(int i=0;i<n;i++)
        {
            if(x[i]==i+1)
            {
                System.out.println(x[i]);

            }
        }

    }
}