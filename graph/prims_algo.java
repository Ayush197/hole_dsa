import java.util.Arrays;

public class prims_algo
 {

    int execution(int graph[][],int V)
    {
        int key[]=new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        int res=0;
        key[0]=0;
        boolean mSet[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            int u=-1;
            for(int v=0;v<V;v++)
            if(!mSet[v]&&(u==-1||key[v]<key[u]))
            u=v;

            res+=key[u];

            mSet[u]=true;

            for(int v=0;v<V;v++)
            if(!mSet[v]&&graph[v][u]!=0)
            key[v]=Math.min(key[v], graph[u][v]);
        }
        return res;


    }
    public static void main(String[] args) {
        
        int graph[][] = new int[][] { { 0, 5, 8, 0}, 
        { 5, 0, 10, 15 }, 
        { 8, 10, 0, 20 }, 
        { 0, 15, 20, 0 },};  
        prims_algo ob=new prims_algo();
        int V=4;
        int res= ob.execution(graph, V);
        System.out.println(res);
    }
    
}
