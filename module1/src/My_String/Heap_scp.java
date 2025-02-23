package My_String;

public class Heap_scp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="hello";
    System.out.println("s1 "+System.identityHashCode(s1));
    String s2="hello";
    System.out.println("s2 "+System.identityHashCode(s2));
    String s3="hello";
    System.out.println("s3 "+System.identityHashCode(s3));
    String s4=new String("hello");
    System.out.println("s4 "+System.identityHashCode(s4));
    String s5=new String("hello");
    System.out.println("s5 "+System.identityHashCode(s5));
    System.out.println(s1==s2);
    System.out.println(s2==s3);
    System.out.println(s4==s5);
    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s4));
    System.out.println(s4.equals(s5));
    System.out.println(s1.compareTo(s4));
	}
	//==       --> reference(address) comparision
	//.equals  --> content comparision

}
