//Print the indices which are divisible by 3

package Questionaire;

public class c1_5f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
    System.out.println("Indices which are divisible by 3");
    for(int x=0;x<a.length;x++)
    {
    	if(x%3==0)
    	{
    		System.out.println(x);
    	}
    }
    }

}
