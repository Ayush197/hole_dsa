import java.util.ArrayList;

public class path {

    class node
    {
        int vertex,weight;
        node(int vertex,int weight)
        {
            this.vertex=vertex;
            this.weight=weight;
        }
        int getWeight()
        {
            return this.weight;
        }
        int getVertex()
        {
            return this.vertex;
        }
    }

    class graph
    {
        ArrayList<ArrayList<node>>  adj;
        int size;
        graph(int size)
        {
            this.size=size;
            adj=new ArrayList<ArrayList<node>>(size);
            for(int i=0;i<size;i++)
            adj.add(new ArrayList<node>());
        }

        void addEdge(int a,int b,int weight)
        {
            
            adj.get(a).add(new node(b, weight));
            adj.get(b).add(new node(a, weight));
        }
         
        boolean K_isMore(int source,int k)
        {
            boolean visited[]=new boolean[size];
            
            visited[source]=true;

            return util( source,visited, k);
        }

        boolean util(int source, boolean[] visited, int k) 
        {
            if(k<=0)
            return true;

            ArrayList<node> curr_node=adj.get(source);

            

            for(int i=0;i<curr_node.size();i++)
            {
                node vert=curr_node.get(i);

                int vertex=vert.vertex,weight=vert.weight;


                if(visited[vertex])
                continue;

                if(weight>=k)
                return true;

                visited[vertex]=true;

                util(source, visited, k-weight);

                 visited[source]=false;
            }

            return false;
        }
    
    }
    public static void main(String[] args) {
        
        path ob=new path();

        int size=9;
        graph graph=ob.new graph(size);
       graph.addEdge(0, 1, 4);
   graph.addEdge(0, 7, 8);
   graph.addEdge(1, 2, 8);
   graph.addEdge(1, 7, 11);
   graph.addEdge(2, 3, 7);
   graph.addEdge(2, 8, 2);
   graph.addEdge(2, 5, 4);
   graph.addEdge(3, 4, 9);
   graph.addEdge(3, 5, 14);
   graph.addEdge(4, 5, 10);
   graph.addEdge(5, 6, 2);
   graph.addEdge(6, 7, 1);
   graph.addEdge(6, 8, 6);
   graph.addEdge(7, 8, 7);

    boolean res=graph.K_isMore(0, 60);

    System.out.println(res);
    }
    
}
