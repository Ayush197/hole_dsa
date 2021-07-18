import java.util.*;

public class lru_cache 
{
    int size;
    LinkedHashMap<Integer,Integer> map;
    lru_cache(int size)
    { 
        this.size=size;
        map=new LinkedHashMap<Integer,Integer>(size,0.75f,true)
        {
           protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return map.size()>size;
            }
        };
        this.size=size;

    }
    void set(int key,int val)
    {
        map.put(key, val);
    }
    int get(int key)
    {
        return map.get(key);
    }

    public static void main(String[] args) {
        
        int size=10;
        lru_cache ob=new lru_cache(size);

        ob.set(2, 4);
        int res= ob.get(2);

        System.out.println(res);
    }
    

}
