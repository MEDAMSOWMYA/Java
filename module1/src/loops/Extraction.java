package loops;

import java.util.Scanner;

public class Extraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("Enter a number:");
	   
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       while(num!=0)
       {
    	   int rem=num%10;
    	   System.out.println(rem);
    	   num/=10;
       }
	}

}
