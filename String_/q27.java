import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.InflaterOutputStream;

public class q27 
{
    static int internal(String ned,int row,int col,String hay[],int row_max,int col_max,int xx)
    {
        int found=0;
        if(row>=0&&row<=row_max&&col>=0&&col_max>=row&&ned.charAt(xx)==hay[row][col])
        {
            
        }
    }
    static int search(String ned,int row,int col,int row_count,int col_count,String st[])
    {
        int found=0,r,c;
        for(r=0;r<row_count;r++)
        {
            for( c=0;c<col_count;c++)
            found+=
        }
    }
    public static void main(String[] args)
     {
        String needle = "MAGIC";
        String input[] = { "BBABBM",
                           "CBMBBA",
                           "IBABBG",
                           "GOZBBI",
                           "ABBBBC",
                           "MCIGAM" };

             
        String st[]=new String[input.length];
        st=Arrays.copyOf(input,input.length);   


    }
    
}
