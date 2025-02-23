package NestedLoops;

public class SumOfFactors_1to10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int x=1;x<=10;x++)
		{
			int num=x,start=1,sum=0;
			System.out.println("Factors of "+num+" are:");
			for(;start<=num;start++)
			{		
				if(num%start==0)
				{
					sum=sum+start;
					System.out.println(start);
				}
			}
			System.out.println("sum of factors of "+num+" is "+sum);
			System.out.println();
		}

	}

}
