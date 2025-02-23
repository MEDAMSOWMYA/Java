package Questionaire;

public class c2_g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[] {10,29,9,45,67,80};
    int b[]=new int[a.length/2],y=0; //even index elements--->(b)
    int c[]=new int[a.length/2],z=0; //odd index  elements--->(c)
    int d[]=new int[a.length];
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
    int t=0,t1=0;
    for(int x=0;x<=b.length-2;x++)
    {
    	for(int i=x+1;i<b.length;i++)
    	{
    		if(b[x]>b[i])
    		{
    			t=b[x];
    			b[x]=b[i];
    			b[i]=t;
    		}
    	}
    }
    for(int x=0;x<=c.length-2;x++)
    {
    	for(int i=x+1;i<c.length;i++)
    	{
    		if(c[x]<c[i])
    		{
    			t1=c[x];
    			c[x]=c[i];
    			c[i]=t1;
    		}
    	}
    }
    System.out.println("Even indexd elements in ascending order");
    for(int temp : b)
    	System.out.println(temp);
    System.out.println("Odd indexd elements in descending order");
    for(int temp: c)
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
    for(int temp : d)
    	System.out.println(temp);
	}

}
