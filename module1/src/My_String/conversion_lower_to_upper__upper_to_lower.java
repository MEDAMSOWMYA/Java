package My_String;

public class conversion_lower_to_upper__upper_to_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=new String("HeLlo AlL gOod MornINg");
        for(int x=0;x<s.length();x++)
        {
        	char c=s.charAt(x);
        	if(c>='A' && c<='Z')
        	{
        		int num=c+32;
        		char c1=(char)num;
        		System.out.print(c1);
        	}
        	else if(c>='a' && c<='z')
        	{
        		int num2=c-32;
        		char c2=(char)num2;
        		System.out.print(c2);
        	}
        	else
        	{
        		System.out.print(" ");
        	}
        }
	}

}
