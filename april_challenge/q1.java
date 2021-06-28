import java.util.*;
class q1
{
    public static void main(String[] args) {
        try {
            Scanner au=new Scanner(System.in);
            int a=au.nextInt(),b=au.nextInt(),c=au.nextInt();

         
            String flag="no";
            if(a==b||b==c||c==a)
            flag="yes";

            System.out.println(flag);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}