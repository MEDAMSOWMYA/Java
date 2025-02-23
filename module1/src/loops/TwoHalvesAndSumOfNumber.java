package loops;

import java.util.Scanner;

public class TwoHalvesAndSumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();  //123456
	    int start=1,count=0,count_half=0,temp=num,div=0,first_half=0,sec_half=0;
	    while(num!=0) {
	    	count++;
	    	num/=10;
	    }
	    System.out.println("No of digits "+count);
	    count_half=count/2;
	    div=(int)Math.pow(10,count_half);
	    num=temp;
	    first_half=num/div;
	    sec_half=num%div;
	    System.out.println(first_half+sec_half);
	    
	    
	    
	    

//		System.out.println(num%1000);
//		System.out.println(num/1000);
		
		

	}

}
