//Sum of power of 3 of each digit of a number

package loops;

import java.util.Scanner;

public class SumOfPower3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:"); //134
     int num=sc.nextInt();
     int rem=0,sum=0,power=0;
     while(num!=0)
     {
    	 rem=num%10;
    	 power=(int)Math.pow(rem,3);
    	 sum=sum+power;
    	 num=num/10;
     }
     String temp = null;
	System.out.println("Sum of power of 3 of each digit of "+temp+" is "+sum);
	}

}
