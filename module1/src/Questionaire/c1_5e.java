//elements which are divisible by 4


package Questionaire;

public class c1_5e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
    System.out.println("Elements which are divisible by 4");
    for(int x=0;x<a.length;x++)
    {
    	if(a[x]%4==0)
    	{
    		System.out.println(a[x]);
    	}
    }
	}

}
