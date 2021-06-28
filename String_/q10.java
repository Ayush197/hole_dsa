import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class q10 
{
    public static void main(String[] args)
     {
       
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=au.next();
        int count=0;
        List <Integer> list=new LinkedList<>();
        for(int i=0;i<st.length()-1;i++)
        {
            if(st.charAt(i)==st.charAt(i+1))
            count+=1;
            else
            {
                list.add(count+1);
                count=0;

            }
        }
        list.add(count);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));

        au.close();
    }
    
}
