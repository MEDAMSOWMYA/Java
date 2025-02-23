package patterns2;

public class Armstrong_1st_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int x=1;x<=1000000;x++)
       {
    	   int num=x,rem=0,power,sum=0,temp=num,count=0;
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
    		   sum=sum+power;
    		   num=num/10;
    	   }
       
       if(sum==temp)
    	   System.out.println(temp);
       }
	}

}
