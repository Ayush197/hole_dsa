import java.util.*;

public class  traversal
{
    static void dfs(ArrayList<ArrayList<Integer>> adj,boolean vis[],int source)
    {
      vis[source]=true;
       System.out.println(source);

       for(int v: adj.get(source))
       {
            if(!vis[v])
            {
                dfs(adj, vis, v);
            }
       }
    }
    static void bfs(ArrayList<ArrayList<Integer>> adj,boolean vis[],Queue<Integer> q)
    {
        
    
       if(q.isEmpty())
       return;
    
        int v=q.poll();
        System.out.println(v);

        for(int i: adj.get(v))
        {
            if(!vis[i])
            {
                vis[i]=true;
                q.add(i);

            }
            bfs(adj, vis, q);
        }
        
    }
    static void addedge(ArrayList<ArrayList<Integer>> adj,int a,int b)
    {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        addedge(adj, 1, 2);
        addedge(adj, 2, 3);
        addedge(adj, 5, 6);
        addedge(adj, 2, 6);
        Queue<Integer> q=new PriorityQueue<>();
        
        boolean vis[]=new boolean[7];
        
        dfs(adj, vis, 1);
        q.add(1); vis[1]=true;
        Arrays.fill(vis,false);
        bfs(adj, vis, q);
    }
}