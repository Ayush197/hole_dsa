public class q21 
{
    int pivot(int x[],int low,int high,int lower,int higher)
    {
        int mid=low+(high-low)/2;

        if(mid==lower)
        {
            if(mid==higher)
            return mid;
            else if(x[mid]>=x[mid+1])
            return mid; 
        }
        else if(mid==higher)
        {
            if(x[mid]>=x[mid-1])
            return mid;
            else if(x[mid]>=x[mid-1]&&x[mid]>=x[mid+1])
            return mid;
            else if(x[mid]>x[high])
            return pivot(x, mid+1, high, lower, higher);
            else if(x[mid]<x[high])
            return pivot(x, low, mid-1, lower, higher);

        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
    
}
