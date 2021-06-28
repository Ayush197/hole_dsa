import java.util.Scanner;

class max_sum
{
    public static void main(String[] args) {
        
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the size of array and k");
        int n=au.nextInt(),k=au.nextInt();

        int x[]=new int[n];

        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        int count_k=0;

        int i=0;
        int sum=0;
        while(count_k<k&&i<n)
        {
            if(x[i]<0)
            x[i]*=-1;

            sum+=x[i++];
        }
        System.out.println(sum);

        
        au.close();
    }
}