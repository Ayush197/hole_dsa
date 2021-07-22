
import java.util.Vector;

class n_queen
{
    class queen
    {
      boolean col[],left_diagonal[],right_diagonal[];
      int size;
      Vector<Vector<Integer>> vec;
      Vector<Integer> list=new Vector<>();
      

      queen(int n)
      {
         size=n;
         col=new boolean[2*n];
         left_diagonal=new boolean[2*n];
         right_diagonal=new boolean[2*n];
         vec=new Vector<>();
         for(int i=0;i<size;i++)
         list.add(0);
         

      }
      Vector<Vector<Integer>> do_something(int row)
      {
         if(row==size)
         {
            vec.add(new Vector<>(list));
            return vec;
         }
         for(int cols=0;cols<size;cols++)
         {
            //checking if the queen is already present at the index or in the diagonals and if found
            //skip that index and check for another one
            if(col[cols]||left_diagonal[row+cols]||right_diagonal[row-cols+size])
            continue;

            //queen can be placed here and marked true
            col[cols]=left_diagonal[row+cols]=right_diagonal[row-cols+size]=true;
            //set row+1 {0+1} at cols
            list.set(cols, row+1);
            //recur and chekc for another rows
            do_something(row+1);
            //back progate and marked the placed queen as false
            col[cols]=left_diagonal[row+cols]=right_diagonal[row-cols+size]=false;
         } 
         return vec;

         
      }

    }
    public static void main(String[] args) 
    {
       n_queen ob=new n_queen();

       int n=4;
       queen q=ob.new queen(n);

       Vector<Vector<Integer>> vec=q.do_something(0);

       for (Vector<Integer> v: vec)
       {
          for(int i=0;i<v.size();i++)
          System.out.print(v.get(i)+" ");

          System.out.println();
       }
        
        
    }
}