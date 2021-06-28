class activity_selection
{
    static int jobs_done(int x[],int y[],int n)
    {
        int res=1,j=0;
        for(int i=1;i<n;i++)
        {
        
                if(y[j]<=x[i])
                {
                res++;
                j=i;
                }
            
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int N = 6;
        int S[] = {1,3,0,5,8,5};
        int F[] = {2,4,6,7,9,9};

        System.out.println("the no of meeetings can be held");
        System.out.println(jobs_done(S, F, N));


        
    }
}