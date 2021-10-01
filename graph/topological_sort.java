import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class topological_sort 
{

    void util_func_dfs(ArrayList<ArrayList<Integer>> adj,int source,Stack<Integer> stk,boolean vis[])
    {
        vis[source]=true;

        for(int curr: adj.get(source))
        if(!vis[curr])
        util_func_dfs(adj, curr, stk, vis);

        stk.push(source);
    }

    void util_func_bfs(ArrayList<ArrayList<Integer>> adj,Vector<Integer>vis,Queue<Integer> q,int count,int idx[])
    {
        if(q.isEmpty())
        return;

        int val=q.poll();
         vis.add(val);

        for(int curr:adj.get(val))
        {
            if(--idx[curr]==0)
            q.add(curr);
        }
        count+=1;
        util_func_bfs(adj, vis, q, val, idx);



    }
    
    
}
