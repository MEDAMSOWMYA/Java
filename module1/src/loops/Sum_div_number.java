package loops;

import java.util.Scanner;

public class Sum_div_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:"); //1234
        int num=sc.nextInt();
        int rem=0,sum=0,temp=num,rev=0,num2=0;
        while(num!=0)
        {
        	rem=num%10;
        	sum=sum+rem;
        	num/=10;
        }
        System.out.println("sum of digits "+sum);
        num=temp;
        while(num!=0)
        {
        	rem=num%10;
        	rev=rev*10+rem;
        	num/=10;
        }
        System.out.println("reverse of num "+rev);
        while(rev!=0)       //4321     432       43       4      0
        {
        	rem=rev%10;     //1         2         3       4       
        	num2=sum/rem;   //10/1=10  10/2=5   10/3=3   10/4=2
        	if(num!=0)
        		
        	rev/=10;        //432       43        4       0
        }  
	}
}
