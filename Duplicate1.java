class Duplicate1
{
	public static void main(String[] args) 
	{
		int arr[]={1,5,8,2,7,15,16,17};
		int arr1[]={12,5,15,1,2,17};

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=1;j<arr1.length ;j++ )
			{
				if (arr[i]==arr1[j])
				{
					
					 System.out.println(arr1[j]);
                 
				}
				
			}
		     
		}
		
	}
}
