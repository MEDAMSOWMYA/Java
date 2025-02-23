package Arrays;

public class Sum_And_Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int b[]=new int[] {11,2,3,4,5};
        int c[]=new int[b.length];
        int sum=0,res=0;
        for(int x=0;x<b.length;x++)
        {
        	sum=sum+b[x];
        }
        System.out.println(sum);
        System.out.println();
        for(int x=0;x<b.length;x++) 
        {
        	res=sum-b[x];
        	c[x]=res;
        	System.out.println(c[x]);
        }
        
	}

}
