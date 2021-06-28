public class q18
{
    static int  countbits(int x)
    {
        int count=0;
        while(x>0)
        {
            if((x&1)>0)
            count+=1;
             x=x>>1;
        }
        return count;

    }

    static void insertion(int a[],int z[],int  n)
    {

        for(int i=1;i<n;i++)
        {
        int k1=a[i],k2=z[i];

        int j=i-1;
        while(j>=0&&z[j]<k2)
        {
            z[j+1]=z[j];
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=k1;
        z[j+1]=k2;
        }
    }
    
    static void sort(int arr[])
    {
        int len=arr.length;

        int store[]=new int[len];

        for(int i=0;i<len;i++)
        store[i]=countbits(arr[i]);

        insertion(arr,store, len);
        
    }
    static void print(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        System.out.println(ar[i]+" ");
    }
    public static void main(String[] args)
     {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        sort(arr);
        print(arr);
        
    }
    
}
