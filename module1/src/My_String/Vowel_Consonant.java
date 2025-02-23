package My_String;

public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1=new String("hello");
        int vowel=0,consonant=0;
        for(int x=0;x<s1.length();x++)
        {
        	char c=s1.charAt(x);
        	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        	{
        		vowel++;
        		System.out.println(c+" is vowel");
        	}
        	else
        	{
        		consonant++;
        		System.out.println(c+" is consonant");
        	}
        }
        System.out.println(vowel);
        System.out.println(consonant);
	}

}
