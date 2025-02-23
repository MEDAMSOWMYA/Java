package Classes;

public class Object_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Method obj2=new Method();
        
        obj2.add();
        System.out.println(obj2.num);
        obj2.mul();
        obj2.sub();
        
        
	}

}
class Method
{
	int num=10;
	
	void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
	{
		System.out.println("Hello");
	}
	void mul()
	{
		System.out.println("Multiplication");
	}
	{
		System.out.println(num);
	}
	
}
