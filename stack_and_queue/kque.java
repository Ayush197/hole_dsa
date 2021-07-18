import java.util.*;
public class kque 
{
    int ar[],free,next[],front[],rear[];
    int k,size;

    kque(int k,int size)
    {
        this.k=k;
        this.size=size;

        ar=new int[size];//storing the element
        next=new int[size];//for storing the next indices of front and rear
        front=new int[k];//for storing the indices of front
        rear=new int[k];//for storing the indices of rear
    
     free=0;
     //initializing them with -1 to mark empty
    Arrays.fill(front,-1);
    Arrays.fill(rear,-1);

    //initializing 'next' array with 1 to size-1 and -1 at the last.
    for(int i=0;i<size;i++)
    {
        next[i]=i+1;
    }
    next[size-1]=-1;

    }
    //checking underflow if front is -1 at  k queue 
    boolean underflow(int k)
    {
        return front[k]==-1;
    }
    //checking overflow if free is -1
    boolean overflow(int k)
    {
        return free==-1;
    }
    void enqueue(int k,int val)
    {
        if(overflow(k))
        {
            System.out.println("overflow");
            return;
        }

        int next_free=next[free];

        if(underflow(k))
        {
            rear[k]=front[k]=free;
        }
        else
        {
            next[rear[k]]=free;
            rear[k]=free;
        }
        next[free]=-1;

        ar[free]=val;

        free=next_free;



    }
    int poll(int k)
    {
        if(underflow(k))
        {
            System.out.println("underflow");
            return -1;
        }

        int front_idx=front[k];
        front[k]=next[front_idx];

        next[front_idx]=free;
        free= front_idx;

        return ar[front_idx];



    }
    public static void main(String[] args) 
    {
        //create a object of kque and called the above methods

        
    }
    
}
