
// Hel#104@5A$L^2GO*04)d&MO7Rn%N!gG
package My_String;

public class caps_small_symbols_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1=new String("Hel#104@5A$L^2GO*04)d&MO7Rn%N!gG");
        int caps=0,smalls=0,digits=0,symbols=0;
        for(int x=0;x<s1.length();x++)
        {
        	char c=s1.charAt(x);
        	if(c>='A' && c<='Z')
        	{   
        		caps++;
        		System.out.println(c+ " is capital");
        	}
        	else if(c>='a' && c<='z')
        	{
        		smalls++;
        		System.out.println(c+" is small");
        	}
        	else if(c>='0' && c<='9')
        	{
        		digits++;
        		System.out.println(c+" is a digit");
        	}
        	else
        	{
        		symbols++;
        		System.out.println(c+" is a special symbol");
        	}
        }
        System.out.println("caps are "+caps);
        System.out.println("smalls are "+smalls);
        System.out.println("digits are "+digits);
        System.out.println("symbols are "+symbols);
	}

}
