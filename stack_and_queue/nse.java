import java.util.Arrays;

class nse
{

    void next_shortest(int ar[])
    {
        int len=ar.length;
        int next;
        for(int i=len-1;i>=0;i--)
        {
            next=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(ar[j]<ar[i])
                {
                    next=ar[j];
                    break;
                }
            }
            System.out.println(ar[i]+" --->>> "+next);
        }
    }
    public static void main(String[] args) 
    {
        int ar[]={ 11, 13, 21, 3 };
        Arrays.sort(ar);
        nse ob =new nse();
        ob.next_shortest(ar);

        
    }
}