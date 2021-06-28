import java.util.*;
class q2
{
    public static void main(String[] args) {
        try {
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();

            while(t>0)
            {
                double a=au.nextDouble(),b=au.nextDouble(),c=au.nextDouble(),d=au.nextDouble();
                double fact=a*b*c*d;
                double res=Math.round(((100*1.0)/fact)*100)/100.0;
                String flag="NO";
                System.out.println(res);
                if(res<9.58)
                flag="YES";
                System.out.println(flag);
                t--;
            }

        
        } catch (Exception e) {
            //TODO: handle exception
        }
            
    }
}