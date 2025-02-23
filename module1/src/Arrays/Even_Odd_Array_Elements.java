package Arrays;

public class Even_Odd_Array_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[] {12,13,13,16,10,9};
        System.out.println("Even elements are: ");
        for(int x=0;x<a.length;x++)
        {
        	if(a[x]%2==0)
        	{
        		System.out.println(a[x]);
        	}
        }
        System.out.println("Odd elements are: ");
        for(int x=0;x<a.length;x++)
        {
        	if(a[x]%2!=0)
        	{
        		System.out.println(a[x]);
        	}
        }
	}

}
