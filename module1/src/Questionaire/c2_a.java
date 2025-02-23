package Questionaire;

public class c2_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {10,20,30,40,50,60};
    int b[]=new int[a.length];
    System.out.println("a array elements are:");
    for(int x=0;x<a.length;x++)
    {
    	System.out.print(a[x]+"\t");
    }
    System.out.println();
    for(int x=0;x<a.length;x++)
    {
    	b[x]=a[x];
    }
    System.out.println("b array elements are: ");
    for(int temp: b)
     System.out.print(temp+"\t");
	}

}
