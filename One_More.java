class One_More
{
	public static void main(String[] args) 
	{
		int arr[]={1,4,6,32,7,5,};
		int evencount = 0;
		int oddcount = 0;

		for (int i =0;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
				System.out.println("The even number is "+arr[i]);
                evencount++;
            System.out.println("-----------------------");
			}

			else{
              	System.out.println("-----------------------");
             System.out.println("The odd number is "+arr[i]);
			 System.out.println("-----------------------");
			 oddcount++;
			} 
		}

		int arr1[]=new int[evencount];
		int arr2[]=new int[oddcount];

		int evenindex=0;
		int oddindex=0;
	
         for (int i=0;i<arr.length ;i++ )
         {
			 if (arr[i]%2==0)
			 {
			 
			 System.out.println("-----------------------");
			 arr1[evenindex]=arr[i];
			   evenindex++;
			 }

			 else{
				
				System.out.println("-----------------------");
				arr2[oddindex]=arr[i];
				oddindex++;
			 }
		 }
			 for (int i=0;i<arr1.length ;i++ )
			 {
				 System.out.println("-----------------------");
				 System.out.println("The even numbers are "+arr1[i]);
				
			 }

					for (int i=0;i<arr2.length ;i++ ){	

				 System.out.println("-----------------------");
				System.out.println("The odd numbers are "+arr2[i]);
				System.out.println("-----------------------");
			 }
         }
	}
	

