class Exchange  
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6};
		int arr1[]=new int[arr.length];

		for (int i=0;i<arr.length ;i++ )
		{
			arr1[i]=arr[i];
		}

		for (int i=0;i<arr.length ;i++ )
		{
            System.out.println("The elements present inside array are :--"+arr[i]);
		}

		for (int i=0;i<arr1.length ;i++ )
		{

        System.out.println("The elements exchanging inside second array:---"+ arr1[i]);
		
		}
		
	}
}
