public class min_platform 
{
    public static void main(String[] args) 
    {
        int n = 6 ;
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int count=0;
        for(int i=0;i<n;i++)
        {
            int d=dep[i];
            for(int j=i+1;j<n;j++)
            if(d<arr[j])
            count+=1;
        }
        System.out.println(count);
        
    }
    
}
