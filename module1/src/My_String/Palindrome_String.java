package My_String;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=new String("madam");
        String rev=" ".trim();     //rev="";
        for(int x=s.length()-1;x>=0;x--)
        {
        	char c=s.charAt(x); //m        a          d             a             m
        	rev=rev+c;         //""+m   rev=m+a=>ma  rev=ma+d=>mad  mad+a=>mada  mada+m=>madam       	
        }
        if(rev.equals(s))
        {
        	System.out.println(s+" is palindrome");
        }
        else
        {
        	System.out.println(s+" is not a palindrome");
        }
	}

}
