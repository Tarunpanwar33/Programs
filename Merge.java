class Merge 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5};//1st array.

		System.out.println(arr.length);// cheak for the first array elements .

		int arr1[] =new int[arr.length]; // 1st array length copied into second array.


		for (int i=0 ;i<arr.length ;i++ )
		{
            arr1[i]=arr[i];//copied 1 array inside another array.
		}
    
        	System.out.println("The First array Elements ");

		for (int i=0;i<arr.length ;i++ )
		{
         System.out.println(arr[i]+" ");
		}

		System.out.println("The Second Array Elements ");

		for (int i=0;i<arr1.length;i++ )
		{
			System.out.println(arr1[i]+" ");
		}
	}
}
