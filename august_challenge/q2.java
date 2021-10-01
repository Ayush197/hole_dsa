import java.util.Scanner;

class q2
{
    public static void main(String[] args) {
        
        try {
            
            Scanner au=new Scanner(System.in);
            int t=au.nextInt();

            while(t>0)
            {
                int a=au.nextInt(),b=au.nextInt(),c=au.nextInt(),d=au.nextInt();

                int count=0;

                if(a!=b&&a!=c&&a!=d)
                count+=1;

               // if(b!=c)
                //count+=1;

                if(c!=d&&c!=a&c!=a)
                count+=1;

                //if(a!=d)
                //count+=1;
                
                System.out.println(count);
                t--;
            }
            au.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}