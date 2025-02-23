package loops;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=sc.nextInt(),num2=sc.nextInt();
        int start1=1,start2=1,count1=0,count2=0,diff=0;
        while(start1<=num1/2)
        {
        	if(num1%start1==0)
        	{
        		count1++;
        	}
        	start1++;
        }
        if(count1==1)
        {
        	System.out.println(num1+" is prime");
        }
        while(start2<=num2/2)
        {
        	if(num2%start2==0)
        	{
        		count2++;
        	}
        	start2++;
        }
        if(count2==1)
        {
        	System.out.println(num2+" is prime");
        }
        if(num1>num2)
        {
        	diff=num1-num2;
        }
        else
        {
        	diff=num2-num1;
        }
        if(diff==2)
        	System.out.println(num1+" and "+ num2+" are twin primes"); 
        else
        	System.out.println("Not twin primes");
	}

} 
