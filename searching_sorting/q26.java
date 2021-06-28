import java.util.*;

class jobs
{
    int a,b,c;
    jobs(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
class jobcomparator implements Comparator<jobs>
{
   public int compare(jobs x,jobs y)
   {
       return (x.b<y.b)?-1:x.b==y.b?0:1;
   }
}


   
  public class q26
   {
       static int binarysearch(jobs job[],int idx)
       {
         int low=0,high=idx-1;

         while(low<=high)
         {
             int mid=(low+high)/2;
             if(job[mid].b<=job[idx].a)
             {
                 if(job[mid+1].b<=job[idx].a)
                 low=mid+1;
                 else
                 return mid;
             }
             else
             high=mid-1;
         }

         return -1;
       }

   
  static int schedule(jobs job[])
   {
       Arrays.sort(job,new jobcomparator());

       int gains[]=new int[job.length];

       gains[0]=job[0].c;
       for(int i=1;i<job.length;i++)
       {
           int curr_gains=job[i].c;
           int after_gains=binarysearch(job, i);
           if(after_gains!=-1)
           curr_gains+=gains[after_gains];

           gains[i]=Math.max(curr_gains, gains[i-1]);
       }
    
       return gains[job.length-1];
   }



    public static void main(String[] args) 
    {
        jobs job[] = {new jobs(1, 2, 50), new jobs(3, 5, 20),
            new jobs(6, 19, 100), new jobs(2, 100, 200)};

            
            

System.out.println("Optimal profit is "+ schedule(job));
        }

        
    }
    

