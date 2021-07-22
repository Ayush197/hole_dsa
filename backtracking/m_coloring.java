import java.util.Vector;



class m_coloring 
{
    class Graph
    {
        Vector<Vector<Integer>> adj;
        Graph(int size)
        {
            for(int i=0;i<size;i++)
            adj=new Vector<>(size);
        
          
        }
        

        void add(int a,int b)
        {
        
           adj.get(a).add(b);
           adj.get(b).add(a);
        }
    }
    public static void main(String[] args) {

        m_coloring ob=new m_coloring();
        int size=4;

        Graph graph=ob.new Graph(size);

        for(int i=0;i<size;i++)
        graph.adj=new Vector<>();

        graph.add(1, 4);

        
    }
}