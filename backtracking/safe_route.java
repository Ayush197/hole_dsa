public class safe_route 
{
    int r,c;
    int ar_row[]={-1,0,0,1},ar_col[]={0,-1,1,0};
    int min_dist;
    safe_route(int r,int c)
    {
        this.r=r;
        this.c=c;
        min_dist=Integer.MAX_VALUE;

    }
    boolean is_safe(int mat[][],boolean vis[][],int x,int y)
    {
        return !(mat[x][y]==0||vis[x][y]);
    }
    boolean is_valid(int x,int y)
    { 
        System.out.println(x+" , "+y);
        return x>=0&&x<r&&y>=0&&y<c;
    }
    void around_mine(int mat[][])
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                for(int k=0;k<4;k++)
                {
                    if(is_valid(i+ar_row[k],j+ar_col[k]))
                    mat[i+ar_row[k]][i+ar_col[k]]=-1;

                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            if(mat[i][j]==-1)
            mat[i][j]=0;
        }
    }
    void util_func(int mat[][],boolean vis[][],int x,int y,int cur_dist)
    {
        if(y==c-1)
        {
           min_dist= Math.min(min_dist,cur_dist);
            return;
        }
        
        if(cur_dist>min_dist)
        return;

        vis[x][y]=true;

        for(int k=0;k<4;k++ )
        {
            if(is_valid(x+ar_row[k],y+ar_col[k])&&is_safe(mat, vis, x+ar_row[k], y+ar_col[k]))
             util_func(mat, vis, x, y, cur_dist+1);
        }

        vis[x][y]=false;
        
    }
    void func(int mat[][])
    {
        boolean vis[][]=new boolean[r][c];

        around_mine(mat);

        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        if(mat[i][j]==1)
        {
            util_func(mat, vis, 0, 0, 0);
        }

        if(min_dist==Integer.MAX_VALUE)
        System.out.println("safe route doesnt exist");
        else
        System.out.println("safe route exist  and the distance is "+ min_dist);

    }

    


    public static void main(String[] args) 
    {
        int[][] mat = {
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
            { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 } };

            int r=12,c=10;
            safe_route ob=new safe_route(r, c);

            ob.func(mat);

        
    }
    
}
