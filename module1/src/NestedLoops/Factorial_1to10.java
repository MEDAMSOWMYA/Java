package NestedLoops;

public class Factorial_1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int x=1;x<=10;x++)
//		{
//			int num=x,fact=1;
//			for(;num>0;num--)
//			{
//				fact=fact*num;
//			}
//			System.out.println(x+"! is"+fact);
//		}
		
		
		for(int x=10;x>=1;x--)
		{
			int num=x,fact=1;
			for(;num>0;num--)
			{
				fact=fact*num;
			}
			System.out.println(x+"! is"+fact);
		}

	}

}
