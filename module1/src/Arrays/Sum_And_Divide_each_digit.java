package Arrays;

public class Sum_And_Divide_each_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]=new int[] {1,2,3,14,5};
		int c[]=new int[b.length];
		int sum=0,z=0;
		for(int x=0;x<b.length;x++) 
		{
			sum=sum+b[x];
		}
		System.out.println(sum);
		System.out.println();
		for(int x=0;x<b.length;x++)
		{
			z=sum/b[x];
			c[x]=z;
			System.out.println(c[x]);
		}

	}

}
