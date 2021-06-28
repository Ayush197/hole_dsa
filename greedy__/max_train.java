import java.util.Scanner;

public class max_train 
{
    
    static int train_stop(int x[][],int m,int n)
    {
        int count_train=0;
        for(int i=0;i<m;i++)
        {
            //int start=x[i][0];
            int end=x[i][1];
            //int platform=x[i][2];
            for(int j=i+1;j<m;j++)
            {
                if(x[j][1]<end)
                {
                    end=x[j][1];
                    count_train+=1;
                }
            }
        }
        return count_train;
    }
    public static void main(String[] args) 
    {
        Scanner au=new Scanner(System.in);
        
        int  arr[][] = { {1000, 1030, 1},
                          {1010, 1020, 1},
            {1025, 1040, 1},
            {1130, 1145, 2},
            {1130, 1140, 2}};
            

           System.out.println(train_stop(arr, 5, 3)+1);

        au.close();
        
    }
    
}
