class Large2 
{
	public static void main(String[] args) 
	{
	  int arr[]={1,3,4,77,9,2};
       
	   int min=arr[0];

	  for (int i=0;i<arr.length ;i++ )
	  {
		  if (arr[i]<min)
		  {
			  min = arr[i];
		  }
	  }
	 	System.out.println("The greatest element are "+ min);
	}
}
