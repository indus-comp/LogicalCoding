package paractice;
class Pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i+=2)
		{
			System.out.println("");
			for(int j=1;j<=i;j++)
			System.out.print("*"); 
		}
		System.out.println("");
		for(int i=3;i>=0;i-=2)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
