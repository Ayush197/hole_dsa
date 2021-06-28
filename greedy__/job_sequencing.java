import java.util.*;
class Job implements Comparable<Job>
    {
       char id;
       int deadline;
       int profit;
       public Job(char id,int deadline,int profit)
       {
           this.deadline=deadline;
           this.id=id;
           this.profit=profit;
       }
       @Override
       public int compareTo(Job a)
       {
           return a.profit-this.profit;
       }
    }
    
public class job_sequencing  
{
    List<Job> jobs;
    public job_sequencing(List<Job> jobs)
    {
        this.jobs=jobs;

    }
    
    void max_profit()
    {
        char ch[]=new char[5];
        int k;
        for(Job job:jobs)
        {
            System.out.println("deadline+"+job.deadline);
            k=job.deadline-1;
            while(k>=0&&ch[k]!='\0')
            {
                     k--;
            }
            if(k!=-1)
            {
            ch[k]=job.id;
            System.out.println("best order");
            }
            k=0;
            while(ch[k]!='\0')
            {
                System.out.print(ch[k]+" ");
                k++;
            }

        }


    }
    void display()
    {
        System.err.println("the  profit");
        for(Job job:jobs)
        {
            System.out.print(job.profit+" ");
        }
    }
}
class sed 
{
    public static void main(String[] args) 
    {
        List<Job> jobs= new ArrayList<>();
        jobs.add(new Job('w', 1, 19));
        jobs.add(new  Job('v', 2, 100));
        jobs.add(new Job('x', 2, 27));
        jobs.add(new Job('y', 1, 25));
        jobs.add(new Job('z', 3, 15));
        job_sequencing ob=new job_sequencing(jobs);

        Collections.sort(jobs);
        ob.max_profit();
        

    }
    
}
