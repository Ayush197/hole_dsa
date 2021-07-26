import java.util.*;



class m_coloring 
{
    

    boolean is_valid(int color[],boolean graph[][])
    {
        int len=color.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(color[i]==color[j]&&graph[i][j])
                return false;
            }
        }
        return true;

    }
    static int  vert=4;
    boolean res_fn(boolean graph[][],int color[],int i,int len_color)
    {
        if(i==vert)
        {
            if(is_valid(color, graph))
            {
                System.out.println(color);
                return true;
            }
            
            return false;
        }

        for(int x=0;x<len_color;x++)
        {
            color[i]=x;
           if( res_fn( graph, color, i, len_color))
           return true;
           color[i]=0;
        }
        return false;
    }


    
    public static void main(String[] args) {

        m_coloring ob=new m_coloring();
        int size=3;
        
        boolean[][] graph = {
            { false, true, true, true },
            { true, false, true, false },
            { true, true, false, true },
            { true, false, true, false },
          };

          int color[]=new int[size];
          Arrays.fill(color, 0);

          boolean res=ob.res_fn(graph, color,0,3);

          System.out.println(res);

        
    }
}