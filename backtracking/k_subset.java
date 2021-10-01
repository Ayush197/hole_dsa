import java.util.Arrays;

public class k_subset {



    void func(int ar[],int k)
    {
        int len=ar.length;

        
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=ar[i];
        }
        if(sum%k!=0||len==1)
        {
            System.out.println("Can't happen ");
            return;
        }

        int sub_sum[]=new int[k];
        Arrays.fill(sub_sum, 0);
        boolean vis[]=new boolean[len];
        int sub=sum/k,i=0,j=len-1;
        vis[len-1]=true;
        sub_sum[0]=ar[len-1];
        boolean res=util_func(ar,len,sub_sum,sub,vis,k,i,j);

        System.out.println(res);

    }

     boolean util_func(int[] ar, int len, int[] sub_sum, int sub, boolean[] vis, int k, int i, int j) {

        if(sub_sum[i]==sub)
        {
             if(i==k-2)
             return true;

             return util_func(ar, len, sub_sum, sub, vis, k, i+1, j-1);
        }
        for(int c=j;c>=0;c--)
        {
            if(vis[c])
            continue;

            int temp=sub_sum[i]+ar[c];

            if(temp<=sub)
            {
                sub_sum[i]+=ar[c];
                vis[c]=true;
                boolean next_move=util_func(ar, len, sub_sum, sub, vis, k, i, c-1);

                vis[c]=false;
                sub_sum[i]-=ar[c];
                if(next_move)
                return true;

            }
        }
        return false;
    }

    /*
    void find_subs(int ar[],int k)
    {
        boolean res= util(ar,k,-1,ar.length-1,0,ar[ar.length-1]);

        System.out.println(res);
    }
    private boolean util(int[] ar, int k, int i, int j, int curr,int val) {
        
        if(i>j)
        return true;

        if((ar[j]+(i>0?ar[i]:0))!=val)
        return false;

        return util(ar, k, i+1, j-1, curr, val);


    }
    */
    public static void main(String[] args) {
        
        int arr []= {2, 1, 4, 5, 6}, K = 3;

        k_subset ob=new k_subset();

        ob.func(arr, K);
    }
    
}
