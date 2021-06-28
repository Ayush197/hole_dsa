import java.util.ArrayList;
import java.util.Scanner;

public class detect_cycle2
 {
     static void addEdge(ArrayList<ArrayList<Integer>> adj,int a,int b)
     {
         adj.get(a).add(b);
         adj.get(b).add(a);
     }
     static boolean dfs(ArrayList<ArrayList<Integer>> adj,int source,int parent,boolean vis[])
     {
                    vis[source]=true;
                    for(int val: adj.get(source))
                    {
                        if(!vis[val])
                        {
                            return dfs(adj, val, source, vis);
                        }
                        else if(val!=source)
                        return true;
                    }
                    return false;
     }
     static boolean dfs_uti(ArrayList<ArrayList<Integer>> adj,int v,int source)
     {
         boolean vis[]=new boolean[v];
         for(int i=0;i<v;i++)
         if(!vis[source])
         return dfs(adj, source, -1, vis);

         return false;

     }
     public static void main(String[] args) 
     {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
         Scanner au=new Scanner(System.in);
         System.out.println("enter the number of vertices");
         int n=au.nextInt();
         for(int i=0;i<n;i++)
         adj.add(new ArrayList<>());
        

        addEdge(adj,1, 0);
        addEdge(adj,0, 2);
        addEdge(adj,2, 1);
        addEdge(adj,0, 3);
        addEdge(adj,3, 4);
        au.close();
         
        
     }
    
}
