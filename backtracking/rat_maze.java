import java.util.*;

class rat_maze
{
    boolean isvalid(int m[][],int row,int column,int n,boolean vis[][])
    {
        if(row==-1||column==-1||vis[row][column]||row==n||column==n||m[row][column]==0)
        return false;

        return true;
    }
    void printpath(int m[][],int n, int column,int row,boolean vis[][],Vector<String> vec,String path)
    {
        
        if(!isvalid(m, row, column, n, vis))
        return;

        if(row==n-1&&column==n-1)
        {
            vec.add(path);
        }

        vis[row][column]=true;

        if(isvalid(m, row+1, column, n, vis))
        {
            path+='D';
            printpath(m, n,column,row, vis, vec, path);
            path=path.substring(0,path.length()-1);
        }
        if(isvalid(m, row-1, column, n, vis))
        {
            path+='U';
            printpath(m, n,column,row, vis, vec, path);
            path=path.substring(0,path.length()-1);
        }
        if(isvalid(m, row, column+1, n, vis))
        {
            path+='R';
            printpath(m, n,column,row, vis, vec, path);
            path=path.substring(0,path.length()-1);
        }
        if(isvalid(m, row, column-1, n, vis))
        {
            path+='L';
            printpath(m, n,column,row, vis, vec, path);
            path=path.substring(0,path.length()-1);
        }
        vis[row][column]=false;



    }

    public static void main(String[] args) 
    {
        int n=4;
      boolean vis[][]=new boolean[n][n];
      int m[][] = { { 1, 0, 0, 0, 0 },
      { 1, 1, 1, 1, 1 },
      { 1, 1, 1, 0, 1 },
      { 0, 0, 0, 0, 1 },
      { 0, 0, 0, 0, 1 } };
      Vector<String> vec=new Vector<>();
      
      rat_maze ob=new rat_maze();
      ob.printpath(m, n, 0, 0, vis, vec, "");

       for(int i=0;i<vec.size();i++)
       System.out.println(vec.get(i));

      
    }
}