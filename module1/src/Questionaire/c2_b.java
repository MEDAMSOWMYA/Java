package Questionaire;

public class c2_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {10,20,30,40,50,60};
    int b[]=new int[a.length];
    System.out.println("b array elements in reverse order of array 'a' ");
    int y=a.length;
    for(int x=0;x<a.length;x++)
    {
    	b[x]=a[y-1];
    	y--;
    }
    for(int temp:b)
    	System.out.println(temp);
	}

}
