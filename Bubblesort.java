package GitWork;

import MyPack.SDMExam;

class Bubble
{
  public static void Bubble(int arr1[])
  {
	  int n=arr1.length;
	  int temp;
	   boolean sorted=false; 
	    for(int i=1;i<n;i++)
		  {   
			  for(int j=0;j<n-i;j++)
			  {
				  if(arr1[j]>arr1[j+1])
				  {
					  temp=arr1[j];
					  arr1[j]=arr1[j+1];
					  arr1[j+1]=temp;
					  sorted=true;
				  }
              			 
			 }
		     
		  }
	    if(sorted==false)
			 {
				 System.out.print("Array is already Sorted");
			 }
     for(int i=0;i<n;i++)
	 {
		 System.out.println(arr1[i]);
	 }
  }
public static void main(String[] args)
	 {
		int arr1[]={64,25,12,22,11};
		
		Bubble(arr1);
	 }
}