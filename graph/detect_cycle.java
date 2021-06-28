import java.util.*;

public class detect_cycle
 {
     static void addedge(ArrayList<ArrayList<Integer>> adj,int a,int b)
     {
         adj.get(a).add(b);
         adj.get(b).add(a);
         
     }
     static void dfs(ArrayList<ArrayList<Integer>> adj,int source,boolean vis[])
     {
         vis[source]=true;
         
         for(int v: adj.get(source))
         {
             if(vis[v])
             {
             System.out.println("cylce detected ");
             return;
             }
             
                
             dfs(adj, v, vis);
             
         }
         
     }
     public static void main(String[] args) {
         
        Scanner au=new Scanner(System.in);
        //System.out.println("enter the number of vertices");
        //int n=au.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        
        addedge(adj,0, 1);
        addedge(adj,0, 2);
        addedge(adj,1, 2);
        addedge(adj,2, 0);
        addedge(adj,2, 3);
        addedge(adj,3, 3);
        
        au.close();
     }
    
}
