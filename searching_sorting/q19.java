import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class q19 
{

    static int minswap(int x[])
    {
        int ans=0,len=x.length;

        int temp[]=Arrays.copyOf(x,len);

        Map <Integer,Integer> map=new HashMap<>();
        
        Arrays.sort(temp);

        for(int i=0;i<len;i++)
        map.put(x[i],i);

    

        for(int i=0;i<len;i++)
        {
             if(temp[i]!=x[i])
             {
                 ans+=1;
                 int in=temp[i];
              swap(x,i, map.get(temp[i]));
              
              map.put(in,map.get(temp[i]));
              map.put(temp[i],i);
             }
        }
        return ans;
    }

    static void swap(int x[],int i,int j)
    {
        int temp=x[i];
        x[i]=x[j];
        x[j]=temp;
    }
    public static void main(String[] args)
     {

        int[] a
        = { 101, 758, 315, 730, 472, 
                    619, 460, 479 };

       int res=minswap(a);
       
       System.err.println(res);
        
    }
    
}
