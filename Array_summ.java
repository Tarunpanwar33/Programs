class Array_summ 
{
	public static void main(String[] args) 
	{
		int arr[]={1,7,4,6,88,100};
		
		int num = 1;

        for (int i=0;i<arr.length ;i++ )
        {
			num = num+arr[i];
        }
		System.out.println("The Total Sum Of Array is "+num);
	}
}
