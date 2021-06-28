public class lost_dollar 
{
    static int maxVal(int x[])
    {
        int idx=0;
        for(int i=1;i<x.length;i++)
        if(x[i]>x[idx])
        {
    
        idx=i;
        }

        return idx;
    }
    static int minVal(int x[])
    {
        int idx=0;
        for(int i=1;i<x.length;i++)
        if(x[i]<x[idx])
        {
        idx=i;
        }

        return idx;
    }
    static void solve_seett(int req[],int n)
    {
         
       int min_idx=minVal(req),max_idx=maxVal(req);

       if(req[min_idx]==0&&req[max_idx]==0)
       return;

       int min=Math.min(req[max_idx], -req[min_idx]);

       req[min_idx]+=min;
       req[max_idx]-=min;

       System.out.println("Person " +max_idx + " pays " + min
       + " to " + "Person " + min_idx);
       solve_seett(req, n);
    }
    static void sett_ammount(int x[][],int n)
    {

        int dede[]=new int[n];
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        dede[i]+=x[i][j]-x[j][i];

        solve_seett(dede, n);


    }
    public static void main(String[] args)
     {
        int x[][] = { {0, 1000, 2000},
        {0, 0, 5000},
        {0, 0, 0},};
        sett_ammount(x, 3);

        

        
    }
    
}
