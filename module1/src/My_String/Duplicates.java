//duplicates in a string(char array) using toCharArray

package My_String;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s=new String("Hello all good morning");
    char a[]=s.toCharArray();  //['H','e','l','l',o',' '..........]
    char b[]=new char[a.length];
    int count=0;
    for(int x=0;x<a.length-1;x++)
    {
    	if(b[x]=='t')
    		continue;
    	for(int y=x+1;y<a.length-1;x++)
    	{
    		if(a[x]==a[y])
    		{
    			count++;
    			b[y]='t';
    		}
    	}
    	if(count>1)
    	{
    		System.out.println("duplicates found");
    	}
    }
	}

}
