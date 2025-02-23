// Sum of each digit of a number

package loops;

import java.util.Scanner;

public class SumOfExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:"); //1456
       int num=sc.nextInt();
       int rem=0,sum=0,temp=num;
       while(num!=0)
       {
    	   rem=num%10;
    	   sum=sum+rem;
    	   num/=10;
       }
       System.out.println("sum of each digit of "+temp+" is "+sum);
       
	}

}
