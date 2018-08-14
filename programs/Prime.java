class Prime
{

	boolean fun(int n)
	{
		int c;

		for(c=2;c<=n-1;c++)
		{
			if(n%c==0)
				return false;

		}
		return true;

	}

	public static void main(String arg[])
	{
		Prime obj=new Prime();
		System.out.println("no is prime:"+(obj.fun(8)));
	}
}