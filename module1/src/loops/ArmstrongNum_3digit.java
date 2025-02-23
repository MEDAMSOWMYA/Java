//Armstrong number valid for 3digit number only

package loops;

import java.util.Scanner;

public class ArmstrongNum_3digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a number:");
		   int num=sc.nextInt();
		   int rem=0,sum=0,power=0,temp=num;
		   while(num!=0)
		   {
			   rem=num%10;
			   power=(int)Math.pow(rem,3);
			   sum=sum+power;
			   num/=10;
		   }
		   System.out.println("Sum of power of 3 of each digit of "+temp+" is"+sum);
		   if(sum==temp)
			   System.out.println("Armstrong number");
		   else
			   System.out.println("Not an armstrong number");
	}

}
