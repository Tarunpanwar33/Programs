class Max1 
{
	public static void main(String[] args) 
	{
		int arr[]={1,4,7,9,343,12,44};
		int max=arr[0];  
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}

		}
		System.out.println("The Maximum No of Array is:---"+max);
	}
}
