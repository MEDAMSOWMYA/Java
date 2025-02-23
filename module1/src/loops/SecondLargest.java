package loops;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:"); //128
	       Scanner s=new Scanner(System.in);
	       int num=s.nextInt();
	       int sec_lar=0,max=0,temp=num,rem=0;
	       while(num!=0)
	       {
	    	   rem=num%10;
	    	   if(rem>max)
	    	   {
	    		  max=rem;
	    	   }
	    	   num/=10;
	       }
	       num=temp;
	       while(num!=0)
	       {
	    	   rem=num%10;
	    	if(rem>sec_lar && rem!=max)
	    		   {
	    			   sec_lar=rem;
	    		   }
	    	   num=num/10;
	       }
	       System.out.println(sec_lar);
	}

}
