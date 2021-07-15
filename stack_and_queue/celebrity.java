package stack_and_queue;

import java.util.HashMap;

public class celebrity 
{
    void celeb(int ar[][],int n)
    {
       // HashMap<Integer,Integer> kn=new HashMap<>();
        HashMap<Integer,Integer> unk=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            if(ar[i][j]==1)
            {
                
                unk.put(i, j);
                //kn.put(j, j);
            }
        }
        for(int c:unk.values())
        {
            if(!unk.containsKey(c))
            {
            System.out.println(c);
            //unk.remove(c);
            }
        }

    }
    public static void main(String[] args) {
        
        celebrity ob=new celebrity();
        int n = 3;
        int ar[][] = {{0 ,1, 0},
         {0 ,0 ,0}, 
         {0 ,1, 0}};
         ob.celeb(ar, n);
    }
    
}
