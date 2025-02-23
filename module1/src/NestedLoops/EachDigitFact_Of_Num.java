package NestedLoops;

public class EachDigitFact_Of_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int num=145;num!=0;num/=10)
        {
           int rem=0,fact=1,start=1;
           rem=num%10;
           for(;start<=rem;start++)
           {
        	   fact=fact*start;
           }
           System.out.println(rem+"! is"+fact);
        }
	}

}
