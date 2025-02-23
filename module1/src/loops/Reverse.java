package loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:"); //1467
	       Scanner s=new Scanner(System.in);
	       int num=s.nextInt();
	       int rev=0,rem=0,temp=num;
	       while(num!=0)
	       {
	    	   rem=num%10;
	    	   rev=rev*10+rem;
	    	   num=num/10;
	       }
	       System.out.println("reverse of "+temp+" is "+rev);
	       
	}

}
