import java.util.*;

public class cut_board 
{
    static int minimum_cost(Integer x[], Integer y[])
    {
        int i=0,j=0;

        int res=0,horiz=1,verti=1;
        while(i<x.length&&j<y.length)
        {
            //including the higher one first to obtain minimum cost,, more early the
            //the element comes less it will cost
            if(x[i]>y[j])
            {
                //multiplying the already traversed the vertices 
              res+=x[i]*verti;
              i+=1;
              horiz+=1;  
            }
            else
            {
                res+=y[j]*horiz;
                j+=1;
                verti+=1;
            }
            
       


        }
        //System.out.println(res);
        int rem=0;
        while(i<x.length)
        rem+=x[i++];
        res+=rem*verti;
        rem=0;
        while(j<y.length)
        rem+=y[j++];

        res+=rem*horiz;
    
        return res;


    }
    public static void main(String[] args) 
    {
       // int m = 6, n = 4;
        Integer X[] = {2, 1, 3, 1, 4};
        Integer Y[] = {4, 1, 2};
        // sorting both the arrays in reverse order
        Arrays.sort(X,Collections.reverseOrder());Arrays.sort(Y,Collections.reverseOrder());
        System.out.println(minimum_cost(X, Y));
        
    }
    
}
