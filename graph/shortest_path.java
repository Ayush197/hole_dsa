import java.util.ArrayList;
import java.util.Queue;

public class shortest_path
 {

    static void addEdge(ArrayList<ArrayList<Integer>> adj,int a,int b)
    {
        adj.get(b).add(a);
        adj.get(a).add(b);
    }

    int []get_path_bfs(ArrayList<ArrayList<Integer>> adj, Queue<Integer> q,int source,boolean vis[],int path[])
    {
        if(q.isEmpty())
        return path;

        int val=q.poll();
        vis[val]=true;

        for(int curr:adj.get(val))
        {
            if(!vis[curr])
            {
                path[curr]=path[val]+1;
                vis[curr]=true;
                q.add(curr);

            }
        }
       return  get_path_bfs(adj, q, source, vis, path);

        
    }
    public static void main(String[] args) 
    {

        //add edge here, feeling too lazy to do so ;(
        
    }
    
}
