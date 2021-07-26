public class tug_war 
{
    boolean curr[],res[];
    int len,min_dif;
    tug_war(int len)
    {
        min_dif=Integer.MAX_VALUE;
        this.len=len;
        curr=new boolean[len];
        res=new boolean[len];
    }
    void func(int ar[],int sum,int cur_sum,int idx,int select_el)
    {
        if(idx==len)
        return;

        if(len-idx<(len/2)-select_el)
        return;

        func(ar, sum, cur_sum, idx+1, select_el);

        cur_sum+=ar[idx];
        curr[idx]=true;
        select_el+=1;

          if(select_el==len/2)
          {
              int local_optimal=Math.abs(sum/2-cur_sum);
              if(local_optimal<min_dif)
              {
                  min_dif=local_optimal;

                  for(int i=0;i<len;i++)
                  res[i]=curr[i];
              }
          }
          else
          {
              func(ar, sum, cur_sum, idx+1, select_el);
          }
          curr[idx]=false;

    }
    void util_func(int arr[])
    {
        int len=arr.length;

        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=arr[i];
            curr[i]=res[i]=false;
        }
        func(arr, sum, 0, 0, 0);

        System.out.println("first subbset");
        for(int i=0;i<len;i++)
        if(res[i])
        System.out.print(arr[i]+" ");
        
        System.out.println(" \n second one");
        for(int i=0;i<len;i++)
        if(!res[i])
        System.out.print(arr[i]+" ");

    }
 public static void main(String[] args) {
     
    int arr[] = {23, 45, -34, 12, 0, 98,
        -99, 4, 189, -1, 4};
 
     tug_war ob=new tug_war(arr.length);

     ob.util_func(arr);
    }
    
}
