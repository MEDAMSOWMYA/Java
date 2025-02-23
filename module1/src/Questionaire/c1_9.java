package Questionaire;

public class c1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {12,45,29,4,6,78};
    //                 0   1  2 3 4 5
    int b[]=new int[a.length/2];
    int c[]=new int[a.length/2];
    int d[]=new int[a.length];
    int y=0,z=0;
    for(int x=0;x<a.length;x++)
    {
    	if(x%2==0)
    	{
    		b[y]=a[x];
    		y++;
    	}
        else
    	{
    		c[z]=a[x];
    		z++;
    	}
    }
    System.out.println("b array(even index)");
    for(int temp: b)
    	System.out.println(temp);
    System.out.println("c array(Odd index)");
    for(int temp: c)
    	System.out.println(temp);
    System.out.println("b array descending");
    int t=0;
    for(int x=0;x<=b.length-2;x++)
    {
    	for(int i=x+1;i<b.length;i++)
    	{
    		if(b[x]<b[i])
    		{
    			t=b[x];
    			b[x]=b[i];
    			b[i]=t;
    			
    		}
    	}
    }
    for(int temp :b)
    	System.out.println(temp);
	System.out.println("c array ascending");
    int t1=0;
    for(int x=0;x<=c.length-2;x++)
    {
    	for(int i=x+1;i<c.length;i++)
    	{
    		if(c[x]>c[i])
    		{
    			t1=c[x];
    			c[x]=c[i];
    			c[i]=t1;
    			
    		}
    	}
    }
    for(int temp :c)
    	System.out.println(temp);
    System.out.println("Whole array");
    int m=0,n=0;
    for(int x=0;x<d.length;x++)
    {
    	if(x%2==0)
    	{
    		d[x]=b[m];
    		m++;
    	}
    	else
    	{
    		d[x]=c[n];
    		n++;
    	}
    }
    for(int temp:d)
    	System.out.println(temp);
	}
}
