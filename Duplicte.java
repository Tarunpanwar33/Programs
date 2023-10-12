class Duplicate 
{
	public static void main(String[] args) 
	{
		int arr=[]={1,3,5,9,6,1,5,33,9}
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr.length ;j++ )
			{
				if ((arr[i]=arr[j])  && (i!=j))
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
