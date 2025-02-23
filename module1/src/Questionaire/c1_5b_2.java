//12,56,34,23,67,76,32,75,90,345 
//Divide the array into two halves
//i.Print the first half in reverse order and print the whole array
//ii.Print the second half in reverse order and print the whole array

package Questionaire;

public class c1_5b_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
        int b[]=new int[a.length/2];
        int c[]=new int[a.length/2];
        int d[]=new int[a.length];
        System.out.println("a array elements are: ");
        for(int x=0;x<a.length;x++)
        {
        	System.out.println(a[x]);
        }
        System.out.println("b array elements are: ");
        for(int x=0;x<b.length;x++)
        {
        	b[x]=a[x];
        	System.out.println(b[x]);
        }
        System.out.println("c array elements are: ");
        int sec_half=a.length;
        for(int x=0;x<c.length;x++)
        {
        	c[x]=a[sec_half-1];
        	System.out.println(c[x]);
        	sec_half--;
        }
        System.out.println("Whole array(d array)");
        int m=0,n=0;
        for(int x=0;x<d.length/2;x++)
        {
        	d[x]=b[x];
//        	m++;
        }
        for(int x=d.length/2;x<d.length;x++)
        {
        	d[x]=c[n];
        	n++;
        }
        for(int temp:d)
        	System.out.println(temp);

	}

}
