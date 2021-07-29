import java.util.Scanner;

class k_Swaps
{
    int idxOfmax(char st[], int idx)
    {
        int maxValue=Integer.MIN_VALUE,maxIndex=idx;
        for(int i=idx;i<st.length;i++)
        if(st[i]>maxValue)
        {
        maxValue=st[i];
        maxIndex=i;
        }

        return maxIndex;

    }
    void swap(char []st,int idx,int maxIndex)
    {
        char temp=st[idx];
        st[idx]=st[maxIndex];
        st[maxIndex]=temp;

    }
 
    char [] util(char st[],int idx,int noOfSwaps,int k)
    {
        if(noOfSwaps>k)
        return st;
        int maxIndex=idxOfmax(st, idx);
        swap(st, idx, maxIndex);
        return util(st, idx+1, noOfSwaps+1, k);
    }
    void print(char st[])
    {
        int len=st.length;
        for(int i=0;i<len;i++)
        System.out.print(st[i]+" ");
    }

    public static void main(String[] args) {
        
        System.out.println("Enter the string and the value of k");
        Scanner au=new Scanner(System.in);
        String st=au.next();
        int k=au.nextInt();
        k_Swaps ob=new k_Swaps();
        char res[]=ob.util(st.toCharArray(), 0, 0, k);
        ob.print(res);
       
    
        au.close();
    }
}