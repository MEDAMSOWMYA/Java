package Questionaire_String;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s=new String("Hello All");
    for(int x=s.length()-1;x>=0;x--)
    {
    	char c=s.charAt(x);
    	System.out.println(c);
    }
	}

}
