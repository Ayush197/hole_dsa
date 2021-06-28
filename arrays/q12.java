import java.util.*;
public class q12
{
    public static void main(String[] args) {
        Scanner au= new Scanner(System.in);

        System.out.println("Enter the size of array N and M");
        int n=au.nextInt();
        int m=au.nextInt();


        int ar[]=new int[n];
        int a[]=new int[m];

    
          
        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();

        for(int i=0;i<n;i++)
        a[i]=au.nextInt();

    
        int i=0;
         
        List <Integer> list=new LinkedList<Integer>();
        for( i=0;i<Math.min(n, m);i++ )
        {
             if(ar[i]<a[i])
             {
                 list.add(ar[i]);
                 list.add(a[i]);
                
             }
             else if(ar[i]==a[i])
             {
                 list.add(a[i]);
                
             }
             else
             {
                 list.add(a[i]);
                 list.add(ar[i]);
            
             }
        }
        int max=Math.max(n, m);
        int min=Math.min(n,m);
        for(int j=i;j<max-min+1;j++)
        {
            if(n==max)
            list.add(ar[i]);
            else
            list.add(a[i]);
        }
    
      System.out.println(list);
    }
}

