package NestedLoops;

import java.util.Scanner;

public class PrimeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num=sc.nextInt();      //18645
       int rem=0;
       while(num!=0)
       {
    	   rem=num%10;
    	   int count=0;
    	   for(int start=1;start<=rem;start++)
    	   {
    		   if(num%start==0)
    		   {
    			   System.out.println("Prime number");
    			   count++;
    		   }
    	   }
       }
       int count = 0;
	if(count==2)
       {
    	   System.out.println(rem);
       }
       num/=10;
	}

}
