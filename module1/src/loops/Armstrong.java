package loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt(); //1634
		int rem=0,count=0,power=0,temp=num,sum=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=temp;
		while(num!=0)
		{   
			rem=num%10;
			power=(int)Math.pow(rem,count);
			sum+=power;
			num/=10;
		}
		if(sum==temp)
		    System.out.println("Armstrong Number");
		else
			System.out.println("Not an armstrong number");
	}

}
