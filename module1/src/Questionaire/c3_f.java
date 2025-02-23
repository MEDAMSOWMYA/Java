package Questionaire;

public class c3_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {34,78,5,23,34,78};
    int c[]=new int[a.length];
    for(int x=0;x<a.length;x++)
    {
    	int count=1;
    	if(c[x]==1)
    	{
    		continue;
    	}
    	for(int y=x+1;y<a.length;y++) {
    		if(a[x]==a[y])
    		{
    			count++;
    			c[x]=1;
    		}
    	}
    	if(count>1)
    		System.out.println(a[x]);
    }
	}

}
