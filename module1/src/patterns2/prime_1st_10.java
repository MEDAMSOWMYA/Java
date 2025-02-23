package patterns2;

public class prime_1st_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=31;x++)
		{
			int num=x,count=0,start=1,temp=num;
			for(;start<=num/2;start++)
			{
				if(num%start==0) {
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(temp);
			}
		}

	}

}
