import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class min_coin 
{

    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the amount");
        int val=au.nextInt();
        int store[]={20,10,5,3,2,1};

        int i=0;
        List<Integer> list=new LinkedList<>();
        while(i<store.length)
        {
            while(store[i]<=val&&val>0)
            {
                list.add(store[i]);
                val-=store[i];
                if(val==0)
                break;
                
            }
            
            i++;
        }
        System.out.println(list);
        au.close();
        
    }
}
