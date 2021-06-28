import java.util.Scanner;

public class q37
 {
     public static void main(String[] args) {
         
        Scanner au=new Scanner(System.in);
        System.out.println("Enter size and K");

        int n=au.nextInt();

        int k=au.nextInt();

        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();


        int idx=0;

        for(int i=0;i<n;i++)
        {
            if(x[i]>k)
            for(int j=i+1;j<n;j++)
            {
                
                if(x[j]<=k)
                {
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                    idx+=1;
                }
            }
        }
        System.out.println(idx);

        au.close();
     }
    
}
