class Merging 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{1,5,7,9,22,44};
		int arr1[] = new int[arr.length];

		for (int i=0;i<arr.length;i++ )
		{
			 System.out.println(arr[i]);
             arr1[i]=arr[i];
			  System.out.println(arr1[i]);

		}

		 System.out.println("The first element is :---");
		for (int i =0;i<arr.length ;i++ )
		{
			 System.out.println(arr[i]);
		}
		 System.out.println("The second element is :----");
		for (int j=0;j<arr1.length ;j++ )
		{
			 System.out.println(arr1[j]);
		}
	}
}
