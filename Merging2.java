class Merging2 
{
	public static void main(String[] args) 
	{
		int arr[]={111,33,14,5,77,9};

		int temp = 0;

		for (int k=0;k<arr.length ;k++ )
		{
			System.out.println("The original elements of array are "+arr[k]);
		}

        System.out.println("--------------------------------");

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr.length ;j++ )
			{
				if (arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
 
				}
			}
		}
		for (int i=0;i<arr.length ;i++ )
		{
            System.out.println("The shorted elements are:--> "+arr[i]);
		}
		
	}
}
