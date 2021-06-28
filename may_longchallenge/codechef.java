// don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
 public static void main (String[] args) throws java.lang.Exception
 {
     try {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[][]=new int[n][5];
  int k=1;
   int m=-1;
  for(int i=0;i<(n/2)+1;i++)
  {
     m=m+1;
      for(int j=0;j<5;j++)
        arr[m][j]=k++;
        
      if(m+1<n-1)
      {
      m=m+1;
      
      for(int r=4;r>=0;r--)
       arr[m][r]=k++;
  }
  }
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<5;j++)
  {
  System.out.print(arr[i][j]+" ");
  }
    System.out.println();
  }
      
   } catch(Exception e) {
     } 
     }// your code goes here
 }