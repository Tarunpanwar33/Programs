class Evenodd 
{
	public static void main(String[] args) 
	{
		int arr[]={1,5,7,2,8};
		int evenindex = 0;
		int oddindex = 0;
       
	    for (int i=0;i<arr.length ;i++ )
	    {
			if (arr[i]%2==0)
			{
             System.out.println("The even number is :>"+ arr[i]);
			evenindex++;
			}

             else{
					System.out.println("The odd number is"+arr[i]);
					oddindex++;
             }

		}

		int arr1[] = new int[evenindex];
		int arr2[] = new int[oddindex];

		int evenseries=0;
		int oddseries = 0;

		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
			 
			 arr1[evenseries]=arr[i];
			 evenseries++;
			}
             else{
			
              arr2[oddseries]=arr[i];
			  oddseries++;
			 }
	   	}
         
		 for (int i=0;i<arr1.length;i++ )
		 {
			  System.out.println("The even number is :>"+ arr1[i]);
		 }
		 for (int i=0;i<arr2.length;i++)
		{
			 System.out.println("The odd number is :>"+ arr2[i]);
		}
	}
}
