package Classes;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sample obj1=new Sample();
       System.out.println("First Object Creation");
       System.out.println(obj1.num1);
       System.out.println(obj1.num2);
       System.out.println(obj1.ch);
       obj1.num3=50;
       System.out.println(obj1.num3);
       System.out.println(obj1.num4);
	}

}
class Sample
{
	int num1;
	double num2;
	char ch;
	int num3;
	int num4=150;
}
