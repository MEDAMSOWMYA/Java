package patterns2;

public class palindrome_1st_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int x=1;x<=111;x++)
        {
        	int num=x,rem=0,rev=0,temp=num;
        	while(num!=0)
        	{
        		rem=num%10;
        		rev=rev*10+rem;
        		num/=10;
        	}
        	if(temp==rev)
        	{
        		System.out.println(temp);
        	}
        }
	}

}
