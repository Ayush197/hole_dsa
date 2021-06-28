import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

class q4
{
    static int find_route(HashMap<Integer,Integer> map,int val)
    {
        
             int res=Integer.MAX_VALUE;
            
              System.out.println("hellllo bitch");
            if(map.containsKey(1)||map.containsKey(2))
            {
                res= Math.abs(map.get(1)-val);
                return res= Math.min(res, Math.abs(map.get(2)-val));
            }
            else if(val==1)
            return -1;   
            else
            return -1; 
        

        
        
    }
    public static void main(String[] args)
     {
         try {
             
            Scanner au=new Scanner(System.in);
            PrintWriter out=new PrintWriter(System.out);
            
            int t=au.nextInt();
            while(t>0)
            {
                HashMap<Integer,Integer> map=new HashMap<>();
                 Vector<Integer> vec=new Vector<>();
                int n=au.nextInt(),y=au.nextInt();
                for(int i=0;i<n;i++)
                {
                    int val=au.nextInt();
                    map.put(val, i+1);
                }
                //System.out.println("Map"+map);
                for(int i=0;i<y;i++)
                {
                    int val=au.nextInt();
                    vec.add(val);
                
                }
                for(int i=0;i<y;i++)
                {
                    int res=-1;
                   int  val=vec.get(i);
                    if(map.containsKey(1)||map.containsKey(2))
                     {
                     res= Math.abs(map.get(1)-val);
                     res= Math.min(res, Math.abs(map.get(2)-val));
                     }
                     else if(vec.get(i)==1)
                    res=1;   
                    out.println(res);
     
                    //out.println(find_route(map, vec.get(i)));
                    out.flush();
                }
                map.clear();
              
                



                t--;
            }
            au.close();
         } catch (Exception e) {
             //TODO: handle exception
         }
        
    }
}