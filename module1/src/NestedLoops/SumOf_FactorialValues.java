package NestedLoops;

public class SumOf_FactorialValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=145;num!=0;num/=10)
        {
           int rem=0,fact=1,start=1,sum=0;
           rem=num%10;
           for(;start<=rem;start++)
           {
        	   fact=fact*start;
           }
           System.out.println(rem+"! is"+fact);
        }
	}

}
