package Arrays;

public class Sum_Of_Even_Product_of_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]=new int[] {10,13,16,2,54};
		int sum=0,prod=1;
        for(int x=0;x<b.length;x++)
        {
        	if(b[x]%2==0)
        	{
        		sum=sum+b[x];
        	}
        	else
        	{
        		prod=prod*b[x];
        	}
        }
        System.out.println("Even sum is"+sum);
        System.out.println("Odd product is"+prod);
	}

}
