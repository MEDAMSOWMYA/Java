package Arrays;

import java.util.Scanner;

public class Runtime_Compile_Initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runtime intialization
		
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter array Elements:");
        for(int x=0;x<a.length;x++)
        {
        	a[x]=sc.nextInt();
        }
        System.out.println("a array elements are:");
        for(int x=0;x<a.length;x++)
        {
        	System.out.println(a[x]);
        }
        //compile time initialization
        
        int b[]=new int[] {1,5,8,4,6,3};
        System.out.println("b array elements are:");
        for(int x=0;x<b.length;x++)
        {
        	System.out.println(b[x]);
        }
	}

}
