import java.util.Scanner;

class q1
{
    public static void main(String[] args) 
    {
        try {
            
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();
            while(t>0)
            {
                int x=au.nextInt(),y=au.nextInt(),z=au.nextInt();
                int res=y+(100-x)*z;
                System.out.println((res*10));
                t--;
            }
            au.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}