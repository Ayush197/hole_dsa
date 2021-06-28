import java.util.Scanner;

public class q17 
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the size of arrray ");
        int n=au.nextInt();

        int x[]=new int[n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();
        System.out.println("ENTER THE POWER LIMIT");
        int k=au.nextInt();

        int p=0,count=0,store=0;
        while(p<n)
        {
            if(x[p]<k)
            {
            count+=1;
            store+=x[p];
            }
            else
            break;

            p++;
        }
        System.out.println(count+" , "+store);
        au.close();
    }
    
}
