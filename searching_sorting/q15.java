public class q15
{
    public static void main(String[] args)
     {
        int N = 4, M = 5;
       int x[] = {1, 3, 5, 7};
    int  y[] = {0, 2, 6, 8, 9};


    int count=0;
    int i=0,j=0;

    int res[]=new int[N+M];

    while(i<N&&j<M)
    {
        if(x[i]<y[j])
        {
        res[count]=x[i];
        i+=1;
        
        }
        else
        {
        res[count]=y[j];
        j+=1;
        }

        count+=1;

    }
    while(i<N)
    res[count++]=x[i++];

    while(j<M)
    res[count++]=y[j++];

    for(int f=0;f<N+M;f++)
    System.out.println(res[f]+" ");

    
        
    }

}
    

