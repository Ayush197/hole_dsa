import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class pair
    {
        int a,b;

        pair(int a,int b)
        {
            this.a=a;
            this.b=b;
            
        }
    
    }

public class q16
{

    static ArrayList<pair> findsub(int a[],int n)
    {
        Map <Integer,ArrayList<Integer>> map=new HashMap<>();

        ArrayList<pair> out=new ArrayList<>();

        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=a[i];

            if(sum==0)
            out.add(new pair(0, i));

            ArrayList<Integer> ck=new ArrayList<>();

            if(map.containsKey(sum))
            {
                ck=map.get(sum);

                for(int j=0;j<ck.size();j++)
                out.add(new pair(ck.get(j)+1, i));
            }
            
            ck.add(i);
            map.put(sum, ck);
        }
        return out;
    }

    

    public static void main(String[] args) {
        /*
        Scanner au=new Scanner(System.in);
        int n=au.nextInt();

        int x[]=new int[n];
        
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();
        */

        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
            int n = arr.length;
              
            ArrayList<pair> out = findsub(arr, n);
              
            // if we did not find any subarray with 0 sum, 
            // then subarray does not exists 
            if (out.size() == 0)
                System.out.println("No subarray exists");
            else
                System.out.println(out);
        
        
        
    }
    
}
