package recursion;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		m.fib(0,1,0,1,10);
		m.fib1(0,1,0,1,10);

	}

}
class MyClass
{
	void fib(int a,int b,int sum,int start,int end)
	{         //0      1       0        1      10  
		      //1      1       1        2      10
		      //1      2       2        3      10
		      //2      3       3        4      10     
		for(;start<=end;start++)
		{
	    System.out.println(a);//0 //1 //1 
		sum=a+b;//1  //2  //3
		a=b;    //1  //1  //2
		b=sum;  //1  //2  //3
		}
	}
	void fib1(int a,int b,int sum,int start,int end)
	{
		if(start<=end)
		{
			System.out.println(a);
			sum=a+b;
		    fib1(b,sum,sum,start+1,end);
		}
	}
	
}
