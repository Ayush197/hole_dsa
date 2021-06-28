import java.util.*;

class water_connection 
{
    static int start[]=new int[1100];
    static int end[]=new int[1100];
    static int d[]=new int[1100];

    static List<Integer> a=new ArrayList<>();
    static  List<Integer>b=new ArrayList<>();
    static List<Integer> c=new ArrayList<>();

    static int ans,n,p;

    static int dfs(int f)
    {
        if(start[f]==0)
        return f;
        if(d[f]<ans)
        ans=d[f];

        return dfs(start[f]);
    }

    static void solve(int ar[][])
    {
        int i=0;
        while(i<p)
        {
            int x=ar[i][0],y=ar[i][1],z=ar[i][2];

            start[x]=y;
            d[x]=z;
            end[y]=x;

            i++;

        }

        for(int j=1;j<=n;++j)
        {
            if(start[j]>0&&end[j]==0)
            {
                ans=(int)Math.pow(10,10);
                int res=dfs(j);
                a.add(j);
                b.add(res);
                c.add(ans);

            }
        }

            System.out.println(a.size());
            for(int j=0;j<a.size();j++)
            {
                System.out.println(a.get(j)+" "+b.get(j)+" "+c.get(j));
            }
        
    }


    public static void main(String[] args) 
    {
        Arrays.fill(start, 0);
        Arrays.fill(end, 0);
        Arrays.fill(d,0);

        n=9;p=6;

        int arr[][] = { { 7, 4, 98 }, 
        { 5, 9, 72 }, 
        { 4, 6, 10 }, 
        { 2, 8, 22 }, 
        { 9, 7, 17 }, 
        { 3, 1, 66 } }; 

        solve(arr);
        
    }
    
}
