import java.util.*;
public class q4 {
    
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("ENter the size");
        int n=au.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();
        
        int low=0,mid=0,high=n-1,temp=0;
        while(mid<=high)
        {
            switch(ar[mid])
            {
                case 0:
                {

                    temp=ar[low];
                    ar[low]=ar[mid];
                    ar[mid]=temp;
                   low+=1;
                   mid+=1;
                    break;
                
                }
                case 1:
                mid+=1;
                break;

                
                case 2:
                {

                    temp=ar[high];
                    ar[high]=ar[mid];
                    ar[mid]=temp;
                    high-=1;

                }
                
            }
        }
        System.out.println("THE soreted array");
        for(int i=0;i<n;i++)
        System.out.println(ar[i]);

    }
    
}
