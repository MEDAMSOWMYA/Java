package Addtion;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        add obj=new add();
        obj.add();
        obj.add1();
        obj.add2(10,5,0);
	}

}
class add
{
	int a=10,b=5,sum=a+b;
	void add() 
	{
		System.out.println("Addition of"+a+" and "+b+" is "+sum);
	}
	int add1()
	{
		System.out.println("Addition of"+a+" and "+b+" is "+sum);
		return sum;
	}
	int add2(int a,int b,int sum)
	{
		return add2(a,b,a+b);
	}
}

