import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class q7 
{
    static ArrayList<ArrayList<Integer>> vec=new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> r=new ArrayList<>();
    static ArrayList<Integer> q=new ArrayList<>();
    static int m=(int)Math.pow(10, 9)+7;
    public static void dfs(int curr,int p )
    {
        
        q.add(curr, 1);
        r.add(curr, 1);

        int sum=0,count=0;
        for(int i=0;i<vec.get(curr).size();i++)
        {
            int nod=vec.get(curr).get(i);
            if(nod!=p)
            {
                dfs(nod, curr);
                r.add(curr,r.get(curr)+(2*r.get(nod)%m));
                r.add(curr,r.get(curr)%m);
                count+=1;
                q.add(curr,q.get(curr)+q.get(nod));
                q.add(curr,q.get(curr)+q.get(curr)%m);
                q.add(curr,r.get(nod));
                q.add(curr,q.get(curr)%m);
                sum+=r.get(nod);

            }
        }
        for(int i=0;i<vec.get(curr).size();i++)
        {
            int node=vec.get(curr).get(i);
            if(node!=p)
            {
                q.add(curr,q.get(curr)+(r.get(node)*((sum-r.get(node))+m)%m)%m);
                q.add(curr,q.get(curr)%m);
            }
        }
    }
    public static void main(String[] args) 
    {
        try {
            
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            



            while(t>0)
            {
                int n=au.nextInt();
               
                for(int i=0;i<n;i++)
                {
                    int x=au.nextInt(),y=au.nextInt();
                    vec.get(x).add(y);
                    vec.get(y).add(x);
                }
                dfs(1, 1);
                System.out.println(q.get(1)%m);
                vec.clear();
                r.clear();
                q.clear();
                vec.ensureCapacity(n+1);
                r.ensureCapacity(n+1);
                q.ensureCapacity(n+1);

                t--;
            }
            au.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
}
