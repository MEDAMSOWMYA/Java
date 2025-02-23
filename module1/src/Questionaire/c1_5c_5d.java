//even and odd indexed elements

package Questionaire;

public class c1_5c_5d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
        //                 0  1  2  3  4  5
        System.out.println("Even indexed elements are: ");
        for(int x=0;x<a.length;x++)
        {
        	if(x%2==0)
        	{
        		System.out.println(a[x]);
        	}
        }
        System.out.println("Odd indexed elements are: ");
        for(int x=0;x<a.length;x++)
        {
        	if(x%2!=0)
        	{
        		System.out.println(a[x]);
        	}
        }
	}

}
