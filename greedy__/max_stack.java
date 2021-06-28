public class max_stack 
{
    static int sum(int t[])
    {
        int res=0;
        for(int i=0;i<t.length;i++)
        {
            res+=t[i];
        }
        return res;
    }
    static int p=0,q=0,r=0;
    static int max(int x[],int y[],int z[])
    {
        if(p>=x.length||p>=y.length||p>=z.length)
        return 0;
        if(sum(x)==sum(y)&&sum(z)==sum(y))
        {
            return sum(x);
        }
        else 
        {
            if(sum(x)>sum(y)&&sum(x)>sum(z))
            x[p++]=0;
            else if(sum(y)>sum(x)&&sum(y)>sum(z))
            y[q++]=0;
            else 
            z[r++]=0;
            
            return max(x, y, z);
        }

    }
    public static void main(String[] args) 
    {
        int x[] = { 3, 2, 1, 1, 1 };
          int y[] = { 4, 3, 2 };
          int z[] = { 1, 1, 4, 1 };
          System.out.println(max(x, y, z));

        
    }
    
}
