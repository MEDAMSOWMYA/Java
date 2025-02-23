package Classes;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sample3 ob=new Sample3();
        ob.palindrome();
        ob.prime();
        ob.even_odd();
	}

}
class Sample3
{
	int num=121;
	void palindrome()
	{
		int rem=0,rev=0,temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}	
		if(rev==num)
		{
			System.out.println(num+" is palindrome");
		}
		else
		{
			System.out.println(num+" is not a palindrome");
		}
	}
	void prime()
	{
		int count=0;
		for(int start=1;start<=num/2;start++)
		{
			if(num%start==0)
			{
				count++;
			}
		}
		if(count==1)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not a prime");
	}
	void even_odd()
	{
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
	}
	
}
