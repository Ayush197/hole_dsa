import java.util.*;

class theodre
{
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        System.out.println("enter all ");
        int t=au.nextInt();
        while(t>0)
        {
            int rows=au.nextInt(),cols=au.nextInt(),n=au.nextInt();
            int r[]=new int[n];
            int c[]=new int[n];
            for(int i=0;i<n;i++)
            {
                r[i]=au.nextInt();
                c[i]=au.nextInt();
            }
            Arrays.sort(r);
            Arrays.sort(c);

            int max_r=r[0],max_c=c[0];
            for(int i=1;i<n;i++)
            {
                int temp_r=r[i]-r[i-1];
                int temp_c=c[i]-c[i-1];

                if(temp_r>max_r)
                max_r=temp_r;

                if(temp_c>max_c)
                max_c=temp_c;
            }
            System.out.println((max_c-1)*(max_r-1));


            t--;
        }
        au.close();
        
    }
}