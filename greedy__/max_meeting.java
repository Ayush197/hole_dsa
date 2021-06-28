import java.util.*;

 class meet implements Comparable<meet>
{
    int start,end,num;
     public meet(int start,int end,int num)
    {
        this.start=start;
        this.end=end;
        this.num=num;
    }
    public int compareTo(meet x)
    {
        return this.end-x.end;
    }

}
 public class max_meeting 
{
    static int func(Vector<meet> vec)
    {
        int i=1,j=0;
        int count_meeting=0;
        System.out.print(vec.get(0).num+" ");
        while(i<vec.size())
        {
            if(vec.get(j).end<vec.get(i).start)
            {
                j=i;
                count_meeting+=1;
                System.out.print(vec.get(i).num+" ");
            }
            i++;
        }
        System.out.println();
        return count_meeting+1;
    }

    
    public static void main(String[] args) 
    {

        int s[] = { 1, 3, 0, 5, 8, 5 };
     
        // Finish time
        int f[] = { 2, 4, 6, 7, 9, 9 };
        Vector<meet> pair=new Vector<>();
        for(int i=0;i<s.length;i++)
        {
            pair.add(new meet(s[i],f[i],i+1));
        } 
        pair.sort(null);
        
        for(int i=0;i<pair.size();i++)
        System.err.println(pair.get(i).start+"  >>> "+pair.get(i).end+" >>>>> "+pair.get(i).num);

        
        System.out.println(func(pair));


}
    
}
