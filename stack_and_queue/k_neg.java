class k_neg
{
    void first_neg(int ar[])
    {
        int len=ar.length;

        int val;
        for(int i=0;i<len-1;i++)
        {
            val=0;
            for(int j=i;j<=i+1;j++)
            if(ar[j]<0)
            {
               val=ar[j];
               break;
            }
            System.out.println(val);

        }
    }
    public static void main(String[] args) {
        
        int ar[]={-8, 2, 3, -6, 10};
        k_neg ob=new k_neg();

        ob.first_neg(ar);

    }
}