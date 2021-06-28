import java.util.*;
import java.util.stream.Collectors;

public class q24 
{
    public static void main(String[] args)
     {
         Scanner au=new Scanner(System.in);
         //System.out.println("Enter the string");
        // String st[]=au.nextLine();

       String  arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa","aaa"};

       int len=arr.length;
       Map <String,Integer> map =new HashMap<>();


       List <Integer> list=new LinkedList<>();
       int count=0;

       for(int i=0;i<len;i++)
       {
           String cur=arr[i];
           if(map.containsKey(cur))
           map.put(cur,map.get(cur)+1);
           else
           map.put(cur,1);
       }
       
       Map result = map.entrySet().stream()
    .sorted(Map.Entry.comparingByKey()) 			
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    
    System.out.println(result);

    TreeMap<Integer,String> fin=new TreeMap<>();

    for(String st:map.keySet())
    {
        fin.put(map.get(st),st);
    }
    System.out.println("map >>>"+map);
    System.out.println("final map >>> "+fin);

    String x=fin.size()<2?fin.get(fin.keySet().toArray()[fin.size()-1]):
    fin.get(fin.keySet().toArray()[fin.size()-2]);
    System.out.println("the second most freq. word >>>> "+x);

       
/*
       for(int i=0;i<len;i++)
       {
       for(int j=i+1;j<len;j++)
       {
           if(arr[i].equals(arr[j]))
           count+=1;
       }
       list.add(count);
    }
    Collections.sort(list);
    
*/
        
        
        
    }
    
}
