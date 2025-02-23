package loops;

import java.util.Scanner;

public class Max_digit {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int num=sc.nextInt();
     int max=0,rem=0,temp=num;
     while(num!=0)
     {
    	 rem=num%10;
    	 if(rem>max)
    	 {
    		 max=rem;
    	 }
    		 num/=10;
     }
     System.out.println("Maximum digit of a "+temp+" is "+max);
	}
}
