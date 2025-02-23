package NestedLoops;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=100;x++)
		{
			int num=x,rem=0,rev=0,temp=num;
			for(;num!=0;num/=10)
			{
				rem=num%10;
				rev=rev*10+rem;
			}
			if(rev==temp)
				System.out.println(temp+" is palindrome");
		}

	}

}
