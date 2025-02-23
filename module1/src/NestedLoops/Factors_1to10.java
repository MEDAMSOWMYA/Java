package NestedLoops;

public class Factors_1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=10;x++)
		{
			int num=x,start=1;
			for(;start<=num;start++)
			{
				if(num%start==0)
					System.out.println(start);
			}
			System.out.println();
		}
		

	}

}
