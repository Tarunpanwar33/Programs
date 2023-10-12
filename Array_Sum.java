class Array_Sum 
{
	public static void main(String[] args) 
	{
		int arr[]={1,4,6,8,9};
		int num =0;

		for (int i=0;i<arr.length ;i++ )
		{
			num = num+arr[i];
		}
		System.out.println(num);
	}
}
