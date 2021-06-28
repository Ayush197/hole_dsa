import java.util.*;
class q3
{
    static int search(int x[],int k)
    {
        int start=0,end=x.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(x[mid]==k)
            return mid;

            if(x[mid]<k)
            start=mid+1;
            else
            end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the size of array and target");
        int n=au.nextInt(),target=au.nextInt();
        System.out.println("enter the array");

        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=au.nextInt();

        int res=search(x, target);

        System.out.println(res);
    }
}