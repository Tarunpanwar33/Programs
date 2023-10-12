class Cheak 
{
	public static void main(String[] args) 
	{
        int arr[]={1,5,7,12,16};

		int num = 0;
		int num1=0;

		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
              System.out.println("The even number are "+arr[i]);
			  
			}

			else{

                 System.out.println("odd numbers are : "+arr[i]);
       

			}
		}

		int arr1[]=new int[num];
		int arr2[]=new int[num1];

	     int evenindex = 0;
		 int oddindex = 0;

		 for (int i=0;i<arr.length ;i++ )
		 {
			 if (arr[i]%2==0)
			 {
                arr1[evenindex]=arr[i];
                evenindex++;
			 }

			else{
              
                 arr2[oddindex]=arr[i];
                oddindex++;
			}
		 }

		    System.out.println("The even numbers is>>");
           for (int i=0;i<num ;i++ )
           {
			   System.out.println(arr1[i]);
           }
		    System.out.println("The odd numbers is>>");

		   for (int i=0;i<num1 ; i++)
		   {
			      System.out.println(arr2[i]);
		   }
		  
	}
}
