//12,56,34,23,67,76,32,75,90,345 
//print the above array in reverse order

package Questionaire;

public class c1_5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
        for(int x=a.length-1;x>=0;x--)
        {
        	System.out.println(a[x]);
        }
	}

}
