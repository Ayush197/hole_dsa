public class q10
 {
     public static void main(String[] args) 
     {
       int  N = 78;
        int arr[] = {5, 20, 3, 2, 5, 80};

        int a=0,b=0;

        for(int i=0;i<arr.length;i++)
        for(int j=i+1;j<arr.length;j++)
        {
            if(Math.abs(arr[i]-arr[j])==N)
            {
                a=arr[i];
                b=arr[j];
            }
        }
        System.out.println(a+" , "+b);


         
     }
    
}
