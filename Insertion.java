package GitWork;

class Insertion
{
  public static void insertion(int arr1[])
  {
	  int n=arr1.length;
	  int temp;
	  int j;
     for(int i=1;i<n;i++)//0th element already sorted
	 {
		 temp=arr1[i];//unsorted arrays 1st element 
		 for(j=i-1;j>=0;j--)
		 {
			 if(arr1[j]>temp)
			 {
				 arr1[j+1]=arr1[j];
			 }
			 else
			 {
				 break;
			 };
		 }
	 arr1[j+1]=temp;
	 }	  
	  
     for(int i=0;i<n;i++)
	 {
		 System.out.println(arr1[i]);
	 }
  }
public static void main(String[] args)
	 {
		int arr1[]={64,25,12,22,11};
		//int arr1[]={1,2,3,4,5};
		insertion(arr1);
	 }
}