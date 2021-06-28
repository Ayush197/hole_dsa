import java.util.*;

public class q20
 {
     public static void main(String[] args) {
         Scanner au=new Scanner(System.in);

         int t=au.nextInt();
         while(t>0)
         {
             int a=au.nextInt(),b=au.nextInt();
             int x[][]=new int[a][2];
             for(int i=0;i<a;i++)
             for(int j=0;j<2;j++)
             x[i][j]=au.nextInt();
             List <Integer> list=new LinkedList<>();

             for(int i=0;i<a;i++)
             {
                 int low=x[i][0],high=x[i][1];

                 while(low<=high)
                 {
                     list.add(low++);
                 }
             System.out.println("here you go");
             for(int v=0;v<b;v++)
             {
                 int ch=au.nextInt();

                 if(ch>high)
                 System.out.println("-1");
                 else
                 System.out.println(list.get(ch-1));
             }
            }

             t--;

         }
         au.close();
     }
    
}
