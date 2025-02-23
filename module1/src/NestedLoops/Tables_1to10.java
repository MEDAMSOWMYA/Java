package NestedLoops;

public class Tables_1to10 {
	public static void main(String[] args)
	{
		for(int x=1;x<=10;x++)
		{
			int num=x,pro=0,start=1,end=10;
			for(;start<=end;start++)
			{
				pro=num*start;
				System.out.println(num+"x"+start+"="+pro);
			}
			System.out.println();
		}
	}

}
