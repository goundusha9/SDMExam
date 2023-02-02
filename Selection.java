package GitWork;

class Selection
{
  public static void selection(int arr1[])
  {
	  int n=arr1.length;
	  int temp;
	  for(int i=0;i<n-1;i++)
	    {
		  int minIndex=i;
		  for(int j=i+1;j<n;j++)
		   {
			  if(arr1[j]<arr1[minIndex])
			  {
				 minIndex=j;
			  }
		  }
	     temp=arr1[i];
		 arr1[i]=arr1[minIndex];
		 arr1[minIndex]=temp;
		 
	  }
     for(int i=0;i<n;i++)
	 {
		 System.out.println(arr1[i]);
	 }
  }
public static void main(String[] args)
	 {
		int arr1[]={64,25,12,22,11};
		selection(arr1);
	 }
}