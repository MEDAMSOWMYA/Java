package NestedLoops;

public class No_Of_digits_1to1000
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        for(int x=1;x<=1000;x++)
        {
		int num=x,count=0,temp=num;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println("No of digits in "+temp+" is "+count);
	}
}
}