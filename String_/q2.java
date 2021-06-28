import java.util.*;
public class q2
{
    public static void main(String[] args) {
        Scanner au=new Scanner(System.in);

        System.out.println("Enter the string");
        String x=au.next();
        
        String rev="";

        for(int i=0;i<x.length();i++)
        {
          rev=x.charAt(i)+rev;
        }
        System.out.println(rev.equals(x));
    }
}