package NestedLoops;

public class Prime_1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=100;x++)
		{ //1   2     1<=100
			int num=x,start=1,count=0;
			for(;start<=num/2;start++)  //1<=0.5f     
			{
				if(num%start==0)      
				{
					count++;
				}
			}
			if(count==1)
			System.out.println(num+" is prime");
		}

	}

}
