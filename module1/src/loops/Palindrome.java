package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0,rev=0,temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		num=temp;
		if(temp==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		

	}

}
