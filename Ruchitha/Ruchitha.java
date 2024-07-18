import java.util.*;
class Exp
{
	public static void main(String s[])
	{
		int i,j,a;
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of i");
		i=x.nextInt();
		System.out.println("enter the value of j");
		j=x.nextInt();
		System.out.println("enter the case");
		a=x.nextInt();
		switch(a)
		{
			case 1:if(i%2==0)
				{
					System.out.println("the given number is even");
				}
				else
				{
					System.out.println("the given number id odd");
				}
				break;
			case 2:if(j%400==0 && j%100!=0 && j%4==0)
				{
					System.out.println("it is a leapyear");
				}
				else
				{
					System.out.println("it is not a leapyear");

				}
				break;
			default:System.out.println("bye");
				break;
		}
	}
}