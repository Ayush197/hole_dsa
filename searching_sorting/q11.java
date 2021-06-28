import java.util.Arrays;

public class q11 
{
   static  void find(int ar[],int x)
    {
        int len=ar.length;
        Arrays.sort(ar);

        for(int i=0;i<len-3;i++)
        {
            for(int j=i+1;j<len-2;j++)
            {
                int low=j+1,high=len-1;

                while(low<high)
                {
                if(ar[i]+ar[j]+ar[low]+ar[high]==x)
                {
                    System.out.println(ar[i]+" , "+ar[j]+" , "+ ar[low]+","+ar[high]);
                    low++;
                    high--;
                }
                else if(ar[i]+ar[j]+ar[low]+ar[high]<x)
                low++;
                else
                high--;
            }

            }
        }

    }
    public static void main(String[] args)
     {

         int ar[] = {1, 4, 45, 6, 10, 12};
         int X = 21;
         find(ar, X);
        
    }
    
}
