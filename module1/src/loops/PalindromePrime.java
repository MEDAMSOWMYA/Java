package loops;

import java.util.Scanner;

public class PalindromePrime {

	public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   System.out.println("Enter a number:");
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();//121
       int rev=0,temp=num;
       while(num!=0)
       {
    	   int rem=num%10;
    	   rev=rev*10+rem;
    	   num=num/10;
       }
       System.out.println("Reverse number of "+temp+" is"+rev);
       num=temp;
       int start=1,count=0;
       while(start<=num/2) {
    	   if(num%start==0)
    	   {
    		   count++;
    	   }
    	   start++;
       }
       if(rev==temp && count==1)
       {
    	   System.out.println(temp+" is palindrome prime");
       }
       else if(rev==temp)
       {
    	   System.out.println(temp+" is palindrome but not prime");
       }
       else
       System.out.println(temp+" is prime but notpalindrome");
       
	}

}
