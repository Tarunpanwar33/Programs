class Duplicacy 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{1,4,5,6,77,2,4,6};

		for (int i=0;i<arr.length ;i++ )
		{
		
           for (int j=1+i;j<arr.length ;j++ )
           {
			   if ((arr[i]==arr[j]))
			   {
				  System.out.println(arr[j]);
			   }
           }

		}
		
	}
}
