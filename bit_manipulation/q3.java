import java.util.Scanner;

public class q3
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);
        System.out.println("enter the a and b");
        int a=au.nextInt(),b=au.nextInt();

        String x=Integer.toBinaryString(a),y=Integer.toBinaryString(b);
        int count=0;

        int i=0;
        while(i<x.length()&&i<y.length())
        {
            if(x.charAt(i)!=y.charAt(i))
            count+=1;

            i++;
        }
        System.out.println(count);

        au.close();
    }
    
}
