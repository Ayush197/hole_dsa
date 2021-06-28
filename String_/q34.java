import java.util.*;
public class q34 
{
    static int r=3;
    static int c=3;
    static void prints(int i,int j, String st[][],String store[])
    {
        store[i]=st[i][j];

        if(i==c-1)
        {
            for(int k=0;k<r;k++)
            {
                System.out.print(store[k]+" ");
            }
            System.out.println();
                return;
           
         }
         for(int k=0;k<c;k++)
         {
             if(!st[i+1][k].equals("")&&i<c)
             prints(i+1, k, st,store);

         }
    }
    {
        
    }
    public static void main(String[] args) 
    {
        Scanner au=new Scanner (System.in);
        System.out.println("Enter the string");
        String st[][]={{"you", "we",""},
        {"have", "are",""},
        {"sleep", "eat", "drink"}};

        int m=st.length;
        int  n=st[0].length;
        System.out.println("m>>>> "+m);
        System.out.println(" n>>>>>> "+ n);
        
        String store[]=new String[r];

        //q34 ob=new q34();
    for(int i=0;i<c;i++)
    if(!st[0][i].equals(""))
    prints(0, i, st, store);


    
}
    
}
