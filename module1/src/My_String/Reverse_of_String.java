package My_String;

public class Reverse_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1=new String("Hello");
        System.out.println(s1.charAt(4));
        char c=s1.charAt(4);
        System.out.println(c);
        for(int x=s1.length()-1;x>=0;x--) {
        	System.out.println(s1.charAt(x));
        	
        }
	}

}
