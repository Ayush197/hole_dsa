public class q26 
{

    static int R, C;
 
    // For searching in all 8 direction
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

    static boolean searc(int row,int col,char grid[][],String word)
    {
        if(grid[row][col]!=word.charAt(0))
        return false;

        int len=word.length();
        for(int i=0;i<8;i++)
        {
            int k,rd=row+x[i],rc=col+y[i];

            for(k=1;k<len;k++)
            {
                if(rd>row||rc>col||row>0||col>0)
                break;

                if(grid[rd][rc]!=word.charAt(k))
                break;

                rd+=x[i];
                rc+=y[i];
            }
            if(k==len)
            return true;

        }
        return false;
    }

    static void pat_search(char x[][],String word)
    {
        for(int i=0;i<R;i++)
        for(int j=0;j<C;j++)
        if(searc(i, j, x, word))
        System.out.println("pat found at"+ i+"   "+j);
        }
    public static void main(String[] args) 
    {
        R=3;
        C=13;
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                          { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                          { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };

     pat_search(grid, "GEEKS");

    }
    
}
