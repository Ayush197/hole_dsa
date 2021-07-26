import java.util.Scanner;

public class subset_sum {

    //checking whether the subset can be found 
    void valid_sub(int ar[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=ar[i];

        //checking if the sum is odd,  thus if true, subset can't be found
        if(sum%2!=0)
        System.out.println("No subset found");
        else
        {
            //will check for the subset, if distinct subset adds up to
            //half of sum
            System.out.println("subset found ? " +get_subset(ar, n, sum/2));

        }



    }
    //checking subset for the even 'sum' of element in the array 
    boolean get_subset(int ar[],int n, int sum)
    {
        //base case
        if(sum==0)
        return true;

        // all elements are traversed and sum is still not zero ,
        //thus return zero 
        if(sum!=0&&n==0)
        return false;

        //if last element is greater than the half
        if(ar[n-1]>sum)
        get_subset(ar, n-1, sum);

        //check with last elmenent or or without it.
        return get_subset(ar, n-1, sum)||get_subset(ar, n-1, sum-ar[n-1]);
    
    }

    
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner au=new Scanner(System.in);
        int n=au.nextInt();

        int ar[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        ar[i]=au.nextInt();

        subset_sum ob=new subset_sum();

        ob.valid_sub(ar, n);

        au.close();
    }
}
