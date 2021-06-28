import java.util.Scanner;

public class q22 
{
    public static void main(String[] args) {
        
        Scanner au=new Scanner (System.in);
        System.err.println("enter the arrays");
        int x[] = {2, 3, 6, 7, 9},
y[] = {1, 4, 8, 10},
k = 5;

    int len=x.length+y.length;
    int z[]=new int[len];

    int count=0,i=0,j=0;
    while(i<x.length&&j< y.length)
    {
        if(x[i]<y[j])
        z[count++]=x[i++];
        else
        z[count++]=y[j++];
    }

    while(i<x.length)
    z[count++]=x[i++];
    while(j<y.length)
    z[count++]=y[j++];

    System.err.println(z[k-1]);



        au.close();
    }
    
}
