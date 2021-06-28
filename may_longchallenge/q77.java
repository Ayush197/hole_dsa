import java.util.*;

public class q77
{
    
    

    
    static int m=(int)Math.pow(10, 9)+7;
    public static void dfs(int curr,int p ,int vec[][],int r[],int q[])
    {
        
        q[curr]=1;
        r[curr]=1;

        int sum=0,count=0;
        for(int i=0;i<vec[curr].length;i++)
        {
            int nod=vec[curr][i];
            if(nod!=p)
            {
                dfs(nod, curr, vec, r, q);
                r[curr]+=(2*r[nod]%m);
                r[curr]%=m;
                count+=1;
                q[curr]+=q[nod];
                q[curr]%=m;
                q[curr]+=r[curr];
                q[curr]%=curr;
                sum+=r[nod];
            

            }
        }
        for(int i=0;i<vec[curr].length;i++)
        {
            int node=vec[curr][i];
            if(node!=p)
            {
                q[curr]+=(r[node]*((sum-r[node]+m)%m)%m);
                q[curr]%=m;
               
            }
        }
    }
    public static void main(String[] args) 
    {
        try {
            
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            



            while(t>0)
            {
                int n=au.nextInt();
                int vec[][]=new int[n+1][n+1];
                  int r[]=new int[n+1];
                  int q[]=new int[n+1];
               
                for(int i=1;i<n;i++)
                {
                    int x=au.nextInt(),y=au.nextInt();
                    vec[x][y]=x;
                    vec[y][x]=y;
                    
                }
                dfs(1, 1,vec,r,q);
                System.out.println(q[1]%m);
              

                t--;
            }
            au.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
}
