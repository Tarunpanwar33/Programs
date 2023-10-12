class Fabiconic 
{
	public static void main(String[] args) 
	{
		int a= 0;
		int b =1;
		int count = 10;
 
 		System.out.println(a+""+b);
		for (int i=2;i<count;++i )
		{
			int sum = a+b;
				System.out.println(sum);

				a=b;
				 b =sum;


		}
		
	}
}
