class Even2 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6};

		for (int i=0;i<arr.length ;i++ )
		{
           		System.out.println("The elements of array is "+arr[i]);
		}
		for (int j=1;j<arr.length ;j=j+2 )
		{
               System.out.println("Even array "+arr[j]);
		}
		
	}
}
