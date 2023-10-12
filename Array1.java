class Array1 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{1,14,55,66,21,52};
		int arr1[]=new int [arr.length];

		for (int i=0;i<arr.length;i++ )
		{
			System.out.println(arr[i]);

            arr1[i]=arr[i];
		}
        
		   System.out.println("1st array elements ");

		for (int i=0;i<arr.length ;i++ )
		{
           System.out.println(arr[i]);
		}

		System.out.println("Copied array elements ");

		for (int i=0;i<arr1.length ;i++ )
		{
			System.out.println(arr1[i]);
		}
		
	}
}
