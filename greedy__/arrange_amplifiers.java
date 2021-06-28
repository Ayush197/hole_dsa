import java.util.*;

public class arrange_amplifiers 
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the no. of amplifiers");
        int n=au.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            int a=au.nextInt();
            list.add(a);
        }
        Collections.sort(list);
        boolean flag=(list.size()>2)?true:false;
        if(flag&&list.get(n-1)==3&&list.get(n-2)==2&&list.get(n-3)==1)
            System.out.println(list);

        else if (!flag&&list.get(n-1)==3&&list.get(n-2)==2)
            System.out.println(list);
        else
        {
            int idx=0;
        for(int i=0;i<n;i++)
        { 
           if(list.get(i)>1)
           {
           idx=i;
           break;
           }
           
           System.out.print(list.get(i)+" ");
        }
        Collections.reverse(list.subList(idx, list.size()));
        System.out.println(list+" here is the fuck");
       }

    

        
        
    }
   
}

