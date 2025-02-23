package Questionaire_String;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1=new String("Hello");
    System.out.println(System.identityHashCode(s1));
    String s2=new String("Hello");
    System.out.println(System.identityHashCode(s2));
    System.out.println(s1.equals(s2)); //hello==hello
    System.out.println(s1==s2); //1365202186!=212628335
	}
   //.equals compares the content of strings
   //== compares the address of strings
}
