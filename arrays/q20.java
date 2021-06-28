

import java.util.*;
class q20
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("Enter the the size x , y, z");
        
        int x=au.nextInt();
        int y=au.nextInt();
        int z=au.nextInt();
        
        
        int a[]=new int [x];        
        int b[]=new int [y];

        int c[]=new int [z];

        for(int i=0;i<x;i++)
        a[i]=au.nextInt();

        
        for(int i=0;i<y;i++)
        b[i]=au.nextInt();

        
        for(int i=0;i<z;i++)
        c[i]=au.nextInt();


        int p=0,q=0,r=0;
          
        while(p<x&&q<y&&r<z)
        {
            if(a[p]==b[q]&&b[q]==c[r])
            {
                System.out.print(a[p]+" ");
                p++;q++;r++;
            }
            else if(a[p]<b[q])
            p+=1;
            else if(b[q]<c[r])
            q+=1;
            else
            r+=1;
        }
    }
}