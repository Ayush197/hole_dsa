import java.util.Scanner;

public class q30
 {
     public static void main(String[] args)
      {
          Scanner au=new Scanner(System.in);
          System.out.println("enter the size of array");
          int n=au.nextInt();

          int x[]=new int[n];
          for(int i=0;i<n;i++)
          x[i]=au.nextInt();

          int low=0,high=n-1;

          int count=0;
          while(low<=high)
          {
              int mid=(low+high)/2;
              
                if(x[mid]>x[mid+1])
              {
                  int temp=x[mid];

                  x[mid]=x[high];
                  x[high]=temp;
                  count++;
                  low=mid+1;
              }
              else
              {
                int temp=x[mid];

                x[mid]=x[low];
                x[low]=temp;
                count++;
                high=mid-1;
              }
          }
          System.err.println(count);
          au.close();
         
     }
    
}
