import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class wtf
{
    static boolean dp[][][];
     static ArrayList<Integer> res,orig;
    static int size;

    static boolean isValid(int idx,int sum,int size)
    {
        if(size==0)
        return sum==0;
        if(idx>=size)
        return false;

        if(!dp[idx][sum][size])
        return false;

        if(sum>=orig.get(idx))
        {
            System.out.println(res+"fddfd");
            res.add(orig.get(idx));
            if(isValid(idx+1, sum-orig.get(idx), size-1))
            return dp[idx][sum][size]=true;

            res.remove(res.size()-1);

        }


        if(isValid(idx+1, sum, size))
        return dp[idx][sum][size]=true;

        return false;
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> val)
    {
        Collections.sort(val);
        res=new ArrayList<>();
     size=val.size();
    ArrayList<ArrayList<Integer>> fin_res=new ArrayList<ArrayList<Integer>>();
    int total_sum=0;
    for(int i:val)
    {
        total_sum+=i;
    }
    
    dp=new boolean[size][total_sum+1][size];
    for(int i=0;i<size;i++)
    for(int j=0;j<total_sum+1;j++)
    for(int k=0;k<size;k++)
    dp[i][j][k]=true;

    orig=new ArrayList<>(val);
    System.out.println(orig);


    for(int i=1;i<size;i++)
    {
        int rem=(total_sum*i)%size;
        if(rem==0)
        {
            System.out.println("ent3ered");

            int setOne=(total_sum*i)/size;
            System.out.println(res);

            if(isValid(0, setOne, i))
            {
                int ptr1=0,ptr2=0;
                System.out.println("entered");
                
                
                ArrayList<Integer> res1=new ArrayList<>(res);
                ArrayList<Integer> res2=new ArrayList<>();
                while(ptr1<size||ptr2<res.size())
                {
                    if(ptr2<res.size()&&res.get(ptr2)==val.get(ptr2))
                    {
                        ptr1+=1;
                        ptr2+=1;
                        continue;
                    }
                    res2.add(val.get(ptr1));
                    ptr1+=1;
                }

                fin_res.add(res1);
                fin_res.add(res2);
                return fin_res;
                
            }
        }
    }
    return fin_res;

    

}
public static void main(String[] args)
 {
     Scanner au=new Scanner(System.in);
     System.out.println("Enter the size and  numbers");
     int n=au.nextInt();

     ArrayList<Integer> val=new ArrayList<>();
     for(int i=0;i<n;i++)
     {
         int getVal=au.nextInt();
         val.add(getVal);
     }
     ArrayList<ArrayList<Integer>> fin_res=new ArrayList<ArrayList<Integer>>();
     fin_res=solve(val);
     System.out.println(fin_res);
     au.close();
    
}
}