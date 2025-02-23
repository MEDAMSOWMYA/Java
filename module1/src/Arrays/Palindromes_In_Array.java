package Arrays;

public class Palindromes_In_Array {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int b[]=new int[] {2,121,87,9,5,546,99,252};
        for(int x=0;x<b.length;x++)
        {
        	int num=b[x],temp=num,rev=0;
        	while(num!=0)
        	{
        		int rem=num%10;
        		rev=rev*10+rem;
        		num/=10;
        	}
        	if(rev==temp)
        	System.out.println(rev);
        }
	}

}
