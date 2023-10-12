class Fabiconic1 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int num1 = 1;
		int count =10;
		System.out.println(num+""+num1);

        for (int i=2;i<count;i++ )
        {
			int sum = num+num1;
           
		   		System.out.println(sum);

				num = num1;
				num1=sum;

        }
				
	
	}
}
