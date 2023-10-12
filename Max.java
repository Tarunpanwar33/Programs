class Max 
{
	public static void main(String[] args) 
	{
		int arr[]={21,55,2,12,666,1,7};

		int max=arr[0];
		for (int i=0;i<arr.length ; i++)
		{
			if (arr[i]>max)
			{
              max=arr[i];
			}
		}
		System.out.println("The maximum no of array is>>"+ max);
	}
}
