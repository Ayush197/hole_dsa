import java.util.*;

public class q27
 {
     public static void main(String[] args) 
     {
         Scanner au=new Scanner(System.in);
         System.out.println("Enter the size and no. of students");
         
         int n=au.nextInt();
         int m=au.nextInt();

         int x[]=new int[n];
         for(int i=0;i<n;i++)
         x[i]=au.nextInt();
         Arrays.sort(x);

        m=m-1;
        for(int i=0;i<n;i++)
        System.out.print(x[i]+" ");
        int min=x[m]-x[0];
        System.out.println(min+"<<<<");
        for(int i=1;i<n-m;i++)
        {
            m+=1;
            int dif=x[m]-x[i];
            if(dif<min)
            {
                min=dif;
                System.out.println(min);
            }

        }
        System.out.println(min);
        au.close();
         
     }
    
}
