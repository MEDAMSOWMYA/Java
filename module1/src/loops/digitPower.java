package loops;

import java.util.Scanner;

public class digitPower 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number:"); //1467
	       Scanner s=new Scanner(System.in);
	       int num=s.nextInt();
	       int power=0,rev=0,rem=0,sum=0,count=0;
	       while(num!=0)
	       {
	    	   rem=num%10;
	    	   rev=rev*10+rem;
	    	   num=num/10;
	       }
	       System.out.println(rev);
	       while(rev!=0)
	       {
	    	   count++;
	    	   rem=rev%10;
	    	   power=(int)Math.pow(rem,count);
	    	   sum=sum+power;
	    	   rev=rev/10;
	       }
	       System.out.println(power);
	       System.out.println(sum);
	}

}
