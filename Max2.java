class Max2 
{
	public static void main(String[] args) 
	{
		int arr[]={21,4,66,89,121,2,5};
		int max=arr[0];
		for (int i=0;i<arr.length;i++ )
		{
			if (arr[i]=>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
