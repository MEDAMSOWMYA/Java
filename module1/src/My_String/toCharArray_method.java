package My_String;

import java.util.Arrays;

public class toCharArray_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=new String("Hello all");
        char a[]=s.toCharArray();
        for(char temp:a)
        {
        	System.out.println(temp);
        }
        System.out.println();
        //for sorting
        Arrays.sort(a);
        for(char temp1:a)
        {
        	if(temp1!=' ')
        	System.out.println(temp1); 
        }
        System.out.println("--------------------");
        
        //No of digits in a string
        
        String s1=new String("He12L4L90a2L5L");
        char b[]=s1.toCharArray();
        int count=0;
        for(int x=0;x<b.length;x++)
        {
        	System.out.println(b[x]);
        	if(b[x]>='0' && b[x]<='9')
        	{
        		count++;
        	}
        }
        System.out.println("No of digits in a string "+count);
	}

}
