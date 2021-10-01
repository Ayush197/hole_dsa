import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

class adj
{
    int v,weight;

    adj(int v,int weight)
    {
        this.v=v;
        this.weight=weight; 
    }
    int getV()
    {
        return v;
    }
    int getWeight()
    {
        return weight;
    }
}
class graph
{
    ArrayList<ArrayList<adj>> adjs;
    int v;
    graph(int V)
    {
        v=V;
        adjs=new ArrayList<ArrayList<adj>>();
    }
    void addEdge(int a,int b,int weight)
    {
        adj node=new adj(b, weight);
        adjs.get(a).add(node);
    }
    void topological_sort(int source,Stack<Integer> stk,boolean vis[])
    {
        vis[source]=true;

        Iterator<adj> it=adjs.get(source).iterator();

        while(it.hasNext())
        {
            adj curr=it.next();
            if(!vis[source])
            topological_sort(curr.getV(), stk, vis);
        }
        stk.push(source);
    }
    void shortest_path(int source)
    {
        Stack<Integer> stk=new Stack<>();

        int[] dist=new int[v];

        boolean vis[]=new boolean[v];

        Arrays.fill(vis, false);
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i=0;i<v;i++)
        if(!vis[i])
        topological_sort(i, stk, vis);

         Iterator<adj> it;
        while(!stk.isEmpty())
        {
            int val=stk.pop();



            if(val!=Integer.MAX_VALUE)
            {
                it=adjs.get(val).iterator();
                
                while(it.hasNext())
                {
                adj curr=it.next();
                
                if(dist[curr.getV()]>dist[val]+curr.getWeight())
                {
                    dist[curr.getV()]=dist[val]+curr.getWeight();
                }
            }
            }

        }

        System.out.println("printing distance "+dist);


    }

}
public class shortest_dag 
{
    //addd graph value here


    

}
