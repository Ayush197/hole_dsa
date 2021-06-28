import java.util.*;
class q1
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);
        System.out.println("Enter the size n and k");
        int n=au.nextInt(),k=au.nextInt();

       int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        //int x[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int start=0,end=0       ;
        boolean f=true;

        for(int i=0;i<n;i++)
        {
            if(x[i]==k)
            {
                if(f)
                {
                start=i;
                f=false;
                }
                
                end=i;

            }
        }
        System.err.println(start+" <<start  end>>>>>>>"+end);
    }
}